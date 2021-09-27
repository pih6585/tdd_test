package dice.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayersTest {

	private static final int SCORE_MIN_NUMBER = 2;
	private static final int SCORE_MAX_NUMBER = 12;
	private Players players;

	@BeforeEach
	public void testDataSetting() {
		this.players = new Players(Arrays.asList(
			new Player(new Name("a"), new Dice(diceRoll(), diceRoll())),
			new Player(new Name("b"), new Dice(diceRoll(), diceRoll())),
			new Player(new Name("c"), new Dice(diceRoll(), diceRoll()))
		));
	}

	@Test
	@DisplayName("참가자 가장높은 점수확인")
	public void checkScoreMax() {
		int scoreMax = players.findScoreMax();
		assertThat(scoreMax).isBetween(SCORE_MIN_NUMBER, SCORE_MAX_NUMBER);
	}

	@Test
	@DisplayName("우승자 확인")
	public void checkWinner() {
		String winner = getWinner(players, players.findScoreMax());
		assertThat(winner).isNotNull();
	}

	private int diceRoll() {
		return DiceResult.randomResult();
	}

	private String getWinner(Players players, int scoreMax) {
		return IntStream.range(0, players.findSize())
			.filter(i -> players.player(i).findDiceSum() == scoreMax)
			.mapToObj(i -> players.player(i).findName())
			.collect(Collectors.joining(","));
	}

}
