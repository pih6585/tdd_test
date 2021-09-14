package dice.domain.player;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberTest {

	private static final String NUMBER_TYPE_ERROR_MESSAGE = "숫자가 아닙니다.";
	private final int MIN_NUMBER = 2;
	private final int MAX_NUMBER = 4;

	@Test
	@DisplayName("참가자 인원수 생성")
	public void createPlayerNumber(){
		Number number = new Number(2);
		assertThat(number).isEqualTo(new Number(2));
	}

	@Test
	@DisplayName("참가자 인원수 타입에러 발생")
	public void playerNameError(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Number number = new Number(checkNumberType("3"));

			fail("참가자 인원수 입력 에러가 발생해야한다.");
		});
	}

	private int checkNumberType(Object inputNumber){
		if(!(inputNumber instanceof Integer)){
			throw new IllegalArgumentException(NUMBER_TYPE_ERROR_MESSAGE);
		}
		return ((Integer)inputNumber).intValue();
	}
}