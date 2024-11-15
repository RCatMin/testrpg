package textRpg;

import controlManage.IOControl;
import stage.StageLobby;

public class GameManager {
	private StageLobby lobby;
	private boolean isRun = true;
	
	private GameManager() {
		this.lobby = new StageLobby();
	}
	
	private static GameManager instance = new GameManager();
	
	public static GameManager getInstance() {
		return instance;
	}
	
	public void run() {
		start();
		String input = IOControl.inputString("\n여기에 입력하세요 : ");
		if (input.equals("시작")) {
			isRun = lobby.activate();
		} else if (input.equals("종료")){
			end();
			isRun = false;
		}
		
		if (isRun = false) {
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