package dice.domain.game;

import java.util.Objects;

public class Dice {

	private final int firstDice;
	private final int secondDice;

	public Dice(int firstDice, int secondDice) {
		this.firstDice = firstDice;
		this.secondDice = secondDice;
	}

	public int getFirstDice() {
		return firstDice;
	}

	public int getSecondDice() {
		return secondDice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Dice dice = (Dice)o;
		return firstDice == dice.firstDice && secondDice == dice.secondDice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstDice, secondDice);
	}
}
