package multiplication.view;

import java.util.Scanner;

public class MultipleInputView {
	public void printMultipleInputView() {

		Scanner scan = new Scanner(System.in);
		MultipleResultView mrv = new MultipleResultView();

		System.out.println("구구단을 실행할 사람을 입력하세요(최대5글자)");
		String player = scan.nextLine();
		mrv.printPlayerResult(player);

		System.out.println("구구단의 숫자를 입력하세요.");
		int number = scan.nextInt();
		mrv.printNumberResult(number);

		System.out.println("구구단의 범위를 입력하세요");
		int range = scan.nextInt();
		mrv.printRangeResult(range);

		System.out.println("실행결과");
		mrv.printMultipleDetails(player, number, range);
	}
}
