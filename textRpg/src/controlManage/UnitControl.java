package controlManage;

import java.util.ArrayList;
import java.util.Random;

import units.Monster;
import units.Player;

public class UnitControl {
	
	private Random ran;
	
	private static ArrayList <Player> playerList;
	private static ArrayList <Monster> monsterList;
	
	private final String path = "controlManage.";
	private String monsters[] = { "MonsterBat" };
	
	private UnitControl() {
		playerList = new ArrayList <Player>();
		monsterList = new ArrayList <Monster>();
		ran = new Random();
	}
	
	private static UnitControl instance = new UnitControl();
	public static UnitControl getInstance() {
		return instance;
	}
}