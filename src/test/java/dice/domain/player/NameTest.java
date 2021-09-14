package dice.domain.player;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {

	@Test
	@DisplayName("참가자 이름 생성")
	public void createPlayerName(){
		Name name = new Name("aaa");
		assertThat(name).isEqualTo(new Name("aaa"));
	}

	@Test
	@DisplayName("참가자 이름 영문에러 발생")
	public void playerNameEnglishError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Name name = new Name("한글");
			fail("영문이 아닌이른은 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 길이에러 발생")
	public void playerNameLengthError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Name name = new Name("abcdef");
			fail("이름은 1자리 이상 5자리 이하 에러가 발생해야한다.");
		});
	}

	@Test
	@DisplayName("참가자 이름 중복에러 발생")
	public void playerNameOverlapError() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			List<Name> nameList = Arrays.asList(
				new Name("a"),
				new Name("b"),
				new Name("a")
			);

			Names names = new Names(nameList);

			fail("이름중복 에러가 발생해야한다.");
		});
	}
}