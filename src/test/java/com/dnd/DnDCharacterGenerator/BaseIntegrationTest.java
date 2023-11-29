package com.dnd.DnDCharacterGenerator;

import com.dnd.DnDCharacterGenerator.domain.spells.Spellbook;
import com.dnd.DnDCharacterGenerator.persistance.PlayerRepository;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.lang.reflect.Field;
import java.util.Objects;

@SpringBootTest
@AutoConfigureMockMvc
public class BaseIntegrationTest {
    @Autowired
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    protected MockMvc mockMvc;
    @Autowired
    protected PlayerRepository playerRepository;
    @Autowired
    protected Spellbook spellbook;

    @BeforeEach
    void setUp() {
        // Setup code if needed
    }

    @AfterEach
    void tearDown() {
        playerRepository.deleteAll();
    }
    protected boolean haveSameProperties(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) return false;

        for (Field field : obj1.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value1 = field.get(obj1);
                Object value2 = field.get(obj2);
                if (!Objects.equals(value1, value2)) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field values", e);
            }
        }
        return true;
    }

    public static void Given(String description) {}
    public static void Given() {}

    public static void When(String description) {}
    public static void When() {}

    public static void Then(String description) { }
    public static void Then() { }
}
