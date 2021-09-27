package dice.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {
	public static final int MIN_DICE = 1;
	public static final int MAX_DICE = 6;

	@Test
	@DisplayName("참가자 의 주사위 값 생성")
	public void createPlayerByDice() {
		Player player = new Player(new Name("a"), new Dice(1, 2));
		assertThat(player.findName()).isEqualTo("a");
		assertThat(player.findFirstDice() == 1).isTrue();
		assertThat(player.findSecondDice() == 2).isTrue();
	}

	@Test
	@DisplayName("참가자 의 주사위 임의값 생성")
	public void createPlayerByDiceRandom() {
		Player player = new Player(new Name("a"), new Dice(diceRoll(), diceRoll()));
		assertThat(player.findName()).isEqualTo("a");
		assertThat(player.findFirstDice()).isBetween(MIN_DICE, MAX_DICE);
		assertThat(player.findSecondDice()).isBetween(MIN_DICE, MAX_DICE);
	}

	private int diceRoll() {
		return DiceResult.randomResult();
	}

}
