package dice.domain;

import java.util.Random;

public class DiceResult {
	private static final int DICE_MAX_NUMBER = 6;
	private static final int DICE_MIN_NUMBER = 1;
	private static final Random random = new Random();

	public DiceResult() {
	}

	public static int randomResult() {
		return random.nextInt(DICE_MAX_NUMBER) + DICE_MIN_NUMBER;
	}

}
