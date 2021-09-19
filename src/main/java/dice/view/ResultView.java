package dice.view;

import java.util.List;

import dice.domain.Player;

public class ResultView {

	public static final String RESULT_MESSAGE = "실행결과";

	public static void resultGameState(List<Player> players) {
		System.out.println(RESULT_MESSAGE);
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).findName() + " : " +
				players.get(i).findDice() + " : " +
				players.get(i).findDiceSum());
		}
	}

	public static void resultGameWinner(String winner) {
		System.out.println("우승자는 " + winner + " 입니다.");
	}

}
