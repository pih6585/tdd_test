package dice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dice.domain.game.Dice;
import dice.domain.game.DiceRoll;
import dice.domain.game.Dices;
import dice.domain.game.Scores;
import dice.domain.game.Score;
import dice.domain.player.Name;
import dice.domain.player.Names;
import dice.domain.player.Number;
import dice.domain.winner.Winners;
import dice.domain.winner.Winner;

public class DiceService {

	private static final int START_NUMBER = 0;

	public static Names setNames(Map<Integer, String> map) {
		List<Name> name = new ArrayList<>();
		for (int i = START_NUMBER; i < map.size(); i++) {
			name.add(new Name(map.get(i)));
		}
		return new Names(name);
	}

	public static Dices diceGamePlay(Number number) {
		List<Dice> playerDiceResult = new ArrayList<>();
		for (int i = START_NUMBER; i < number.getNumber(); i++) {
			playerDiceResult.add(diceResult());
		}
		return new Dices(playerDiceResult);
	}

	private static Dice diceResult() {
		return new Dice(new DiceRoll().getDiceValue(), new DiceRoll().getDiceValue());
	}

	public static Scores playerScore(Number number, Dices dices) {
		List<Score> scoreList = new ArrayList<>();
		for (int i = START_NUMBER; i < number.getNumber(); i++) {
			scoreList.add(new Score(dices.getDices().get(i).getFirstDice(), dices.getDices().get(i).getSecondDice()));
		}
		return new Scores(scoreList);
	}

	public static Winners diceGameWinner(Names names, Scores scores) {
		int scoreMax = scores.getScoreMax();
		List<Winner> winner = IntStream.range(START_NUMBER, scores.getScores().size())
			.filter(i -> scores.getScores().get(i).getScore() == scoreMax)
			.mapToObj(i -> new Winner(names.getNames().get(i).getName()))
			.collect(Collectors.toList());
		return new Winners(winner);
	}
}

