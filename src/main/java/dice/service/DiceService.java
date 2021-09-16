package dice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dice.domain.DiceResult;
import dice.domain.PlayerScore;

public class DiceService {

	private static final int START_NUMBER = 0;

	public static List<PlayerScore> diceGamePlay(List<String> names){
		List<PlayerScore> scoreByPlayer = new ArrayList<>();
		for(int i=START_NUMBER; i<names.size(); i++){
			scoreByPlayer.add(new PlayerScore(names.get(i), diceRoll(), diceRoll()));
		}
		return Collections.unmodifiableList(scoreByPlayer);
	}

	public static String diceGameWinner(List<PlayerScore> scoreByPlayer){
		int scoreMax = getPlayerByScoreMax(scoreByPlayer);
		return IntStream.range(START_NUMBER, scoreByPlayer.size())
			.filter(i -> scoreByPlayer.get(i).getScore() == scoreMax)
			.mapToObj(i -> scoreByPlayer.get(i).getName())
			.collect(Collectors.joining(","));
	}

	private static int diceRoll(){
		return new DiceResult().getDiceResult();
	}

	private static int getPlayerByScoreMax(List<PlayerScore> scoreByPlayer){
		return scoreByPlayer.stream()
			.mapToInt(v -> v.getScore())
			.max()
			.orElseThrow(RuntimeException::new);
	}
}

