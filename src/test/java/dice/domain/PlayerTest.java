package dice.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
/*
	private static final int DICE_MIN_NUMBER = 1;
	private static final int DICE_MAX_NUMBER = 6;
	private static final int SCORE_MIN_NUMBER = 2;
	private static final int SCORE_MAX_NUMBER = 12;
	private List<Player> players;

	@BeforeEach
	public void testDataSetting() {
		this.players = Arrays.asList(
			new Player(new Name("a"), new Dice(diceRoll(), diceRoll())),
			new Player(new Name("b"), new Dice(diceRoll(), diceRoll())),
			new Player(new Name("c"), new Dice(diceRoll(), diceRoll()))
		);
	}

	@Test
	@DisplayName("주사위 값 생성")
	public void createDiceResult() {
		int diceResult = diceRoll();
		assertThat(diceResult).isBetween(DICE_MIN_NUMBER, DICE_MAX_NUMBER);
	}

	@Test
	@DisplayName("참가자 주사위 합 생성")
	public void createPlayerByScore() {
		Player player = new Player(new Name("a"), new Dice(diceRoll(), diceRoll()));
		assertThat(player.findDiceSum()).isBetween(SCORE_MIN_NUMBER, SCORE_MAX_NUMBER);
	}

	@Test
	@DisplayName("참가자 가장높은 점수확인")
	public void checkScoreMax() {
		int scoreMax = getPlayerByScoreMax(players);
		assertThat(scoreMax).isBetween(SCORE_MIN_NUMBER, SCORE_MAX_NUMBER);
	}

	@Test
	@DisplayName("우승자 확인")
	public void checkWinner() {
		String winner = getWinner(players, getPlayerByScoreMax(players));
		assertThat(winner).isNotNull();
	}

	private int diceRoll() {
		return 1;
	}

	private static int getPlayerByScoreMax(List<Player> players) {
		return players.stream()
			.mapToInt(v -> v.findDiceSum())
			.max()
			.orElseThrow(RuntimeException::new);
	}

	private String getWinner(List<Player> players, int scoreMax) {
		return IntStream.range(0, players.size())
			.filter(i -> players.get(i).findDiceSum() == scoreMax)
			.mapToObj(i -> players.get(i).getName().getName())
			.collect(Collectors.joining(","));
	}*/
}
