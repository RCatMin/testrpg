package units;

import controlManage.IOControl;

public abstract class Monster {

	int hp; // 체력
	int maxHp; // 최대 체력
	int power; // 공격력
	String monsterName; // 몬스터 이름
	String type; // 몬스터 등급

	Monster(){
		
	}
	
	public Monster (String monsterName, int maxHp, int power, String type) {
		this.monsterName = monsterName;
		this.hp = maxHp;
		this.maxHp = maxHp;
		this.power = power;
		this.type = type;
	}
	
	public Monster (int maxHp, int power, String type) {
		this.hp = maxHp;
		this.maxHp = maxHp;
		this.type = type;
	}
	
	
	public void attack (Unit target) {
		
	}
	
	public void printMonster() {
		String info = String.format("체력 : %3d / %3d\n등급 : %2s", hp, maxHp, type);
		IOControl.printString(info);
	}
}
