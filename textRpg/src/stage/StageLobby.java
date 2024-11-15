package stage;

import java.util.HashMap;
import java.util.Map;

public class StageLobby {
	
	Map <String, Stage> stageMenu;
	
	public void lobby() {
		stageMenu = new HashMap <String, Stage>();
		stageMenu.put("전투", new StageBattle());
		stageMenu.put("길드", new StageGuild());
		
	}
	
}
