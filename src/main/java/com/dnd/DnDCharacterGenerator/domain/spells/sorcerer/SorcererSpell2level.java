package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell2level {
    AGANAZZAR_S_SCORCHER(4),
    ALTER_SELF(7),
    BLINDNESS_DEAFNESS(41),
    BLUR(43),
    CLOUD_OF_DAGGERS(59),
    CROWN_OF_MADNESS(93),
    DARKNESS(97),
    DARKVISION(98),
    DETECT_THOUGHTS(107),
    DUST_DEVIL(123),
    EARTHBIND(125),
    ENHANCE_ABILITY(130),
    ENLARGE_REDUCE(131),
    GUST_OF_WIND(188),
    HOLD_PERSON(202),
    INVISIBILITY(220),
    KNOCK(222),
    LEVITATE(227),
    MAXIMILIAN_S_EARTHEN_GRASP(250),
    MIRROR_IMAGE(261),
    MISTY_STEP(263),
    PHANTASMAL_FORCE(280),
    PYROTECHNICS(304),
    SCORCHING_RAY(320),
    SEE_INVISIBILITY(323),
    SHATTER(329),
    SNILLOC_S_SNOWBALL_SWARM(341),
    SPIDER_CLIMB(346),
    SUGGESTION(356),
    WARDING_WIND(397),
    WEB(401),
;
    private final int id;
    SorcererSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
