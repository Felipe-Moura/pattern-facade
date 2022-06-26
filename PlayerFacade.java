import player.Player;

public class PlayerFacade {
	
	private Player myPlayer;
	
	public PlayerFacade(Player thePlayer) {
		this.myPlayer = thePlayer;
		this.myPlayer.initialPosition();
	}
	
	public void playerMovement() {
		int distance = 0;
		
		distance += myPlayer.getBaseMove();
		
		for(int i = 0; i < myPlayer.playerInventory.inventory.size(); i++) {
			if(myPlayer.playerInventory.inventory.get(i).getType() == "Boot") {
				distance += myPlayer.playerInventory.inventory.get(i).getEffect();
			}
		}
		
		System.out.println("The player moved " + distance + " squares forward");
	}
	
	public void playerDamage() {
		int damage = 0;
		
		damage += myPlayer.getBaseDamage();
		
		for(int i = 0; i < myPlayer.playerInventory.inventory.size(); i++) {
			if(myPlayer.playerInventory.inventory.get(i).getType() == "Sword") {
				damage += myPlayer.playerInventory.inventory.get(i).getEffect();
			}
		}
		
		System.out.println("The player has dealt " + damage + " points of damage");
	}

}
