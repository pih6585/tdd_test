package dice.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameTest {

	private static final String NAME_OVERLAP_ERROR_MESSAGE = "이름이 중복됩니다.";

	@Test
	@DisplayName("참가자 이름 생성")
	public void createPlayerName() {
		Name name = new Name("a");
		assertThat(name).isEqualTo(new Name("a"));
	}

	@Test
	@DisplayName("참가자 이름 영문에러 발생")
	public void playerNameEnglishError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Name("한글");
			fail("영문이 아닌이른은 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 길이에러 발생")
	public void playerNameLengthError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Name("abcdef");
			fail("이름은 1자리 이상 5자리 이하 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 중복에러 발생")
	public void playerNameOverlapError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			List<Name> names = Arrays.asList(
				new Name("a"),
				new Name("b"),
				new Name("a"));
			checkNamesOverlap(names);
			fail("이름중복 에러가 발생해야한다.");
		});
	}

	private static void checkNamesOverlap(List<Name> names) {
		if (names.size() != names.stream().distinct().count()) {
			throw new IllegalArgumentException(NAME_OVERLAP_ERROR_MESSAGE);
		}
	}
}
