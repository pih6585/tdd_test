package dice.view;

import java.util.List;

import dice.domain.PlayerScore;

public class ResultView {

	public static final String RESULT_MESSAGE = "실행결과";

	public static void resultGameState(List<PlayerScore> scoreByPlayer) {
		System.out.println(RESULT_MESSAGE);
		for (int i = 0; i < scoreByPlayer.size(); i++) {
			System.out.println(scoreByPlayer.get(i).getName() + " : " +
				scoreByPlayer.get(i).getFirstDice() + " - " +
				scoreByPlayer.get(i).getSecondDice() + " : " +
				scoreByPlayer.get(i).getScore());
		}
	}

	public static void resultGameWinner(String winner) {
		System.out.println("우승자는 " + winner + " 입니다.");
	}

}
