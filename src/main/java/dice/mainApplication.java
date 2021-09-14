package dice;

import dice.controller.DiceController;

public class mainApplication {
	public static void main(String[] args) {
		DiceController diceController = new DiceController();
		diceController.diceGameStart();
	}
}
