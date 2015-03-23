package handling;

public enum RecvPacketOpcode implements WritableIntValueHolder {

   //Login Opcodes
        LOGIN_REDIRECTOR(true, (short) 0x01),
	GUEST_LOGIN(true, (short) 0x16),
	BACK_TO_WORLDLIST(true, (short) 0x1A),//TODO HANDLE
	SERVERSTATUS_REQUEST(false, (short) 0x1D),
	TOS(true, (short) 0x1D),
	VIEW_SERVERLIST(false, (short) 0x21),
	SERVERLIST_REQUEST(false, (short) 0x22),
	REDISPLAY_SERVERLIST(true, (short) 0x23),
	CHAR_SELECT_NO_PIC(false, (short) 0x25),
	PLAYER_LOGGEDIN(false, (short) 0x27),
	CHECK_CHAR_NAME(true, (short) 0x28),
	DELETE_CHAR(true, (short) 0x2C),
	CRASH_INFO(true, (short) 0x2E),
	HACKSHIELD(false, (short) 0x2F),
	CLIENT_AUTH(false, (short) 0x30),
	CHAR_SELECT(true, (short) 0x31),
	VIEW_REGISTER_PIC(true, (short) 0x32),
	VIEW_SELECT_PIC(true, (short) 0x35),
	CLIENT_START(false, (short) 0x37),
	CLIENT_FAILED(false, (short) 0x38),
	HARDWARE_DATA(true, (short) 0x39),
	PART_TIME_JOB(true, (short) 0x3A),
	CHARACTER_CARDS(true, (short) 0x3B),
	ENABLE_SPECIAL_CREATION(true, (short) 0x3C),
	CLIENT_HELLO(false, (short) 0x3D),
	LOGIN_PASSWORD(false, (short) 0x3E),
	CREATE_SPECIAL_CHAR(true, (short) 0x3F),
	CHARLIST_REQUEST(false, (short) 0x41),
	CREATE_CHAR(false, (short) 0x43),
	PONG(true, (short) 0x44),
	AUTH_SECOND_PASSWORD(true, (short) 0x45),
	CREATE_ULTIMATE(false, (short) 0x46),
	CLIENT_ERROR(true, (short) 0x47),
	CLIENT_ERROR2(true, (short) 0x4B),
	//Channel Opcodes
	CHANGE_MAP(true, (short) 0x4E), //4E
	CHANGE_CHANNEL(true, (short) 0x4F),//guess
	ENTER_CASH_SHOP(true, (short) 0x51),//V155
	ENTER_FARM(true, (short) 0x55),//
	ENTER_AZWAN(true, (short) 0x57),//
	ENTER_AZWAN_EVENT(true, (short) 0x54),//
	LEAVE_AZWAN(true, (short) 0x55),//
	ENTER_PVP(true, (short) 0x41),//
	ENTER_PVP_PARTY(true, (short) 0x42),//
	LEAVE_PVP(true, (short) 0x999),
	MOVE_PLAYER(true, (short) 0x5B),//5A
	CANCEL_CHAIR(true, (short) 0x5D),//VERSION 153
	USE_CHAIR(true, (short) 0x5E),//VERSION 153
	CLOSE_RANGE_ATTACK(true, (short) 0x5F),//5F
	RANGED_ATTACK(true, (short) 0x60),//5F
	MAGIC_ATTACK(true, (short) 0x61),//60
	PASSIVE_ENERGY(true, (short) 0x63),//VERSION 153
	TAKE_DAMAGE(true, (short) 0x65),//64
	PVP_ATTACK(true, (short) 0x65),//guess
	GENERAL_CHAT(true, (short) 0x67),//66
	CLOSE_CHALKBOARD(true, (short) 0x68),//guess
	FACE_EXPRESSION(true, (short) 0x69),//69
	FACE_ANDROID(true, (short) 0x6A),//
	USE_ITEMEFFECT(true, (short) 0x6B),//
	WHEEL_OF_FORTUNE(true, (short) 0x6D),//
	USE_TITLE(true, (short) 0x6E),//
	ANGELIC_CHANGE(true, (short) 0x6F),//
	CHANGE_CODEX_SET(true, (short) 0x77),//
	MONSTER_BOOK_DROPS(true, (short) 0x7B),//
	NPC_TALK(true, (short) 0x7C),//guess
	NPC_TALK_MORE(true, (short) 0x7E),//guess
	NPC_SHOP(true, (short) 0x7F),//VERSIONN 153
	GACHAPIERROT(true, (short) 0x80), //byte 0 int ticket itemid //VERSIONN 153
	STORAGE(true, (short) 0x81),//VERSIONN 153
	USE_HIRED_MERCHANT(true, (short) 0x82),//VERSIONN 153
	MERCH_ITEM_STORE(true, (short) 0x83),//VERSIONN 153
	PACKAGE_OPERATION(true, (short) 0x7D),//
	MECH_CANCEL(true, (short) 0x85),//VERSIONN 153//Check
	SEND_FORCE(true, (short) 0x87),//VERSIONN 153
	SHOWEFFECT(true, (short) 0x88),//
	OWL(true, (short) 0x8B),//8B//VERSIONN 153
	OWL_WARP(true, (short) 0x8C),//8C//VERSIONN 153
	AUCTION_UI(true, (short) 0x8E),//
	ITEM_GATHER(true, (short) 0x8F),//guess
	ITEM_SORT(true, (short) 0x90),//VERSION 153
	ITEM_MOVE(true, (short) 0x91), //91
	MOVE_BAG(true, (short) 0x92),//VERSION 153
	SWITCH_BAG(true, (short) 0x93),//VERSION 153
	USE_ITEM(true, (short) 0x95),//VERSION 153
	CANCEL_ITEM_EFFECT(true, (short) 0x95),////VERSION 153
	USE_SUMMON_BAG(true, (short) 0x98),////VERSION 153
	PET_FOOD(true, (short) 0x99),////VERSION 153
	USE_MOUNT_FOOD(true, (short) 0x99),////VERSION 153
	USE_SCRIPTED_NPC_ITEM(true, (short) 0x9B),//VERSION 153
	USE_RECIPE(true, (short) 0x9C),//guess
	USE_NEBULITE(true, (short) 0x9D),//guess
	USE_ALIEN_SOCKET(true, (short) 0x9E),//guess
	USE_ALIEN_SOCKET_RESPONSE(true, (short) 0x9F),//guess
	USE_NEBULITE_FUSION(true, (short) 0xA0),//VERSION 153
	USE_CASH_ITEM(true, (short) 0xA1),//guess
	ACTIVATE_PET_LOOT(true, (short) 0xA3),//new 149//VERSION 153//Check
	ACTIVATE_PET_AUTO_FEED(true, (short) 0xA4),//new 149//VERSION 153//Check
	USE_CATCH_ITEM(true, (short) 0xA6),//A4//VERSION 153
	USE_SKILL_BOOK(true, (short) 0xA8),//VERSION 153
	USE_EXP_POTION(true, (short) 0xA9),//VERSION 153
	USE_SP_RESET(true, (short) 0xAA),//VERSION 153
	USE_AP_RESET(true, (short) 0xAB),//VERSION 153
	TOT_ACHIEVEMENT(true, (short) 0xB2), //int quest short 0 int itemid//
	TOT_GUIDE(true, (short) 0xB3),//
	USE_OWL_MINERVA(true, (short) 0xBA),//BA//VERSION 153
	USE_TELE_ROCK(true, (short) 0xBB),//BB
	USE_RETURN_SCROLL(true, (short) 0xBC),//BC
	ARDENTMILL_WARP(true, (short) 0xBD),//BD
	USE_UPGRADE_SCROLL(true, (short) 0xBE),//BE
	USE_FLAG_SCROLL(true, (short) 0xBF),//BF
	USE_EQUIP_SCROLL(true, (short) 0xC0),//C0
	USE_POTENTIAL_SCROLL(true, (short) 0xC4),//C4
	USE_ABYSS_SCROLL(true, (short) 0xC5),//C5 - idk??
	USE_BONUS_POTENTIAL(true, (short) 0xC5),//C5
	USE_CARVED_SEAL(true, (short) 0xC6),//C6
	MAX_SOULS(true, (short) 0xC7),//C7
	USE_SOUL_ENCHANTER(true, (short) 0xC8),//C8
	USE_SOUL(true, (short) 0xC9),//C9
	USE_SPELL_TRACE(true, (short) 0xCC),//new 150//VERSION 153
	USE_BAG(true, (short) 0xCD),//CC//VERSION 153
	USE_CRAFTED_CUBE(true, (short) 0xCB),//CA//VERSION 153
	USE_MAGNIFY_GLASS(true, (short) 0xCE),//CD//VERSION 153
	DISTRIBUTE_AP(true, (short) 0xD3),//VERSION 153
	AUTO_ASSIGN_AP(true, (short) 0xD4),//VERSION 153
	HEAL_OVER_TIME(true, (short) 0xD6),//D5
	LINKED_SKILL(true, (short) 0xD8),//D6
	DISTRIBUTE_SP(true, (short) 0xD9),//VERSION 153
	SPECIAL_MOVE(true, (short) 0xDA),//D9
	CANCEL_BUFF(true, (short) 0xDB),//VERSION 153
	SKILL_EFFECT(true, (short) 0xDC),//VERSION 153
	MESO_DROP(true, (short) 0xDD),//VERSION 153
	GIVE_FAME(true, (short) 0xDE),//DC//VERSION 153
	CHAR_INFO_REQUEST(true, (short) 0xE0),//DE//VERSION 153
	SPAWN_PET(true, (short) 0xE1),//DF//VERSION 153
	GET_BOOK_INFO(true, (short) 0xE3),//E1//VERSION 153
	USE_FAMILIAR(true, (short) 0xE4),//E2//VERSION 153
	SPAWN_FAMILIAR(true, (short) 0xE5),//E3//VERSION 153
	RENAME_FAMILIAR(true, (short) 0xE6),//E4//VERSION 153
	PET_BUFF(true, (short) 0xE7),//E5//VERSION 153
	CANCEL_DEBUFF(true, (short) 0xE8),//E6//VERSION 153
	CHANGE_MAP_SPECIAL(true, (short) 0xE9),//E9//VERSION 153
	USE_INNER_PORTAL(true, (short) 0xEA),//VERSION 153
	TROCK_ADD_MAP(true, (short) 0xEC),//EA//VERSION 153
	LIE_DETECTOR(true, (short) 0xEE),//EB//VERSION 153
	LIE_DETECTOR_SKILL(true, (short) 0xEF),//EC//VERSION 153
	LIE_DETECTOR_RESPONSE(true, (short) 0xF0),//ED//VERSION 153
	REPORT(true, (short) 0xF1),//VERSION 153
	QUEST_ACTION(true, (short) 0xF2),//VERSION 153
	REISSUE_MEDAL(true, (short) 0xF3),//VERSION 153
	BUFF_RESPONSE(true, (short) 0xF4),//F4
	SKILL_MACRO(true, (short) 0xF5),//VERSION 153
	REWARD_ITEM(true, (short) 0xFC),//FA//VERSION 153
	ITEM_MAKER(true, (short) 0x999),
	REPAIR_ALL(true, (short) 0x103),//101//VERSION 153
	REPAIR(true, (short) 0x104),//102//VERSION 153
	SOLOMON(true, (short) 0xCE),//CC//VERSION 153
	GACH_EXP(true, (short) 0xEF),//CD//VERSION 153
	FOLLOW_REQUEST(true, (short) 0x107),//105//VERSION 153
	PQ_REWARD(true, (short) 0x100),//FE//VERSION 153
	FOLLOW_REPLY(true, (short) 0x10B),//109//VERSION 153
	AUTO_FOLLOW_REPLY(true, (short) 0x10C),//10A//VERSION 153
	SPECIAL_STAT(false, (short) 0x111),//154-1
	USE_TREASURE_CHEST(true, (short) 0x999),
	USE_POT(true, (short) 0xDB),//
	CLEAR_POT(true, (short) 0xDC),//
	FEED_POT(true, (short) 0xDD),//DB//VERSION 153
	CURE_POT(true, (short) 0xDE),//DC//VERSION 153
	REWARD_POT(true, (short) 0xEDF),//DD//VERSION 153
	AZWAN_REVIVE(true, (short) 0xE0),//DE//VERSION 153//Wrong
	USE_COSMETIC(true, (short) 0x999),
	INNER_CIRCULATOR(true, (short) 0x11C),//11A//VERSION 153
	PVP_RESPAWN(true, (short) 0xE5),//E3//VERSION 153
	GAIN_FORCE(true, (short) 0xE8),//E4//VERSION 153
	DF_COMBO(true, (short) 0x119),//117//VERSION 153
	MOVE_ORB(true, (short) 0X121),//LUMINOUS MOVE ORB
	ZERO_CHANGE(true, (short) 0x127),//124//VERSION 153
	EXPIRE_DUALCOMBAT(true, (short) 0x129),//126//VERSION 153
	ADMIN_CHAT(true, (short) 0x12D),//12A//VERSION 153
	PARTYCHAT(true, (short) 0x12E),//VERSION 153
	WHISPER(true, (short) 0x130),//VERSION 153
	SPOUSE_CHAT(true, (short) 0x130),//guess
	MESSENGER(true, (short) 0x131),//guess
	PLAYER_INTERACTION(true, (short) 0x133),//guess
	PARTY_OPERATION(true, (short) 0x134),//134
	DENY_PARTY_REQUEST(true, (short) 0x136),//VERSION 155
	ALLOW_PARTY_INVITE(true, (short) 0x137),//VERSION 155
	EXPEDITION_OPERATION(true, (short) 0x137),//VERSION 153
	EXPEDITION_LISTING(true, (short) 0x138),//VERSION 153
	GUILD_OPERATION(true, (short) 0x139),//VERSION 153
	DENY_GUILD_REQUEST(true, (short) 0x13A),//VERSION 153
	GUILD_REQUEST(true, (short) 0x14B),//VERSION 153
	ADMIN_COMMAND(true, (short) 0x13F),//13D//VERSION 153
	ADMIN_TEST(true, (short) 0x140),//13E//VERSION 153
	ADMIN_LOG(true, (short) 0x140),//13F//VERSION 153
	BUDDYLIST_MODIFY(true, (short) 0x143), //140//VERSION 153
	NOTE_ACTION(true, (short) 0x143),//141//VERSION 153
	USE_DOOR(true, (short) 0x146),//143//VERSION 153//Check
	USE_MECH_DOOR(true, (short) 0x147),//144//VERSION 153//Check
	CHANGE_KEYMAP(true, (short) 0x149), //VERSION 153
	RPS_GAME(true, (short) 0x14A),//147//VERSION 153
	RING_ACTION(true, (short) 0x14B),//148//VERSION 153
	WEDDING_ACTION(true, (short) 0x14C),//149//VERSION 153
	ALLIANCE_OPERATION(true, (short) 0x150),//14F//VERSION 153
	DENY_ALLIANCE_REQUEST(true, (short) 0x151),//150//VERSION 153
	BBS_OPERATION(true, (short) 0x15E),//15B//VERSION 153
	SOLOMON_EXP(true, (short) 0x156),//152//VERSION 153
	NEW_YEAR_CARD(true, (short) 0x123),//11E//VERSION 153
	XMAS_SURPRISE(true, (short) 0x116FFF),
	TWIN_DRAGON_EGG(true, (short) 0x117),//113//VERSION 153
	CS_SURPRISE_BOX(true, (short) 0x15D),//159//VERSION 153
	ARAN_COMBO(true, (short) 0x16C),//168//VERSION 153
	REMOVE_ARAN_COMBO(true, (short) 0X16D),//0x152//NOT IN USE Just an Extra which I got
	TRANSFORM_PLAYER(true, (short) 0x999),
	CYGNUS_SUMMON(true, (short) 0x999),
	CRAFT_DONE(true, (short) 0x171),//16D//VERSION 153
	CRAFT_EFFECT(true, (short) 0x172),//16E//VERSION 153
	CRAFT_MAKE(true, (short) 0x173),//16F//VERSION 153
	CHANGE_ROOM_CHANNEL(true, (short) 0x176),//174//VERSION 153
	EVENT_CARD(true, (short) 0x999),//
	CHOOSE_SKILL(true, (short) 0x179),//175//VERSION 153
	SKILL_SWIPE(true, (short) 0x17A),//176//VERSION 153
	VIEW_SKILLS(true, (short) 0x17B),//177//VERSION 153
	CANCEL_OUT_SWIPE(true, (short) 0x167),//163//VERSION 153
	YOUR_INFORMATION(true, (short) 0x168),//164//VERSION 153
	FIND_FRIEND(true, (short) 0x167),//165//VERSION 153
	PINKBEAN_CHOCO_OPEN(true, (short) 0x16A),//166//VERSION 153
	PINKBEAN_CHOCO_SUMMON(true, (short) 0x16B),//167//VERSION 153
	BUY_SILENT_CRUSADE(true, (short) 0x181),//17D//VERSION 153
	TEMPEST_BLADES(true, (short) 0x184),//180//VERSION 153
	BOSSPVP_BOSS_SKILL(true, (short) 0x187),//183//VERSION 153
	UPDATE_HYPER(true, (short) 0x18A),//VERSION 153
	RESET_HYPER(true, (short) 0x18B),//VERSION 153
	DRESSUP_TIME(true, (short) 0x18C),//VERSION 153
	BUDDY_ADD(true, (short) 0x1A5),//gmcommand savejournal x 1A3//VERSION 153
	ATTENDANCE(true, (short) 0x213),//211//VERSION 153
	ATTENDANCE_BUTTON(true, (short) 0x1A6),//1A4//VERSION 153
	KAISER_SKILL_SHORTCUT(true, (short) 0x1B1),//1AF//VERSION 153
	MOVE_PET(true, (short) 0x1C6),//VERSION 153
	PET_CHAT(true, (short) 0x1C7),//VERSION 153
	PET_COMMAND(true, (short) 0x1C8),//1C7//VERSION 153
	PET_LOOT(true, (short) 0x1C9),//1C8//VERSION 153
	PET_AUTO_POT(true, (short) 0x1CB),//1C9//VERSION 153
	PET_IGNORE(true, (short) 0x1CC),//1CA//VERSION 153
	PET_AUTO_FEED(true, (short) 0x1CD),//1CB//VERSION 153
	MOVE_HAKU(true, (short) 0x1D0),//1CE//VERSION 153
	HAKU_ATTACK(true, (short) 0x1D1),//1CF//VERSION 153
	MOVE_SUMMON(true, (short) 0x1DB),//VERSION 153f
	SUMMON_ATTACK(true, (short) 0x1DC),//VERSION 153
	DAMAGE_SUMMON(true, (short) 0x1DD),//1D8//VERSION 153
	SUB_SUMMON(true, (short) 0x1DE),//1D9//VERSION 153
	REMOVE_SUMMON(true, (short) 0x1DF),//1DA//VERSION 153
	PVP_SUMMON(true, (short) 0x1DC),//1DB//VERSION 153
	MOVE_DRAGON(true, (short) 0x1E0),//1DE//VERSION 153
	USE_ITEM_QUEST(true, (short) 0x1E1),//1DF//VERSION 153
	MOVE_ANDROID(true, (short) 0x1E3),//1E1//VERSION 153
	UPDATE_QUEST(true, (short) 0x1E4),//1E2//VERSION 153
	QUEST_ITEM(true, (short) 0x1E5),//1E3//VERSION 153
	MOVE_HAKU_REBORN(true, (short) 0x1E7),//1E5//VERSION 153
	HAKU_BUFF(true, (short) 0x1E8),//1E6//VERSION 153
	MESSENGER_RANKING(true, (short) 0x200),//1FE//VERSION 153
	MOVE_FAMILIAR(true, (short) 0x1EE),//1EA//VERSION 153
	TOUCH_FAMILIAR(true, (short) 0x1ED),//1EB//VERSION 153
	ATTACK_FAMILIAR(true, (short) 0x1EC),//1EC//VERSION 153
	REVEAL_FAMILIAR(true, (short) 0x1F0FFFF),//1ED
	OS_INFORMATION(true, (short) 0x1F0FFFFF),//1EE
	QUICK_SLOT(true, (short) 0x1F4),//1F3
	GUILD_SKILL(true, (short) 0x1F5),//Version 153
	BUTTON_PRESSED(true, (short) 0x1F6),//1F5
	ZERO_WEAPON_UI(true, (short) 0x1F9),//1F8//VERSION 153
	ZERO_SCROLL_UI(true, (short) 0X1FB),//VERSION 153//NEW
	BOSS_OPERATION(true, (short) 0x242),
	PAM_SONG(true, (short) 0x999),//
	MOVE_LIFE(true, (short) 0x24A), //249
	MOVE_SAO_LIFE(true, (short) 0x24B),
	BLAZE_WIZARD(true, (short) 0x236), //Orbital Flame
	AUTO_AGGRO(true, (short) 0x238),//234//VERSION 153
	FRIENDLY_DAMAGE(true, (short) 0x21D),//21D//VERSION 153
	MONSTER_BOMB(true, (short) 0x1F6),//when open maple chat? //1F7//VERSION 153
	HYPNOTIZE_DMG(true, (short) 0x1F6),//VERSION 153
	ARROW_BLASTER(true, (short) 0x203),//202//VERSION 153
	MOB_BOMB(true, (short) 0x1F4),//VERSION 153
	MOB_NODE(true, (short) 0x999),//213 - v147
	DISPLAY_NODE(true, (short) 0x213),//214//VERSION 153
	MONSTER_CARNIVAL(true, (short) 0x1F7),//VERSION 153
	NPC_ACTION(true, (short) 0x260),//25F
	ITEM_PICKUP(true, (short) 0x265),//VERSION 153
	DAMAGE_REACTOR(true, (short) 0x268),//Version 153
	TOUCH_REACTOR(true, (short) 0x269),//guess//Check
	CLICK_REACTOR(true, (short) 0x26A),//guess//Check
	MAKE_EXTRACTOR(true, (short) 0x255),//guess//Check
	UPDATE_ENV(true, (short) 0x256),//guess//Check
	SNOWBALL(true, (short) 0x185),//186//Version 153
	LEFT_KNOCK_BACK(true, (short) 0x999),//183-186
	EVOLUTION_START(true, (short) 0x186),//187//Version 153
	CANDY_RANKING(true, (short) 0x188),//189//Version 153
	COCONUT(true, (short) 0x189),//18A//Version 153
	REWARD_UI(true, (short) 0x195),//194//Version 153
	SHIP_OBJECT(true, (short) 0x999),
	PARTY_SEARCH_START(true, (short) 0x284),
	PARTY_SEARCH_STOP(true, (short) 0x282),
	START_HARVEST(true, (short) 0x274),//273//Version 153
	STOP_HARVEST(true, (short) 0x275),//274//Version 153
	QUICK_MOVE(true, (short) 0x277),//276//Version 153
	ACTIVATE_RUNE(true, (short) 0x278),//new 150//Version 153
	RUNE_RESPONSE(true, (short) 0x279),//new 150 - byte 1 sucess 0 fail rune//Version 153
	DUNGEON_MOVE(true, (short) 0x265),//266//Version 153
	DUNGEON_EXIT(true, (short) 0x266),//267//Version 153
	CS_UPDATE(true, (short) 0x2CC),//2C1//Version 153
	BUY_CS_ITEM(true, (short) 0x2CD),//2C2//Version 153
	COUPON_CODE(true, (short) 0x2CE),//2C3//Version 153
	CASH_CATEGORY(true, (short) 0x2D3),//2C8//Version 153
	REWARD_EVENT(true, (short) 0x2D5),//2CA//Version 153
	PLACE_FARM_OBJECT(false, (short) 0x278),
	FARM_SHOP_BUY(false, (short) 0x27D),
	FARM_COMPLETE_QUEST(false, (short) 0x281),
	FARM_NAME(false, (short) 0x282),
	HARVEST_FARM_BUILDING(false, (short) 0x283),
	USE_FARM_ITEM(false, (short) 0x284),
	SELECT_BOSS_PVP(false, (short) 0x289),//each time someone clicks a boss in pvp ui
	BOSSPVP_SELECT_HANDICAP(false, (short) 0x28B),
	START_BOSSPVP(false, (short) 0x28C),
	RENAME_MONSTER(false, (short) 0x294),
	NURTURE_MONSTER(false, (short) 0x295),
	EXIT_FARM(false, (short) 0x299),
	FARM_QUEST_CHECK(false, (short) 0x29D),
	FARM_FIRST_ENTRY(false, (short) 0x2A8),
	GOLDEN_HAMMER(true, (short) 0x2E7),//2A9
	VICIOUS_HAMMER(true, (short) 0x40C),//1BF
	PYRAMID_BUY_ITEM(true, (short) 0x400),//TODO
	CLASS_COMPETITION(true, (short) 0x400),//TODO
	LUCKY_LOGOUT(true, (short) 0x343),//v155
	MAGIC_WHEEL(true, (short) 0x32E),//VERSION 153
	REWARD(true, (short) 0x32F),//323//VERSION 153
	BLACK_FRIDAY(true, (short) 0x2C3),//2C3
	UPDATE_RED_LEAF(true, (short) 0x231),//231
	RANDOM_BEAST_GIFT(true, (short) 0x327),
	SAO_REQUEST(true, (short) 0x34E);// 327
    private short code = -2;

    @Override
    public void setValue(short code) {
        this.code = code;
    }

    @Override
    public final short getValue() {
        return code;
    }
    private final boolean CheckState;

    private RecvPacketOpcode() {
        this.CheckState = true;
    }

    private RecvPacketOpcode(final boolean CheckState) {
        this.CheckState = CheckState;
    }

    private RecvPacketOpcode(final boolean CheckState, short code) {
        this.CheckState = CheckState;
        this.code = code;
    }

    public final boolean NeedsChecking() {
        return CheckState;
    }

    public static String nameOf(short value) {
        for (RecvPacketOpcode header : RecvPacketOpcode.values()) {
            if (header.getValue() == value) {
                return header.name();
            }
        }
        return "UNKNOWN";
    }
}
