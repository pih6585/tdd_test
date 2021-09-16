package dice.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dice.domain.PlayerNumber;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);
	private static final String INPUT_TYPE_ERROR_MESSAGE = "숫자가 아닙니다.";
	private static final String PLAYER_NUMBER_MESSAGE = "참여 인원은 몇명인가요?(최대4명)";
	private static final String PLAYER_NAME_MESSAGE = "참가자 이름을 입력하세요";
	private static final String NAME_LENGTH_ERROR_MESSAGE = "이름 길이를 확인해주세요";
	private static final String LANGUAGE_ERROR_MESSAGE = "이름은 영어만 입력가능합니다.";
	private static final String NAME_OVERLAP_ERROR_MESSAGE = "이름이 중복됩니다.";
	private static final int MIN_LENGTH_NAME = 1;
	private static final int MAX_LENGTH_NAME = 5;

	public static int inputNumber() {
		System.out.println(PLAYER_NUMBER_MESSAGE);
		return checkInputType();
	}

	public static List<String> inputName(PlayerNumber number) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < number.getNumber(); i++) {
			System.out.println(PLAYER_NAME_MESSAGE);
			names.add(checkNameLength());
		}
		return checkNamesOverlap(names);
	}

	private static int checkInputType() {
		if (!scanner.hasNextInt()) {
			throw new IllegalArgumentException(INPUT_TYPE_ERROR_MESSAGE);
		}
		int number = scanner.nextInt();
		scanner.nextLine();

		return number;
	}

	private static String checkNameLength() {
		String name = scanner.nextLine();
		if (name.length() < MIN_LENGTH_NAME || name.length() > MAX_LENGTH_NAME) {
			throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE);
		}
		return checkNameLanguage(name);
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
