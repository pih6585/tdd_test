package dice.domain;

import java.util.Objects;

public class PlayerScore {

	private final String name;
	private final int firstDice;
	private final int secondDice;
	private final int score;

	public PlayerScore(String name, int firstDice, int secondDice) {
		this.name = name;
		this.firstDice = firstDice;
		this.secondDice = secondDice;
		this.score = playDiceSum(firstDice, secondDice);
	}

	private int playDiceSum(int firstDice, int secondDice) {
		return firstDice + secondDice;
	}

	public String getName() {
		return name;
	}

	public int getFirstDice() {
		return firstDice;
	}

	public int getSecondDice() {
		return secondDice;
	}

	public int getScore() {
		return score;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PlayerScore that = (PlayerScore)o;
		return firstDice == that.firstDice && secondDice == that.secondDice && score == that.score
			&& Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, firstDice, secondDice, score);
	}
}
