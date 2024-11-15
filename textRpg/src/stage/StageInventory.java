package stage;

import java.util.HashMap;
import java.util.Map;

import controlManage.IOControl;
import inventory.EnhanceItem;
import inventory.EquipItem;
import inventory.SellItem;

public class StageInventory implements Stage{

	Map<String, inventory.Inventory> inventoryMenu;
	Map<String, Stage> stageMenu;
	
	
	public StageInventory() {
		inventoryMenu = new HashMap<String, inventory.Inventory>();
		inventoryMenu.put("장비착용", new EquipItem());
		inventoryMenu.put("장비판매", new SellItem());
		inventoryMenu.put("장비강화", new EnhanceItem());
	}
	
	public void CheckBack() {
		stageMenu = new HashMap<String, Stage>();
		stageMenu.put("뒤로가기", (Stage) new StageLobby());
	}
	
	public void activate() {
		inventoryMenu();
		while (true) {
			String inputMenu = IOControl.inputString("\n여기에 입력하세요 : ");
			if (inventoryMenu.containsKey(inputMenu)) {
				inventoryMenu.get(inputMenu).activate();
			} 
			
			if (stageMenu.containsKey(inputMenu)) {
				stageMenu.get(inputMenu).activate();
			}
		}
	}
	
	public void inventoryMenu() {
		String message = """
				============================================
									메인 로비
			
				[장비 착용]	[장비 판매]	[장비 강화]	[뒤로가기]
				
				============================================
				""";
		IOControl.printString(message);
	}

}
