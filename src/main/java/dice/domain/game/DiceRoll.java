package dice.domain.game;

public class DiceRoll {

	private final int diceValue;

	public DiceRoll() {
		this.diceValue = roll();
	}

	public int roll() {
		return new DiceResult().getDiceResult();
	}

	public int getDiceValue() {
		return diceValue;
	}
}
