package dice.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberTest {

	private static final String NUMBER_TYPE_ERROR_MESSAGE = "숫자가 아닙니다.";
	private static final int MIN_NUMBER = 2;
	private static final int MAX_NUMBER = 4;

	@Test
	@DisplayName("참가자 인원수 생성")
	public void createPlayerNumber() {
		Number number = new Number(2);
		assertThat(number).isEqualTo(new Number(2));
	}

	@Test
	@DisplayName("참가자 인원수 경계값 확인")
	public void checkPlayerNumber(){
		Number number = new Number(2);
		assertThat(number.getNumber() >= MIN_NUMBER && number.getNumber() <= MAX_NUMBER).isTrue();
	}

	@Test
	@DisplayName("참가자 인원수 타입에러 발생")
	public void playerNumberError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Number(checkNumberType("3"));
			fail("참가자 인원수 입력 에러가 발생해야한다.");
		});
	}

	private int checkNumberType(Object inputNumber) {
		if (!(inputNumber instanceof Integer)) {
			throw new IllegalArgumentException(NUMBER_TYPE_ERROR_MESSAGE);
		}
		return ((Integer)inputNumber).intValue();
	}

}
