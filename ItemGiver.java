import item.Boot;
import item.Sword;
import player.Player;

public class ItemGiver {
	
	private Player myPlayer;
	
	public ItemGiver(Player thePlayer) {
		this.myPlayer = thePlayer;
	}
	
	public void giveItem() {
		myPlayer.playerInventory.inventory.add(new Boot("Ordinary Boot", 5, "brown"));
		myPlayer.playerInventory.inventory.add(new Sword("Ordinary Sword", 3));
	}
}
