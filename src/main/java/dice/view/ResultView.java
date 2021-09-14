package dice.view;

import dice.domain.game.Dices;
import dice.domain.game.Scores;
import dice.domain.player.Names;
import dice.domain.player.Number;
import dice.domain.winner.Winners;

public class ResultView {

	public static final String RESULT_MESSAGE = "실행결과";

	public static void resultScore(Number number, Names names, Dices dices, Scores scores) {
		System.out.println(RESULT_MESSAGE);
		for (int i = 0; i < number.getNumber(); i++) {
			playerByScore(i, names, dices, scores);
		}
	}

	private static void playerByScore(int number, Names names, Dices dices, Scores scores) {
		System.out.println(names.getNames().get(number).getName() + " : " +
			dices.getDices().get(number).getFirstDice() + " - " +
			dices.getDices().get(number).getSecondDice() + " : " +
			scores.getScores().get(number).getScore());
	}

	public static void resultWinner(Winners winner) {
		String winnerName = "";
		for (int i = 0; i < winner.getWinners().size(); i++) {
			winnerName += winner.getWinners().get(i).getName() + " ";
		}
		System.out.println("우승자는 " + winnerName + "입니다.");
	}

}
