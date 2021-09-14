package dice.domain.game;

import java.util.Random;

public class DiceResult {
	private static final int DICE_MAX_NUMBER = 6;
	private static final int DICE_MIN_NUMBER = 1;
	private final int diceResult;
	private static final Random random = new Random();

	public DiceResult() {
		this.diceResult = randomResult();
	}

	private int randomResult() {
		return random.nextInt(DICE_MAX_NUMBER) + DICE_MIN_NUMBER;
	}

	public int getDiceResult() {
		return diceResult;
	}
}
