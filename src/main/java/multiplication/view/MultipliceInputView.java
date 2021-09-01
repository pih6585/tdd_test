package multiplication.view;

import java.util.Scanner;

public class MultipliceInputView {
	private static Scanner scan = new Scanner(System.in);

	public void printMultipleInputView() throws IllegalAccessException {
		System.out.println("구구단을 실행할 사람을 입력하세요(최대5글자)");
		final String name = scan.nextLine();
		MultipliceResultView.printUserNameResult(name);

		System.out.println("구구단의 숫자를 입력하세요.");
		final String number = scan.nextLine();
		MultipliceResultView.printNumberResult(number);

		System.out.println("구구단의 범위를 입력하세요");
		final String range = scan.nextLine();
		MultipliceResultView.printNumberResult(range);

		System.out.println("실행결과");
		MultipliceResultView.printCalculationResult(name, number, range);

		scan.close();
	}
}
