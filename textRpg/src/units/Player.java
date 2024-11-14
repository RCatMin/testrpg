package units;

import controlManage.IOControl;

public class Player {

	String name; // 이름
	int level; // 레벨
	int hp;
	int maxHp; // 최대 HP
	int att; // 공격
	int def; // 방어
	int exp; // 경험치
	boolean party; // 파티 가입 여부

	public Player() {

	}

	public Player(String name, int level, int hp, int maxHp, int att, int def, int exp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = maxHp;
		this.att = att;
		this.def = def;
		this.exp = exp;
	}

	public Player(String name, int level, int hp, int maxHp, int att, int def, int exp, boolean party) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.maxHp = maxHp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.party = party;
	}

	public void attack (Monster target) {
		
	}
	
	public void printPlayer() {
		String info = String.format("이름 : %10s\n레벨 : %3d\n체력 : %5d/%5d\n공격력/방어력 : %3d/%3d", name, level, hp, maxHp, att, def);
		IOControl.printString(info);
	}
}
