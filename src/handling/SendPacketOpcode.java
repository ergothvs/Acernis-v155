package handling;

import constants.ServerConfig;
import tools.FileoutputUtil;
import tools.HexTool;

public enum SendPacketOpcode implements WritableIntValueHolder {

    // General
    MTS_OPERATION((short) 0x7EFF),
    //Login
    LOGIN_STATUS((short) 0x00),
    SEND_LINK((short) 0x01),
    LOGIN_SECOND((short) 0x02),
    CHANNEL_SELECTED((short) 0x02),
    PIC_RESPONSE((short) 0x19),
    SERVERSTATUS((short) 0x04),
    GENDER_SET((short) 0x04),
    PIN_OPERATION((short) 0x05),
    PIN_ASSIGNED((short) 0x06),
    ALL_CHARLIST((short) 0x07),
    SERVERLIST((short) 0x09),
    PING((short) 0x11),
    AUTH_RESPONSE((short) 0x15),
    CHARLIST((short) 0x0A),
    SERVER_IP((short) 0x0B),
    CHAR_NAME_RESPONSE((short) 0x0C),
    ADD_NEW_CHAR_ENTRY((short) 0x0D),
    DELETE_CHAR_RESPONSE((short) 0x0E),
    BOSSPVP_REGISTER((short) 0x0F),
    CHANGE_CHANNEL((short) 0x10),
    CS_USE((short) 0x12),
    HACKSHIELD((short) 0x14),
    REQUEST_HWID((short) 0x16),
    RELOG_RESPONSE((short) 0x17),
    REGISTER_PIC_RESPONSE((short) 0x1A),
    ENABLE_RECOMMENDED((short) 0x1A),
    SEND_RECOMMENDED((short) 0x1B),
    PART_TIME((short) 0x1E),
    SPECIAL_CREATION((short) 0x20),
    JOB_ORDER((short) 0x21),
    SECONDPW_ERROR((short) 0x22),
    // Channel
    // CWvsContext
    INVENTORY_OPERATION((short) 0x23),//
    INVENTORY_GROW((short) 0x24),//
    UPDATE_STATS((short) 0x25),//24
    GIVE_BUFF((short) 0x26),//
    CANCEL_BUFF((short) 0x27),//
    TEMP_STATS((short) 0x28),//
    TEMP_STATS_RESET((short) 0x29),//
    UPDATE_SKILLS((short) 0x2A),//
    UPDATE_STOLEN_SKILLS((short) 0x2B),//
    TARGET_SKILL((short) 0x2C),//
    FAME_RESPONSE((short) 0x2D),//
    SKILL_USE((short) 0x2F),
    SHOW_STATUS_INFO((short) 0x33),//32
    FULL_CLIENT_DOWNLOAD((short) 0x34),//
    SHOW_NOTES((short) 0x35),//
    TROCK_LOCATIONS((short) 0x36),//
    LIE_DETECTOR((short) 0x37),//
    REPORT_RESPONSE((short) 0x3A),//
    REPORT_TIME((short) 0x3B),
    REPORT_STATUS((short) 0x3C),//
    UPDATE_MOUNT((short) 0x3D),//3C
    SHOW_QUEST_COMPLETION((short) 0x3E),//
    SEND_TITLE_BOX((short) 0x3F),
    USE_SKILL_BOOK((short) 0x40),//
    SP_RESET((short) 0x41),//
    AP_RESET((short) 0x42),//
    DISTRIBUTE_ITEM((short) 0x43),//
    EXPAND_CHARACTER_SLOTS((short) 0x44),//
    FINISH_GATHER((short) 0x4A),//
    FINISH_SORT((short) 0x4B),//
    EXP_POTION((short) 0x44),//TODO 155
    REPORT_RESULT((short) 0x4E),//
    TRADE_LIMIT((short) 0x4F),//
    UPDATE_GENDER((short) 0x50),//
    BBS_OPERATION((short) 0x51),//
    CHAR_INFO((short) 0x54),//53
    PARTY_OPERATION((short) 0x55),//54
    MEMBER_SEARCH((short) 0x56),//
    PARTY_SEARCH((short) 0x57),//
    BOOK_INFO((short) 0x5A),//
    CODEX_INFO_RESPONSE((short) 0x5B),//
    EXPEDITION_OPERATION((short) 0x5C),//
    BUDDYLIST((short) 0x5D),//
    GUILD_OPERATION((short) 0x5F),//
    ALLIANCE_OPERATION((short) 0x60),//
    SPAWN_PORTAL((short) 0x61),///
    MECH_PORTAL((short) 0x62),//
    ECHO_MESSAGE((short) 0x63),//
    SERVERMESSAGE((short) 0x64),//
    ITEM_OBTAIN((short) 0x69),//TODO v155
    PIGMI_REWARD((short) 0x6C),//
    OWL_OF_MINERVA((short) 0x6D),//TODO v155
    OWL_RESULT((short) 0x6E),//TODO v155
    ENGAGE_REQUEST((short) 0x6F),//
    ENGAGE_RESULT((short) 0x70),//
    PET_LOOT_STATUS((short) 0x71),//
    PET_FEED_STATUS((short) 0x72),//
    WEDDING_GIFT((short) 0x999),//
    WEDDING_MAP_TRANSFER((short) 0x71),//
    FUSION_ANVIL((short) 0x72),//
    USE_CASH_PET_FOOD((short) 0x73),//
    YELLOW_CHAT((short) 0x74),//
    SHOP_DISCOUNT((short) 0x75),//
    CATCH_MOB((short) 0x76),//
    MAKE_PLAYER_NPC((short) 0x77),//
    PLAYER_NPC((short) 0x78),//0
    DISABLE_NPC((short) 0x79),//
    GET_CARD((short) 0x7B),//
    CARD_UNK((short) 0x7D),//
    CARD_SET((short) 0x7E),//
    BOOK_STATS((short) 0x7F),//
    UPDATE_CODEX((short) 0x80),//
    CARD_DROPS((short) 0x82),//
    CHANGE_HOUR((short) 0x83),//
    RESET_MINIMAP((short) 0x84),//
    FAMILIAR_INFO((short) 0x84),//81
    OPEN_FAMILY((short) 0x92),//143
    FAMILY_MESSAGE((short) 0x8E),
    FAMILY_INVITE((short) 0x999),
    FAMILY_JUNIOR((short) 0x93),//90
    SENIOR_MESSAGE((short) 0x94),//91
    FAMILY((short) 0x97),//94
    REP_INCREASE((short) 0x98),//95
    FAMILY_LOGGEDIN((short) 0x99),//96
    FAMILY_BUFF((short) 0x9A),//97
    FAMILY_USE_REQUEST((short) 0x9B),//98
    CONSULT_UPDATE((short) 0x85),//
    CLASS_UPDATE((short) 0x86),//
    WEB_BOARD_UPDATE((short) 0x87),//
    SESSION_VALUE((short) 0x88),//
    PARTY_VALUE((short) 0x89),//
    MAP_VALUE((short) 0x8A),//
    EXP_BONUS((short) 0x8B),//
    POTION_BONUS((short) 0x8C),//
    SEND_PEDIGREE((short) 0x8E),//
    LEVEL_UPDATE((short) 0x99),//
    MARRIAGE_UPDATE((short) 0x9A),//
    JOB_UPDATE((short) 0x9B),//
    MAPLE_TV_MSG((short) 0x9C),//
    POPUP2((short) 0x9D),//
    CANCEL_NAME_CHANGE((short) 0x9E),//
    CANCEL_WORLD_TRANSFER((short) 0x9F),//
    CLOSE_HIRED_MERCHANT((short) 0xA0),//
    GM_POLICE((short) 0xA1),//
    TREASURE_BOX((short) 0xA2),//
    NEW_YEAR_CARD((short) 0xA3),//
    RANDOM_MORPH((short) 0xA4),//
    CANCEL_NAME_CHANGE_2((short) 0xA6),//
    SLOT_UPDATE((short) 0xA9),//
    FOLLOW_REQUEST((short) 0xAA),//
    TOP_MSG((short) 0xAC),//
    MID_MSG((short) 0xAE),//
    CLEAR_MID_MSG((short) 0xB0),//
    SPECIAL_MSG((short) 0xB1),//
    MAPLE_ADMIN_MSG((short) 0xB1),//
    CAKE_VS_PIE_MSG((short) 0xB2),//
    GM_STORY_BOARD((short) 0xB3),//
    INVENTORY_FULL((short) 0xB4),//
    ZERO_STATS((short) 0xB6),//
    UPDATE_JAGUAR((short) 0xBD),//
    YOUR_INFORMATION((short) 0xB8),//TODO v155
    FIND_FRIEND((short) 0x999),//TODO v155
    VISITOR((short) 0xBA),//TODO v155
    PINKBEAN_CHOCO((short) 0xB9),//TODO v155
    PAM_SONG((short) 0xBC),//TODO v155
    AUTO_CC_MSG((short) 0xBE),//TODO v155
    DISALLOW_DELIVERY_QUEST((short) 0xBE),//TODO v155
    ULTIMATE_EXPLORER((short) 0xBF),//
    SPECIAL_STAT((short) 0xC0),//
    UPDATE_IMP_TIME((short) 0xC1),//
    ITEM_POT((short) 0xC2),//
    MULUNG_MESSAGE((short) 0xC5),//
    GIVE_CHARACTER_SKILL((short) 0xC6),//
    MULUNG_DOJO_RANKING((short) 0xCC),//
    REPLACE_SKILLS((short) 0xCF),//
    UPDATE_INNER_ABILITY((short) 0xD0),//
    EQUIP_STOLEN_SKILL((short) 0xD1),//
    INNER_ABILITY_MSG((short) 0xD2),//
    ENABLE_INNER_ABILITY((short) 0xD3),//
    DISABLE_INNER_ABILITY((short) 0xD4),//
    UPDATE_HONOUR((short) 0xD5),//
    AZWAN_UNKNOWN((short) 0xD6),//
    AZWAN_RESULT((short) 0xD7),//
    AZWAN_KILLED((short) 0xD8),//
    CIRCULATOR_ON_LEVEL((short) 0xDA),//
    SILENT_CRUSADE_MSG((short) 0xDB),//
    SILENT_CRUSADE_SHOP((short) 0xDD),//
    MAPLE_POINT((short) 0xEB),//
    SET_OBJECT_STATE((short) 0xEC),//
    POPUP((short) 0xED),//
    MINIMAP_ARROW((short) 0xF2),//
    UNLOCK_CHARGE_SKILL((short) 0xF8),//
    LOCK_CHARGE_SKILL((short) 0xF9),//
    EVOLUTION_UI((short) 0xFC),//
    BOSSPVP_SKILL_UI((short) 0xFD),//
    CANDY_RANKING((short) 0xFE),//
    DISPLAY_GUILD_SEARCH((short) 0xFF),//
    AVATAR_MEGA_RESULT((short) 0x109),//
    AVATAR_MEGA((short) 0x10A),//
    AVATAR_MEGA_REMOVE((short) 0x10B),//
    ATTENDANCE((short) 0x10C),//
    MESSENGER_OPEN((short) 0x10D),//
    MESSENGER_RANK((short) 0x10E),//
    EVENT_CROWN((short) 0x110),//
    BOSSPVP_FOUND((short) 0x12E),//
    BOSSPVP_SEARCH((short) 0x130),//
    TOWER_OF_OZ_RANKING((short) 0x135),
    TOWER_OF_OZ_FRIEND_RANKING((short) 0x136),
    SPELL_TRACE_UI((short) 0x134),//
    PQ_RANKING((short) 0x137),//
    MAGIC_WHEEL((short) 0x147),//
    REWARD((short) 0x148),//
    SKILL_MACRO((short) 0x149),//
    //CWvsContext [END]
    //CField
    WARP_TO_MAP((short) 0x14A),//149
    FARM_OPEN((short) 0x14B),//14A
    CS_OPEN((short) 0x14D),//14C
    REMOVE_BG_LAYER((short) 0x14E),//14D
    CHANGE_BACKGROUND((short) 0x14F),//14E
    RESET_SCREEN((short) 0x14F),//14E
    MAP_BLOCKED((short) 0x151),//150
    SERVER_BLOCKED((short) 0x152),//151
    PARTY_BLOCKED((short) 0x153),//152
    SHOW_EQUIP_EFFECT((short) 0x154),//153
    MULTICHAT((short) 0x157),//156
    NEWCHAT((short) 0x158),//157
    WHISPER((short) 0x159),//158
    SPOUSE_CHAT((short) 0x15B),//15a
    BOSS_ENV((short) 0x15C),//15B
    MOVE_ENV((short) 0x15D),//15C
    UPDATE_ENV((short) 0x15E),//15D
    MAP_EFFECT((short) 0x15F),//15E
    CASH_SONG((short) 0x160),//15F
    GM_EFFECT((short) 0x161),//161
    GM_EFFECT_EXTRA((short) 0x162),
    OX_QUIZ((short) 0x163),//163
    GMEVENT_INSTRUCTIONS((short) 0x164),//164
    CLOCK((short) 0x165),//165
    BOAT_MOVE((short) 0x999),//142
    BOAT_STATE((short) 0x999),//143
    STOP_CLOCK((short) 0x16C),//16B
    ARIANT_SCOREBOARD((short) 0x16E),//16D
    PYRAMID_UPDATE((short) 0x16F),//16E
    PYRAMID_RESULT((short) 0x170),//16F
    QUICK_SLOT((short) 0x171),//170
    MOVE_PLATFORM((short) 0x176),//175
    PYRAMID_KILL_COUNT((short) 0x178),//177
    PVP_INFO((short) 0x999),//154
    DIRECTION_STATUS((short) 0x17A),//179
    GAIN_FORCE((short) 0x17B),//17A
    ACHIEVEMENT_RATIO((short) 0x17C),//17B
    QUICK_MOVE((short) 0x17D),//17C
    SPAWN_OBTACLE_ATOM((short) 0x17F),
    DUNGEON_MOVE((short) 0x178),//177
    DROP_IP_RESTRICTION((short) 0x17E), //17D
    SPAWN_PLAYER((short) 0x191),//190
    REMOVE_PLAYER_FROM_MAP((short) 0x192),//191
    CHATTEXT((short) 0x193),//192
    CHATTEXT_1((short) 0x194),//193
    CHALKBOARD((short) 0x195),//194
    UPDATE_CHAR_BOX((short) 0x196),//195
    SHOW_CONSUME_EFFECT((short) 0x197),//196
    SHOW_SCROLL_EFFECT((short) 0x198),//197
    SHOW_SOUL_ENCHANTER((short) 0x198),//198
    SHOW_SOUL_EFFECT((short) 0x199),//199
    SHOW_MAGNIFYING_EFFECT((short) 0x193),//
    SHOW_POTENTIAL_RESET((short) 0x194),
    SHOW_FIREWORKS_EFFECT((short) 0x195),//
    SHOW_NEBULITE_EFFECT((short) 0x196),
    SHOW_FUSION_EFFECT((short) 0x197),
    SHOW_GACHAPON_EFFECT((short) 0x19A),//TODO all show_ for 155
    PVP_ATTACK((short) 0x191),//TODO 155
    PVP_MIST((short) 0x192),//TODO 155
    PVP_COOL((short) 0x193),//TODO 155
    TESLA_TRIANGLE((short) 0x19A),//19a
    FOLLOW_EFFECT((short) 0x1A5),//1A5
    SHOW_PQ_REWARD((short) 0x1A6),//1A6
    CRAFT_EFFECT((short) 0x1A9),//1A9
    CRAFT_COMPLETE((short) 0x1A8),//1A8
    HARVESTED((short) 0x1AA),//1Aa
    PLAYER_DAMAGED((short) 0x1AC),//1Ac
    NETT_PYRAMID((short) 0x1AD),//1Ad
    SET_PHASE((short) 0x1AE),//1Ae
    PAMS_SONG((short) 0x1AF),//1Af
    DAMAGE_SKIN((short) 0x1B3),//1b2
    SPAWN_PET((short) 0x1BF),//1BE
    SPAWN_PET_2((short) 0x1C0),//1bF
    MOVE_PET((short) 0x1C2),//1C1
    PET_CHAT((short) 0x1C3),//1C2
    PET_SIZE((short) 0x1C4),//1C3
    PET_NAMECHANGE((short) 0x1C5),//1C4
    PET_EXCEPTION_LIST((short) 0x1C6),//1C5
    PET_COLOR((short) 0x1C7),//1C6
    PET_COMMAND((short) 0x1C8),//1C7
    DRAGON_SPAWN((short) 0x1CA),//1c9
    DRAGON_MOVE((short) 0x1CB),//1cA
    DRAGON_REMOVE((short) 0x1CC),//1cB
    ANDROID_SPAWN((short) 0x1CD),//1cC
    ANDROID_MOVE((short) 0x1CE),//1cD
    ANDROID_EMOTION((short) 0x1CF),//1cE
    ANDROID_UPDATE((short) 0x1D0),//1cF
    ANDROID_DEACTIVATED((short) 0x1D1), //1D0
    HAKU_CHANGE_1((short) 0x1D2),//1D1
    HAKU_MOVE_REBORN((short) 0x1D3),//1D2
    HAKU_BUFF((short) 0x1D4),//1D3
    HAKU_CHANGE_0((short) 0x1D5),//1D4
    SPAWN_FAMILIAR((short) 0x1D8),//1D7
    MOVE_FAMILIAR((short) 0x1D9),//1D8
    TOUCH_FAMILIAR((short) 0x1DA),//1d9
    ATTACK_FAMILIAR((short) 0x1DB),//1DA
    RENAME_FAMILIAR((short) 0x1DC),//1DB
    SPAWN_FAMILIAR_2((short) 0x1DD),//1DC
    UPDATE_FAMILIAR((short) 0x1DE),//1DD
    HAKU_MOVE((short) 0x1E0),//1DF
    HAKU_UNK((short) 0x1E1),//1E0
    HAKU_CHANGE((short) 0x1E2),//1E1
    SPAWN_HAKU((short) 0x1E7),//1E6
    MOVE_PLAYER((short) 0x1E8),//1E7
    CLOSE_RANGE_ATTACK((short) 0x1EA),//1E9
    RANGED_ATTACK((short) 0x1EB),//1eA
    MAGIC_ATTACK((short) 0x1EC),//1EB
    ENERGY_ATTACK((short) 0x1ED),//1EC
    SKILL_EFFECT((short) 0x1EE),//1ED
    MOVE_ATTACK((short) 0x1EF),//1EE
    CANCEL_SKILL_EFFECT((short) 0x1F0),//1EF
    DAMAGE_PLAYER((short) 0x1F1),//1F0
    FACIAL_EXPRESSION((short) 0x1F2),//1F1
    SHOW_ITEM_EFFECT((short) 0x1F4),//1F3
    SHOW_TITLE((short) 0x1F6),//1F5
    ANGELIC_CHANGE((short) 0x1F7),//1F6
    SHOW_CHAIR((short) 0x1FA),//1F9
    UPDATE_CHAR_LOOK((short) 0x1FC),//1fA
    SHOW_FOREIGN_EFFECT((short) 0x1FD),//1FB
    GIVE_FOREIGN_BUFF((short) 0x1FE),//1FC
    CANCEL_FOREIGN_BUFF((short) 0x1FF),//1FD
    UPDATE_PARTYMEMBER_HP((short) 0x200),//1FE
    LOAD_GUILD_NAME((short) 0x201),
    LOAD_GUILD_ICON((short) 0x202),
    LOAD_TEAM((short) 0x203),//201
    SHOW_HARVEST((short) 0x203),//202

    PVP_HP((short) 0x213),//204
    ZERO_CHANGE((short) 0x214),//TODO v155
    ZERO_CHANGE_2((short) 0x215),//TODO v155
    ATTACK_EFFECT((short) 0x216),//TODO v155
    CANCEL_CHAIR((short) 0x217),//216
    DIRECTION_FACIAL_EXPRESSION((short) 0x218),//
    MOVE_SCREEN((short) 0x219),//
    SHOW_SPECIAL_EFFECT((short) 0x21A),
    CURRENT_MAP_WARP((short) 0x21B),//
    MESOBAG_SUCCESS((short) 0x21D),//
    MESOBAG_FAILURE((short) 0x21E),//
    R_MESOBAG_SUCCESS((short) 0x21F),//
    R_MESOBAG_FAILURE((short) 0x220),//
    MAP_FADE((short) 0x221),//
    MAP_FADE_FORCE((short) 0x222),//
    UPDATE_QUEST_INFO((short) 0x223),//
    HP_DECREASE((short) 0x224),//
    PET_FLAG_CHANGE((short) 0x225),//
    PLAYER_HINT((short) 0x226),//
    PLAY_EVENT_SOUND((short) 0x227),//
    PLAY_MINIGAME_SOUND((short) 0x228),//
    MAKER_SKILL((short) 0x229),//
    OPEN_UI((short) 0x22C),//22B
    OPEN_UI_OPTION((short) 0x22E),//
    INTRO_LOCK((short) 0x22F),//
    INTRO_ENABLE_UI((short) 0x230),//
    INTRO_DISABLE_UI((short) 0x231),//
    SUMMON_HINT((short) 0x232),//
    SUMMON_HINT_MSG((short) 0x233),//
    ARAN_COMBO((short) 0x234),//
    ARAN_COMBO_RECHARGE((short) 0x235),//
    RANDOM_EMOTION((short) 0x236),//
    RADIO_SCHEDULE((short) 0x237),//
    OPEN_SKILL_GUIDE((short) 0x238),//
    GAME_MSG((short) 0x23A),//
    GAME_MESSAGE((short) 0x23B),//
    BUFF_ZONE_EFFECT((short) 0x23C),//
    GO_CASHSHOP_SN((short) 0x23D),//
    DAMAGE_METER((short) 0x23E),//
    TIME_BOMB_ATTACK((short) 0x23F),//
    FOLLOW_MOVE((short) 0x241),//
    FOLLOW_MSG((short) 0x242),//
    AP_SP_EVENT((short) 0x244),//
    QUEST_GUIDE_NPC((short) 0x22E),//
    REGISTER_FAMILIAR((short) 0x24C),//
    FAMILIAR_MESSAGE((short) 0x24D),//
    BOOSTER_FAMILIAR((short) 0x24E),//
    CREATE_ULTIMATE((short) 0x24F),//
    HARVEST_MESSAGE((short) 0x250),//
    RUNE_MESSAGE((short) 0x251),//
    OPEN_BAG((short) 0x252),//
    DRAGON_BLINK((short) 0x253),//
    PVP_ICEGAGE((short) 0x254),//
    DIRECTION_INFO((short) 0x255),//
    REISSUE_MEDAL((short) 0x256),//
    PLAY_MOVIE((short) 0x259),//
    CAKE_VS_PIE((short) 0x25A),//
    PHANTOM_CARD((short) 0x25B),//
    LUMINOUS_COMBO((short) 0x25E),//25D
    MOVE_SCREEN_X((short) 0x1A9),//TODO v155
    MOVE_SCREEN_DOWN((short) 0x1AA),//TODO v155
    CAKE_PIE_INSTRUMENTS((short) 0x1AB),//TODO v155
    SEALED_BOX((short) 0x222),//TODO v155
    DEATH_COUNT((short) 0x262),//
    FLIP_THE_COIN((short) 0x268),//
    MIRROR_DUNGEON_CLEAR((short) 0x269),//
    MIRROR_DUNGEON_RESULT((short) 0x26A),//
    GAIN_TAMER_ITEM((short) 0x286),//TODO V155
    GAIN_TAMER_POINT((short) 0x288),//TODO V155
    KAISER_SKILL_SHORTCUT((short) 0x289),//289
    SPECIAL_MAGIC_ATTACK((short) 0x28A),//new 155
    BLAZE_WIZARD_RESPONSE((short) 0x297), //test
    COOLDOWN((short) 0x2AD),//29C
    SPAWN_SUMMON((short) 0x2AF),//2AE
    REMOVE_SUMMON((short) 0x2B0),//
    MOVE_SUMMON((short) 0x2B1),//
    SUMMON_ATTACK((short) 0x2B2),//
    PVP_SUMMON((short) 0x2B3),//
    SUMMON_SKILL((short) 0x2B4),//
    SUMMON_SKILL_2((short) 0x2B6),//
    SUMMON_DELAY((short) 0x2B7),//
    DAMAGE_SUMMON((short) 0x2B8),//
    SPAWN_MONSTER((short) 0x2BB), //2BA
    KILL_MONSTER((short) 0x2BC),//2BB
    SPAWN_MONSTER_CONTROL((short) 0x2BD), //2BC
    MOVE_MONSTER((short) 0x2BF), //2BE
    MOVE_MONSTER_RESPONSE((short) 0x2C0),//2BF
    APPLY_MONSTER_STATUS((short) 0x2C2),//
    CANCEL_MONSTER_STATUS((short) 0x2C3),//
    DAMAGE_MONSTER((short) 0x2C6),//
    SKILL_EFFECT_MOB((short) 0x2C7),//
    MONSTER_CRC_CHANGE((short) 0x2C9),//
    SHOW_MONSTER_HP((short) 0x2CA),//
    SHOW_MAGNET((short) 0x2CB),//
    ITEM_EFFECT_MOB((short) 0x2CC),//
    CATCH_MONSTER((short) 0x2CD),//
    MONSTER_SKILL((short) 0x2CE),//
    MONSTER_PROPERTIES((short) 0x2D2),//
    REMOVE_TALK_MONSTER((short) 0x2D3),//
    TALK_MONSTER((short) 0x2D4),//
    TELE_MONSTER((short) 0x2D7),//
    CYGNUS_ATTACK((short) 0x2D8),//
    MONSTER_RESIST((short) 0x2D9),//
    BOSSPVP_SKILL((short) 0x2DF),//
    MOB_TO_MOB_DAMAGE((short) 0x2E1),//
    AZWAN_MOB_TO_MOB_DAMAGE((short) 0x2E2),//
    AZWAN_SPAWN_MONSTER((short) 0x2E4),//
    AZWAN_KILL_MONSTER((short) 0x2E5),//
    AZWAN_SPAWN_MONSTER_CONTROL((short) 0x2E6),//
    SPAWN_NPC((short) 0x2EC),//2EB
    REMOVE_NPC((short) 0x2ED),//2EC
    SPAWN_NPC_REQUEST_CONTROLLER((short) 0x2EF),//2EE
    NPC_ACTION((short) 0x2F0),//2EF
    NPC_TOGGLE_VISIBLE((short) 0x2F1),//
    INITIAL_QUIZ((short) 0x2F3),//
    NPC_UPDATE_LIMITED_INFO((short) 0x2F5),//
    NPC_SET_SPECIAL_ACTION((short) 0x2F8),//
    NPC_SCRIPTABLE((short) 0x2FA),//
    RED_LEAF_HIGH((short) 0x2FB),//
    SPAWN_HIRED_MERCHANT((short) 0x2FD),//
    DESTROY_HIRED_MERCHANT((short) 0x2FE),//
    UPDATE_HIRED_MERCHANT((short) 0x2FF),//
    DROP_ITEM_FROM_MAPOBJECT((short) 0x300),//2FF
    REMOVE_ITEM_FROM_MAP((short) 0x302),//
    SPAWN_KITE_ERROR((short) 0x303),//
    SPAWN_KITE((short) 0x304),//
    DESTROY_KITE((short) 0x305),//
    SPAWN_MIST((short) 0x306),//
    REMOVE_MIST((short) 0x307),//
    SPAWN_DOOR((short) 0x308),//
    REMOVE_DOOR((short) 0x309),//
    MECH_DOOR_SPAWN((short) 0x30A),//
    MECH_DOOR_REMOVE((short) 0x30B),//
    REACTOR_HIT((short) 0x30C),//
    REACTOR_MOVE((short) 0x30D),//
    REACTOR_SPAWN((short) 0x30E),//
    REACTOR_DESTROY((short) 0x310),//
    SPAWN_EXTRACTOR((short) 0x311),//
    REMOVE_EXTRACTOR((short) 0x312),//
    ROLL_SNOWBALL((short) 0x313),//
    HIT_SNOWBALL((short) 0x314),//
    SNOWBALL_MESSAGE((short) 0x315),//
    LEFT_KNOCK_BACK((short) 0x316),//
    HIT_COCONUT((short) 0x317),//
    COCONUT_SCORE((short) 0x318),//
    MOVE_HEALER((short) 0x319),//
    PULLEY_STATE((short) 0x31A),//
    MONSTER_CARNIVAL_START((short) 0x2C8),//TODO v155
    MONSTER_CARNIVAL_OBTAINED_CP((short) 0x2C9),//TODO v155
    MONSTER_CARNIVAL_STATS((short) 0x2CA),//TODO v155
    MONSTER_CARNIVAL_SUMMON((short) 0x2CC),//TODO v155
    MONSTER_CARNIVAL_MESSAGE((short) 0x2CD),//2TODO v155
    MONSTER_CARNIVAL_DIED((short) 0x2CE),//TODO v155
    MONSTER_CARNIVAL_LEAVE((short) 0x2CF),//TODO v155
    MONSTER_CARNIVAL_RESULT((short) 0x2D0),//TODO v155
    MONSTER_CARNIVAL_RANKING((short) 0x2D1),//TODO v155
    ARIANT_SCORE_UPDATE((short) 0x30F),//TODO v155
    SHEEP_RANCH_INFO((short) 0x999),//TODO v155
    MOB_ON_MAP_START((short) 0x300),//TODO v155
    MOB_ON_MAP_ALERT((short) 0x301),//TODO v155
    SHEEP_RANCH_CLOTHES((short) 0x302),//TODO v155
    WITCH_TOWER((short) 0x303),//TODO v155
    EXPEDITION_CHALLENGE((short) 0x304),//TODO v155
    ZAKUM_SHRINE((short) 0x305),//TODO v155
    CHAOS_ZAKUM_SHRINE((short) 0x306),//TODO v155
    PVP_TYPE((short) 0x306),//308//VERSION 153
    PVP_TRANSFORM((short) 0x307),//309//VERSION 153
    PVP_DETAILS((short) 0x308),//30A//VERSION 153
    PVP_ENABLED((short) 0x309),//30B//VERSION 153
    PVP_SCORE((short) 0x30A),//30C//VERSION 153
    PVP_RESULT((short) 0x30B),//30D//VERSION 153
    PVP_TEAM((short) 0x30C),//30E//VERSION 153
    PVP_SCOREBOARD((short) 0x30D),//30F//VERSION 153
    PVP_POINTS((short) 0x30F),//311//VERSION 153
    PVP_KILLED((short) 0x310),//312//VERSION 153
    PVP_MODE((short) 0x311),//313//VERSION 153
    PVP_ICEKNIGHT((short) 0x312),//314//VERSION 153
    HORNTAIL_SHRINE((short) 0x331),//TODO v155
    CAPTURE_FLAGS((short) 0x332),//TODO v155
    CAPTURE_POSITION((short) 0x333),//TODO v155
    CAPTURE_RESET((short) 0x334),//TODO v155
    PINK_ZAKUM_SHRINE((short) 0x335),//TODO v155
    BOSSPVP_UI((short) 0x33A),//33C//VERSION 153
    BOSSPVP_SHOW_SELECTED((short) 0x33C),//33E//VERSION 153
    BOSSPVP_REGISTER_CHAR((short) 0x33E),//340//VERSION 153
    BOSSPVP_REGISTER_BOSS((short) 0x33C),//33E//VERSION 153
    BOSSPVP_START_AS_BOSS((short) 0x33B),//33D//VERSION 153
    BOSSPVP_REENTER((short) 0x346),//348//VERSION 153
    BOSSPVP_STUCK((short) 0x26C),//26E//VERSION 153
    BOSSPVP_3((short) 0x26A),//26C//VERSION 153
    BOSSPVP_PLAYER_HP((short) 0x349),//34B//VERSION 153
    BOSSPVP_UI2((short) 0x348),//34A//VERSION 153
    BOSSPVP_LIFES((short) 0x343),//345//VERSION 153
    BOSSPVP_SPAWN((short) 0x347),//349//VERSION 153
    BOSSPVP_COOLDOWN_UI((short) 0x262),//264//VERSION 153
    BOSSPVP_CLEAR_COODLWON((short) 0x264),//266//VERSION 153
    SHOW_MUSTACHE((short) 0x361),//TODO v155
    SPAWN_RUNE((short) 0x374),//TODO v155
    COMPLETE_RUNE((short) 0x375),//TODO v155
    NPC_TALK((short) 0x3AA),//399
    OPEN_NPC_SHOP((short) 0x3AB),//39A
    CONFIRM_SHOP_TRANSACTION((short) 0x39C),//
    GACHAPIERROT((short) 0x39D),//
    GACHAPON_UPDATE((short) 0x39E),//
    OPEN_STORAGE((short) 0x3C5),//
    MERCH_ITEM_MSG((short) 0x3A3),//
    MERCH_ITEM_STORE((short) 0x3A4),//
    RPS_GAME((short) 0x3A5),//
    MESSENGER((short) 0x3A7),//
    PLAYER_INTERACTION((short) 0x3CB),//
    ZERO_RESET_POTENTIAL((short) 0x3AE),//
    ARROW_BLASTER((short) 0x3F9),//TODO v155
    BLASTER_DISSAPEAR((short) 0x3FA),//TODO v155
    BLASTER_ARROW((short) 0x3FE),//TODO v155
    VICIOUS_HAMMER((short) 0x2E7),//TODO v155
    LUCKY_LOGOUT((short) 0x438),//TODO v155
    TOURNAMENT((short) 0x234),//236//VERSION 153
    TOURNAMENT_MATCH_TABLE((short) 0x236),//238//VERSION 153
    TOURNAMENT_SET_PRIZE((short) 0x237),//239//VERSION 153
    TOURNAMENT_UEW((short) 0x238),//23A//VERSION 153
    TOURNAMENT_CHARACTERS((short) 0x239),//23B//VERSION 153
    WEDDING_PROGRESS((short) 0x235),//237//VERSION 153
    WEDDING_CEREMONY_END((short) 0x236),//238//VERSION 153
    // Cash Shop
    PACKAGE_OPERATION((short) 0x3C2),//VERSION 153
    CS_CHARGE_CASH((short) 0x2C9),//2CB//VERSION 153
    CS_EXP_PURCHASE((short) 0x23A),//23C//VERSION 153
    GIFT_RESULT((short) 0x23B),//23D//VERSION 153
    CHANGE_NAME_CHECK((short) 0x23C),//23E//VERSION 153
    CHANGE_NAME_RESPONSE((short) 0x23D),
    CS_UPDATE((short) 0x3D7),//
    CS_OPERATION((short) 0x3D8),//
    CS_MESO_UPDATE((short) 0x3DB),//
    USE_PREM_BOX((short) 0x3E8),//
    CS_MESO_ITEM((short) 0x3ED),//
    CASH_SHOP((short) 0x3EF),//
    CASH_SHOP_UPDATE((short) 0x3F0),//
    GACHAPON_STAMPS((short) 0x252),//254//VERSION 153
    FREE_CASH_ITEM((short) 0x999),//254//VERSION 153
    CS_SURPRISE((short) 0x254),//256//VERSION 153
    XMAS_SURPRISE((short) 0x255),//257//VERSION 153
    ONE_A_DAY((short) 0x257),//259//VERSION 153
    NX_SPEND_GIFT((short) 0x259),//25B//VERSION 153
    ZERO_SCROLL_UI((short) 0x411),//TODO v155
    // Cash Shop [END]
    KEYMAP((short) 0x40D),//
    PET_AUTO_HP((short) 0x40E),//
    PET_AUTO_MP((short) 0x40F),//
    PET_AUTO_CURE((short) 0x410),//
    START_TV((short) 0x314),//
    REMOVE_TV((short) 0x415),//
    ENABLE_TV((short) 0x416),//
    GM_ERROR((short) 0x999),//26D
    ALIEN_SOCKET_CREATOR((short) 0x427),//TODO v155
    GOLDEN_HAMMER((short) 0x2E8),//TODO v155
    BATTLE_RECORD_DAMAGE_INFO((short) 0x278),//TODO v155
    CALCULATE_REQUEST_RESULT((short) 0x279),//TODO v155
    BOOSTER_PACK((short) 0x999),//TODO v155
    BLOCK_PORTAL((short) 0x999),//TODO v155
    NPC_CONFIRM((short) 0x999),//TODO v155
    RSA_KEY((short) 0x999),//TODO v155
    BUFF_BAR((short) 0x999),//TODO v155
    GAME_POLL_REPLY((short) 0x999),//TODO v155
    GAME_POLL_QUESTION((short) 0x999),//TODO v155
    ENGLISH_QUIZ((short) 0x999),//TODO v155
    FISHING_BOARD_UPDATE((short) 0x999),//TODO v155
    BOAT_EFFECT((short) 0x999),//TODO v155
    FISHING_CAUGHT((short) 0x999),//TODO v155
    SIDEKICK_OPERATION((short) 0x999),//TODO v155
    // Farm
    FARM_PACKET1((short) 0x35C),
    FARM_ITEM_PURCHASED((short) 0x35D),
    FARM_ITEM_GAIN((short) 0x358),
    HARVEST_WARU((short) 0x35A),
    FARM_MONSTER_GAIN((short) 0x35B),
    FARM_INFO((short) 0x368),
    FARM_MONSTER_INFO((short) 0x369),
    FARM_QUEST_DATA((short) 0x36A),
    FARM_QUEST_INFO((short) 0x36B),
    FARM_MESSAGE((short) 0x999),//
    UPDATE_MONSTER((short) 0x36D),
    AESTHETIC_POINT((short) 0x36E),
    UPDATE_WARU((short) 0x36F),
    FARM_EXP((short) 0x374),
    FARM_PACKET4((short) 0x375),
    QUEST_ALERT((short) 0x377),
    FARM_PACKET8((short) 0x378),
    FARM_FRIENDS_BUDDY_REQUEST((short) 0x37B),
    FARM_FRIENDS((short) 0x37C),
    FARM_USER_INFO((short) 0x388),
    FARM_AVATAR((short) 0x38A),
    FRIEND_INFO((short) 0x38D),
    FARM_RANKING((short) 0x38F), //+69
    SPAWN_FARM_MONSTER1((short) 0x393),
    SPAWN_FARM_MONSTER2((short) 0x394),
    RENAME_MONSTER((short) 0x395),
    // Farm [END]
    STRENGTHEN_UI((short) 0x49E),//
    //Unplaced:
    SHOW_MAP_NAME((short) 0x999),
    REDIRECTOR_COMMAND((short) 0x1337);

    private short code = -2;

    @Override
    public void setValue(short code) {
        this.code = code;
    }

    @Override
    public short getValue() {
        return getValue(true);
    }

    public short getValue(boolean show) {
        if (show && ServerConfig.logPackets && !isSpamHeader(this)) {
            String tab = "";
            for (int i = 4; i > Integer.valueOf(this.name().length() / 8); i--) {
                tab += "\t";
            }
            System.out.println("[Send]\t" + this.name() + tab + "|\t" + this.code + "\t|\t" + HexTool.getOpcodeToString(this.code)/* + "\r\nCaller: " + Thread.currentThread().getStackTrace()[2] */);
            FileoutputUtil.log("PacketLog.txt", "\r\n\r\n[Send]\t" + this.name() + tab + "|\t" + this.code + "\t|\t" + HexTool.getOpcodeToString(this.code) + "\r\n\r\n");
        }
        return code;
    }

    private SendPacketOpcode(short code) {
        this.code = code;
    }

    public String getType(short code) {
        String type = null;
        if (code >= 0 && code < 0xE || code >= 0x17 && code < 0x21) {
            type = "CLogin";
        } else if (code >= 0xE && code < 0x17) {
            type = "LoginSecure";
        } else if (code >= 0x21 && code < 0xCB) {
            type = "CWvsContext";
        } else if (code >= 0xD2) {
            type = "CField";
        }
        return type;
    }

    public static String getOpcodeName(int value) {
        for (SendPacketOpcode opcode : SendPacketOpcode.values()) {
            if (opcode.getValue(false) == value) {
                return opcode.name();
            }
        }
        return "UNKNOWN";
    }

    public boolean isSpamHeader(SendPacketOpcode opcode) {
        switch (opcode) {
            case AUTH_RESPONSE:
            case SERVERLIST:
            case UPDATE_STATS:
            case MOVE_PLAYER:
            case SPAWN_NPC:
            case SPAWN_NPC_REQUEST_CONTROLLER:
            case REMOVE_NPC:
            case MOVE_MONSTER:
            case MOVE_MONSTER_RESPONSE:
            case SPAWN_MONSTER:
            case SPAWN_MONSTER_CONTROL:
            case HAKU_MOVE:
            /*case MOVE_SUMMON:
             case MOVE_FAMILIAR:
            
             case ANDROID_MOVE:
             case INVENTORY_OPERATION:*/
            case MOVE_PET:
            case SHOW_SPECIAL_EFFECT:
            case DROP_ITEM_FROM_MAPOBJECT:
            case REMOVE_ITEM_FROM_MAP:
            //case UPDATE_PARTYMEMBER_HP:
            case DAMAGE_PLAYER:
            case SHOW_MONSTER_HP:
            case CLOSE_RANGE_ATTACK:
            case RANGED_ATTACK:
            //case ARAN_COMBO:
            case REMOVE_BG_LAYER:
            case SPECIAL_STAT:
            case TOP_MSG:
            case NPC_ACTION:
//            case ANGELIC_CHANGE:
            case UPDATE_CHAR_LOOK:
            case KILL_MONSTER:
                return true;
        }
        return false;
    }
}
