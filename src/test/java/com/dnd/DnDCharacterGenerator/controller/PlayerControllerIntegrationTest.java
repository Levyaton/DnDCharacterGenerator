package com.dnd.DnDCharacterGenerator.controller;

import com.dnd.DnDCharacterGenerator.BaseIntegrationTest;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.FeyAncestry;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.Nightvision;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.Trance;
import com.dnd.DnDCharacterGenerator.persistance.PlayerDao;
import com.dnd.DnDCharacterGenerator.persistance.PlayerRepository;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.dnd.DnDCharacterGenerator.domain.Language.*;
import static com.dnd.DnDCharacterGenerator.domain.Skill.PERCEPTION;
import static com.dnd.DnDCharacterGenerator.domain.Weapon.*;
import static com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip.ACID_SPLASH;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class PlayerControllerIntegrationTest extends BaseIntegrationTest{
    @Test
    void testCreatePlayerAndCheckDatabase() throws Exception {
        Given();
        String playerJson = """
                {
                  "name": "John Doe",
                  "race": {
                    "type": "highElf",
                    "cantrip": "ACID_SPLASH",
                    "extraLanguage": "DWARVISH"
                  }
                }
                """.trim();

        When("I create a player");
        mockMvc.perform(post("/player")
                        .contentType("application/json")
                        .content(playerJson));

        Then("I can find the player in the database");
        PlayerDao playerDao = playerRepository.findByName("John Doe");
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(playerDao).isNotNull();
        softly.assertThat(playerDao.getName()).isEqualTo("John Doe");
        softly.assertThat(playerDao.getRaceJsonType()).isEqualTo("HighElf");

        softly.assertThat(playerDao.getStrength()).isEqualTo(0);
        softly.assertThat(playerDao.getDexterity()).isEqualTo(2);
        softly.assertThat(playerDao.getConstitution()).isEqualTo(0);
        softly.assertThat(playerDao.getIntelligence()).isEqualTo(1);
        softly.assertThat(playerDao.getWisdom()).isEqualTo(0);
        softly.assertThat(playerDao.getCharisma()).isEqualTo(0);

        var acidSplash = spellbook.getSpellById(ACID_SPLASH.getId());
        playerDao.getCantrips().forEach(spell -> assertThat(spell, samePropertyValuesAs(acidSplash)));
        softly.assertThat(playerDao.getSpells().size()).isEqualTo(0);
        List<Ability> genericAbilities = new ArrayList<>(playerDao.getGenericAbilities());
        softly.assertThat(haveSameProperties(genericAbilities.get(0), new Trance())).isTrue();
        softly.assertThat(haveSameProperties(genericAbilities.get(1), new FeyAncestry())).isTrue();
        softly.assertThat(haveSameProperties(genericAbilities.get(2), new Nightvision())).isTrue();
        softly.assertThat(playerDao.getDamageAbilities().size()).isEqualTo(0);
        softly.assertThat(playerDao.getWeaponProficiencies()).containsExactlyInAnyOrder(LONGBOW, SHORTSWORD, SHORTBOW, LONGSWORD);
        softly.assertThat(playerDao.getArmourProficiencies().size()).isEqualTo(0);
        softly.assertThat(playerDao.getProficiencies()).containsExactlyInAnyOrder(PERCEPTION);
        softly.assertThat(playerDao.getLanguages()).containsExactlyInAnyOrder(COMMON, DWARVISH, ELVISH);

        softly.assertAll();
    }
}
