package dice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dice.domain.Dice;
import dice.domain.Name;
import dice.domain.DiceResult;
import dice.domain.Player;

public class DiceService {

	private static final int START_NUMBER = 0;

	public static List<Player> diceGamePlay(List<Name> names){
		List<Player> players = new ArrayList<>();
		for(int i=START_NUMBER; i<names.size(); i++){
			players.add(new Player(names.get(i), new Dice(diceRoll(), diceRoll())));
		}

		return Collections.unmodifiableList(players);
	}

	public static String diceGameWinner(List<Player> players){
		int scoreMax = getPlayerByScoreMax(players);
		return IntStream.range(START_NUMBER, players.size())
			.filter(i -> players.get(i).findDiceSum() == scoreMax)
			.mapToObj(i -> players.get(i).getName().getName())
			.collect(Collectors.joining(","));
	}

	private static int diceRoll(){
		return new DiceResult().getDiceResult();
	}

	private static int getPlayerByScoreMax(List<Player> players){
		return players.stream()
			.mapToInt(v -> v.findDiceSum())
			.max()
			.orElseThrow(RuntimeException::new);
	}

}

