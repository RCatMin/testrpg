package stage;

import java.util.HashMap;
import java.util.Map;

import controlManage.IOControl;

public class StageLobby {
	
	Map <String, Stage> stageMenu;
	
	public void lobby() {
		stageMenu = new HashMap <String, Stage>();
		stageMenu.put("전투", new StageBattle());
		stageMenu.put("길드", new StageGuild());
		stageMenu.put("상점", new StageStore());
		stageMenu.put("인벤토리", new StageInventory());
	}
	
	public void menu() {
		printMenu();
		while(true) {			
			String input = IOControl.inputString("\n여기에 입력하세요 : ");
			
			// containsKey : 맵에서 인자로 보낸 키가 있으면 true 없으면 false를 반환한다.
			if (stageMenu.containsKey(input)) {
				stageMenu.get(input).activate();
			} else if (input.equals("게임종료")) {
				IOControl.printString("게임을 종료합니다.");
				break;
			}
		}
	}
	
	public void printMenu() {
		String message = 
				"""
				===============================
							메인 로비
				
				[전투]	[길드]	[상점]	[게임종료]
				
				===============================
				""";
				
		IOControl.printString(message);
		
	}
	
}
