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

	private static final int DICE_MIN_NUMBER = 1;
	private static final int DICE_MAX_NUMBER = 6;
	private static final int SCORE_MIN_NUMBER = 2;
	private static final int SCORE_MAX_NUMBER = 12;
	private List<PlayerScore> scoreByPlayer;

	@BeforeEach
	public void testDataSetting() {
		this.scoreByPlayer = Arrays.asList(
			new PlayerScore("a", diceRoll(), diceRoll()),
			new PlayerScore("b", diceRoll(), diceRoll()),
			new PlayerScore("c", diceRoll(), diceRoll())
		);
	}

	@Test
	@DisplayName("주사위 값 생성")
	public void createDiceResult() {
		int diceResult = diceRoll();
		assertThat(diceResult).isBetween(DICE_MIN_NUMBER, DICE_MAX_NUMBER);
	}

	@Test
	@DisplayName("참가자 점수 생성")
	public void createPlayerByScore() {
		PlayerScore scoreByPlayer = new PlayerScore("a", diceRoll(), diceRoll());
		assertThat(scoreByPlayer.getScore()).isBetween(SCORE_MIN_NUMBER, SCORE_MAX_NUMBER);
	}

	@Test
	@DisplayName("참가자 가장높은 점수확인")
	public void checkScoreMax() {
		int scoreMax = getPlayerByScoreMax(scoreByPlayer);
		assertThat(scoreMax).isBetween(SCORE_MIN_NUMBER, SCORE_MAX_NUMBER);
	}

	@Test
	@DisplayName("우승자 확인")
	public void checkWinner() {
		String winner = getWinner(scoreByPlayer, getPlayerByScoreMax(scoreByPlayer));
		assertThat(winner).isNotNull();
	}

	private int diceRoll() {
		return new DiceResult().getDiceResult();
	}

	private static int getPlayerByScoreMax(List<PlayerScore> playerByScore) {
		return playerByScore.stream()
			.mapToInt(v -> v.getScore())
			.max()
			.orElseThrow(RuntimeException::new);
	}

	private String getWinner(List<PlayerScore> scoreByPlayer, int scoreMax) {
		return IntStream.range(0, scoreByPlayer.size())
			.filter(i -> scoreByPlayer.get(i).getScore() == scoreMax)
			.mapToObj(i -> scoreByPlayer.get(i).getName())
			.collect(Collectors.joining(","));
	}
}
