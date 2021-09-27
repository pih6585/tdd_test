package dice.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dice.domain.Name;
import dice.domain.Number;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);
	private static final String INPUT_TYPE_ERROR_MESSAGE = "숫자가 아닙니다.";
	private static final String PLAYER_NUMBER_MESSAGE = "참여 인원은 몇명인가요?(최대4명)";
	private static final String PLAYER_NAME_MESSAGE = "참가자 이름을 입력하세요";
	private static final String NAME_OVERLAP_ERROR_MESSAGE = "이름이 중복됩니다.";

	public static int inputNumber() {
		System.out.println(PLAYER_NUMBER_MESSAGE);
		return checkInputType();
	}

	public static List<Name> inputNames(Number number) {
		List<Name> names = new ArrayList<>();
		for (int i = 0; i < number.getNumber(); i++) {
			System.out.println(PLAYER_NAME_MESSAGE);
			names.add(new Name(scanner.nextLine()));
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

	private static List<Name> checkNamesOverlap(List<Name> names) {
		if (names.size() != names.stream().distinct().count()) {
			throw new IllegalArgumentException(NAME_OVERLAP_ERROR_MESSAGE);
		}
		return names;
	}
}
