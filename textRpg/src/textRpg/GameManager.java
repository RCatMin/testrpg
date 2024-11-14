package textRpg;

import controlManage.IOControl;

public class GameManager {
	private GameManager() {
		
	}
	
	private static GameManager instance = new GameManager();
	
	public static GameManager getInstance() {
		return instance;
	}
	
	public void run() {
		start();
		String input = IOControl.inputString("\n여기에 입력하세요 : ");
		if (input.equals("시작")) {
			
		} else {
			end();
			return;
		}
	}
	
	private void start() {
		IOControl.printString("게임을 시작하려면 '시작' 이라고 입력하세요\n아니면 아무 키를 입력하세요");
	}
	
	private void end() {
		IOControl.printString("게임을 종료합니다.");
	}

}