package dice.view;

import dice.domain.Player;
import dice.domain.Players;

public class ResultView {

	private static final String RESULT_MESSAGE = "실행결과";
	private static final String COLON = " : ";
	private static final String HYPHEN = " - ";

	public static void resultGameScore(Players players) {
		System.out.println(RESULT_MESSAGE);
		for (int i = 0; i < players.findSize(); i++) {
			System.out.println(players.player(i).findName() + COLON +
				players.player(i).findFirstDice() + HYPHEN +
				players.player(i).findSecondDice() + COLON +
				players.player(i).findDiceSum());
		}
	}

	public static void resultGameWinner(String winner) {
		System.out.println("우승자는 " + winner + " 입니다.");
	}

}
