package dice.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

	private static final String NUMBER_TYPE_ERROR_MESSAGE = "숫자가 아닙니다.";
	private static final String NAME_LENGTH_ERROR_MESSAGE = "이름 길이를 확인해주세요";
	private static final String LANGUAGE_ERROR_MESSAGE = "이름은 영어만 입력가능합니다.";
	private static final String NAME_OVERLAP_ERROR_MESSAGE = "이름이 중복됩니다.";
	private static final int MIN_LENGTH_NAME = 1;
	private static final int MAX_LENGTH_NAME = 5;

	@Test
	@DisplayName("참가자 인원수 생성")
	public void createPlayerNumber(){
		PlayerNumber number = new PlayerNumber(2);
		assertThat(number).isEqualTo(new PlayerNumber(2));
	}

	@Test
	@DisplayName("참가자 인원수 타입에러 발생")
	public void playerNumberError(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			PlayerNumber number = new PlayerNumber(checkNumberType("3"));

			fail("참가자 인원수 입력 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 생성")
	public void createPlayerName(){
		String name = "a";
		assertThat(name).isEqualTo("a");
	}

	@Test
	@DisplayName("참가자 이름 영문에러 발생")
	public void playerNameEnglishError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			checkNameLanguage("한글");
			fail("영문이 아닌이른은 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 길이에러 발생")
	public void playerNameLengthError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			checkNameLength("abcdef");
			fail("이름은 1자리 이상 5자리 이하 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 중복에러 발생")
	public void playerNameOverlapError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			List<String> players = Arrays.asList("a", "b", "a");
			checkNamesOverlap(players);

			fail("이름중복 에러가 발생해야한다.");
		});
	}
	private int checkNumberType(Object inputNumber){
		if(!(inputNumber instanceof Integer)){
			throw new IllegalArgumentException(NUMBER_TYPE_ERROR_MESSAGE);
		}
		return ((Integer)inputNumber).intValue();
	}

	private static String checkNameLength(String name) {
		if (name.length() < MIN_LENGTH_NAME || name.length() > MAX_LENGTH_NAME) {
			throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
		}
		return name;
	}

	private static String checkNameLanguage(String name) {
		boolean english = name.matches("^[a-zA-Z]*$");
		if (!english) {
			throw new IllegalArgumentException(LANGUAGE_ERROR_MESSAGE);
		}
		return name;
	}

	private static List<String> checkNamesOverlap(List<String> names) {
		if (names.size() != names.stream().distinct().count()) {
			throw new IllegalArgumentException(NAME_OVERLAP_ERROR_MESSAGE);
		}
		return names;
	}
}
