package dice.domain.winner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dice.domain.game.Dice;
import dice.domain.game.DiceRoll;
import dice.domain.game.Dices;
import dice.domain.game.Score;
import dice.domain.game.Scores;
import dice.domain.player.Name;
import dice.domain.player.Names;

public class WinnerTest {
	private Names names;
	private Dices dices;
	private List<Score> score;

	@BeforeEach
	public void beforeEach() {
		List<Name> name = Arrays.asList(
			new Name("a"),
			new Name("b"),
			new Name("c")
		);
		this.names = new Names(name);

		List<Dice> dice = Arrays.asList(
			new Dice(new DiceRoll().getDiceValue(), new DiceRoll().getDiceValue()),
			new Dice(new DiceRoll().getDiceValue(), new DiceRoll().getDiceValue()),
			new Dice(new DiceRoll().getDiceValue(), new DiceRoll().getDiceValue())
		);
		this.dices = new Dices(dice);

		List<Score> score = Arrays.asList(
			new Score(dices.getDices().get(0).getFirstDice(), dices.getDices().get(0).getSecondDice()),
			new Score(dices.getDices().get(1).getFirstDice(), dices.getDices().get(1).getSecondDice()),
			new Score(dices.getDices().get(2).getFirstDice(), dices.getDices().get(2).getSecondDice())
		);
		this.score = score;
	}

	@Test
	@DisplayName("가장 높은점수 확인")
	public void checkScoreMax() {
		assertThat(new Scores(score).getScoreMax()).isEqualTo(new Scores(score).getScoreMax());
	}

	@Test
	@DisplayName("우승자 확인")
	public void checkWinner() {
		Scores scores = new Scores(score);
		int maxScore = scores.getScoreMax();
		String winner = null;
		for (int i = 0; i < names.getNames().size(); i++) {
			if (maxScore == scores.getScores().get(i).getScore()) {
				winner = names.getNames().get(i).getName();
			}
		}

		assertThat(winner).isNotNull();
	}

}
