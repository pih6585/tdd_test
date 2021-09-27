package dice.domain;

public class Player {
	private final Name name;
	private final Dice dice;

	public Player(Name name, Dice dice) {
		this.name = name;
		this.dice = dice;
	}

	public String findName() {
		return this.name.getName();
	}

	public int findFirstDice() {
		return this.dice.getFirstDice();
	}

	public int findSecondDice() {
		return this.dice.getSecondDice();
	}

	public int findDiceSum() {
		return this.dice.getFirstDice() + this.dice.getSecondDice();
	}

}
