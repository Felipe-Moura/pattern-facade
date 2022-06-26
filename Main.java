import player.Player;

public class Main {

	public static void main(String[] args) {
		
		Player carlos = new Player(10, 5);
		ItemGiver basicItems = new ItemGiver(carlos);
		PlayerFacade playerController = new PlayerFacade(carlos);
		
		basicItems.giveItem();
		
		playerController.playerMovement();
		playerController.playerDamage();

	}

}
