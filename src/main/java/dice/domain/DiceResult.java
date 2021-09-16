package dice.domain;

import java.util.Objects;
import java.util.Random;

public class DiceResult {
	private static final int DICE_MAX_NUMBER = 6;
	private static final int DICE_MIN_NUMBER = 1;
	private static final Random random = new Random();
	private final int diceResult;

	public DiceResult(){
		this.diceResult = randomResult();
	}

	private int randomResult() {
		return random.nextInt(DICE_MAX_NUMBER) + DICE_MIN_NUMBER;
	}

	public int getDiceResult() {
		return diceResult;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		DiceResult that = (DiceResult)o;
		return diceResult == that.diceResult;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diceResult);
	}
}
