package dice.domain.game;

import java.util.Objects;

public class Score {
	private final int score;

	public Score(int firstDice, int secondDice) {
		this.score = diceSum(firstDice, secondDice);
	}

	private int diceSum(int firstDice, int secondDice) {
		return firstDice + secondDice;
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
		Score score1 = (Score)o;
		return score == score1.score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(score);
	}
}
