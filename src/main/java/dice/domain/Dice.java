package dice.domain;

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
}
