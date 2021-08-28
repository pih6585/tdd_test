package multiplication;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import multiplication.service.MultipliceService;

public class MultipleTest {
	private String player;
	private int number;
	private int range;

	@BeforeEach
	void setUp(){
		player = "Hyun";
		number = 2;
		range = 3;
	}

	@Test
	void 실행한_사람_검증_성공(){
		assertTrue(new MultipliceService().playerCheck(player),"입력된 플레이어 이름이 공백 이거나 null 이 아니어야 한다.");
	}

	@Test
	void 구구단_숫자_1_50_검증(){
		assertTrue(new MultipliceService().numberCheck(number),"입력된 숫자가 1이상 50이하 값이어야 한다.");
	}

	@Test
	void 구구단_숫자_및_계산값_검증(){
		assertTrue(new MultipliceService().numberCheck(number),"입력된 숫자가 1이상 50이하 값이어야 한다.");
		assertTrue(new MultipliceService().numberCheck(range),"입력된 구구단 범위가 1이상 50이하 값이어야 한다.");

		List<String> list = Arrays.asList("2 * 1 = 2", "2 * 2 = 4", "2 * 3 = 6");
		List<String> multipliceValue = new MultipliceService().multipliceValue(number, range);

		assertEquals(list,multipliceValue,"구구단 입력된 list 값과 계산기로 계산된 값이 같아야 한다.");
	}
}
