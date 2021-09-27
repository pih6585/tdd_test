package dice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dice.domain.Dice;
import dice.domain.Name;
import dice.domain.DiceResult;
import dice.domain.Player;
import dice.domain.Players;

public class DiceService {

	private static final int START_NUMBER = 0;

	public static Players diceGamePlay(List<Name> names) {
		List<Player> players = new ArrayList<>();
		for (int i = START_NUMBER; i < names.size(); i++) {
			players.add(new Player(names.get(i), new Dice(diceRoll(), diceRoll())));
		}

		return new Players(players);
	}

	public static String diceGameWinner(Players players) {
		int scoreMax = players.findScoreMax();
		return IntStream.range(START_NUMBER, players.findSize())
			.filter(i -> players.player(i).findDiceSum() == scoreMax)
			.mapToObj(i -> players.player(i).findName())
			.collect(Collectors.joining(","));
	}

	private static int diceRoll() {
		return DiceResult.randomResult();
	}

}

