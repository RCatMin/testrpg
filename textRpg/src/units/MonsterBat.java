package units;

public class MonsterBat extends Monster {
	MonsterBat() {
		hp = 30;
		maxHp = 30;
		power = 10;
		type = "일반";
	}

	void skill() {
		System.out.println("적 한명에게 침묵 시전");
	}

}
