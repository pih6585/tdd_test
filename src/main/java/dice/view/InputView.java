package dice.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import dice.domain.player.Number;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);
	private static final String INPUT_TYPE_ERROR_MESSAGE = "숫자가 아닙니다.";
	private static final String PLAYER_NUMBER_MESSAGE = "참여 인원은 몇명인가요?(최대4명)";
	private static final String PLAYER_NAME_MESSAGE = "참가자 이름을 입력하세요";

	public static int inputNumber() {
		System.out.println(PLAYER_NUMBER_MESSAGE);
		return checkInputType();
	}

	public static Map<Integer, String> inputName(Number number) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < number.getNumber(); i++) {
			System.out.println(PLAYER_NAME_MESSAGE);
			map.put(i, scanner.nextLine());
		}
		return map;
	}

	private static int checkInputType() {
		if (!scanner.hasNextInt()) {
			throw new IllegalArgumentException(INPUT_TYPE_ERROR_MESSAGE);
		}
		int number = scanner.nextInt();
		scanner.nextLine();

		return number;
	}
}
