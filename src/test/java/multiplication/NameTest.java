package multiplication;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import multiplication.domain.Name;

public class NameTest {

	@Test
	void 입력된_이름_검증() throws IllegalAccessException {
		Name name = new Name("hyun");
		assertThat(name.getName()).isEqualTo("hyun");
	}

	@Test
	void 입력된_이름_널_예외발생(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Name name = new Name(null);

			fail("null 에러가 발생해야한다.");
		});
	}

	@Test
	void 입력된_이름_공백_예외발생(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Name name = new Name("");

			fail("공백 에러가 발생해야한다.");
		});
	}

	@Test
	void 입력된_이름_5글자_이하_검증() throws IllegalAccessException {
		Name name = new Name("hyun");
		assertThat(name.getName()).isEqualTo("hyun");
	}

	@Test
	void 입력된_이름_5글자_초과_예외발생(){
		Assertions.assertThrows(IllegalAccessException.class,()-> {
			Name name = new Name("123456");

			fail("길이 제한 에러가 발생해야한다.");
		});
	}

}
