package dice.domain;

import java.util.Objects;

public class Player {
	private final Name name;
	private final Dice dice;

	public Player(Name name, Dice dice) {
		this.name = name;
		this.dice = dice;
	}

	public Name getName() {
		return name;
	}

	public Dice getDice() {
		return dice;
	}

	public int findDiceSum() {
		return dice.getFirstDice() + dice.getSecondDice();
	}

	public String findName() {
		return name.getName();
	}

	public String findDice() {
		return dice.getFirstDice() + " - " + dice.getSecondDice();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Player player = (Player)o;
		return Objects.equals(name, player.name) && Objects.equals(dice, player.dice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, dice);
	}
}
