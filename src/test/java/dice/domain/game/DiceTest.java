package dice.domain.game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiceTest {

	public static final int DICE_MIN_VALUE = 1;
	public static final int DICE_MAX_VALUE = 6;
	public static final int SCORE_MIN_VALUE = 1;
	public static final int SCORE_MAX_VALUE = 12;

	@Test
	@DisplayName("주사위 굴려 결과 생성")
	public void createDiceResult() {
		Dice dice = new Dice(new DiceRoll().getDiceValue(), new DiceRoll().getDiceValue());
		assertThat(dice.getFirstDice()).isBetween(DICE_MIN_VALUE, DICE_MAX_VALUE);
		assertThat(dice.getSecondDice()).isBetween(DICE_MIN_VALUE, DICE_MAX_VALUE);
	}

	@Test
	@DisplayName("주사위 결과 합 확인")
	public void checkValidScore() {
		Dice dice = new Dice(new DiceRoll().getDiceValue(), new DiceRoll().getDiceValue());
		assertThat(dice.getFirstDice() + dice.getSecondDice()).isBetween(SCORE_MIN_VALUE, SCORE_MAX_VALUE);
	}

}
