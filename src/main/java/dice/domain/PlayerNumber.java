package dice.domain;

import java.util.Objects;

public class PlayerNumber {
	private static final int MIN_NUMBER = 2;
	private static final int MAX_NUMBER = 4;
	private static final String LENGTH_ERROR_MESSAGE = "입력가능한 숫자가 아닙니다.";
	private final int number;

	public PlayerNumber(int number) {
		checkNumberLength(number);
		this.number = number;
	}

	private void checkNumberLength(int number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException(LENGTH_ERROR_MESSAGE);
		}
	}

	public int getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PlayerNumber number1 = (PlayerNumber)o;
		return number == number1.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
}
