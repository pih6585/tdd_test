package dice.domain;

import java.util.Objects;

public class Name {

	private static final String NAME_LENGTH_ERROR_MESSAGE = "이름 길이를 확인해주세요";
	private static final String LANGUAGE_ERROR_MESSAGE = "이름은 영어만 입력가능합니다.";
	private static final int MIN_LENGTH_NAME = 1;
	private static final int MAX_LENGTH_NAME = 5;
	private final String name;

	public Name(String name) {
		checkNameLength(name);
		checkNameLanguage(name);
		this.name = name;
	}

	private static void checkNameLength(String name) {
		if (name.length() < MIN_LENGTH_NAME || name.length() > MAX_LENGTH_NAME) {
			throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
		}
	}

	private static void checkNameLanguage(String name) {
		boolean english = name.matches("^[a-zA-Z]*$");
		if (!english) {
			throw new IllegalArgumentException(LANGUAGE_ERROR_MESSAGE);
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Name name1 = (Name)o;
		return Objects.equals(name, name1.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
