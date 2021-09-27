package dice.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiceTest {

	private final int MIN_DICE = 1;
	private final int MAX_DICE = 6;

	@Test
	@DisplayName("주사위 값 생성 및 경계값 확인")
	public void createDiceValue(){
		Dice resultDice = new Dice(1, 6);
		assertThat(resultDice.getFirstDice()).isEqualTo(MIN_DICE);
		assertThat(resultDice.getSecondDice()).isEqualTo(MAX_DICE);
	}

	@Test
	@DisplayName("주사위 임의값 생성")
	public void createDiceValueRandom() {
		Dice resultDice = new Dice(diceRoll(), diceRoll());
		assertThat(resultDice.getFirstDice()).isBetween(MIN_DICE, MAX_DICE);
		assertThat(resultDice.getSecondDice()).isBetween(MIN_DICE, MAX_DICE);
	}

	private int diceRoll() {
		return DiceResult.randomResult();
	}
}
