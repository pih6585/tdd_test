package multiplication;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import multiplication.controller.MultipliceController;
import multiplication.domain.Number;

public class NumberTest {

	@Test
	void 숫자_및_범위_입력_검증() throws IllegalAccessException {
		Number number = new Number("2");
		assertThat(number.getNumber()).isEqualTo("2");

		Number range = new Number("3");
		assertThat(range.getNumber()).isEqualTo("3");
	}

	@Test
	void 숫자_및_범위_NULL_예외처리(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Number number = new Number(null);

			fail("null 에러가 발생해야한다.");
		});
	}

	@Test
	void 숫자_및_범위_공백_예외처리(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Number number = new Number("");

			fail("공백 에러가 발생해야한다.");
		});
	}

	@Test
	void 숫자_및_범위_1이상_50이하_검증() throws IllegalAccessException {
		Number number = new Number("1");
		assertThat(number.getNumber()).isEqualTo("1");

		Number range = new Number("50");
		assertThat(range.getNumber()).isEqualTo("50");
	}

	@Test
	void 숫자_및_범위_1미만_50초과_예외발생(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Number number = new Number("0");

			fail("숫자 및 범위 입력 에러가 발생해야한다.");
		});
	}

	@Test
	void 숫자_및_범위_자료형_예외발생(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Number number = new Number("aaa");

			fail("형변환 에러가 발생해야한다.");
		});
	}

	@Test
	void 계산값_검증() throws IllegalAccessException {
		List<Integer> numberList = Arrays.asList(2, 4, 6);
		assertThat(numberList).isEqualTo(new MultipliceController().checkCalculationResult("2", "3"));
	}

}
