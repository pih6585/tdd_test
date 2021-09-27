package dice.domain;

import java.util.Collections;
import java.util.List;

public class Players {
	private static final String SCORE_MAX_ERROR_MESSAGE = "MAX 값을 찾을수 없습니다.";
	private final List<Player> players;

	public Players(List<Player> players) {
		this.players = Collections.unmodifiableList(players);
	}

	public Player player(int number) {
		return players.get(number);
	}

	public int findScoreMax() {
		return this.players.stream()
			.mapToInt(v -> v.findDiceSum())
			.max()
			.orElseThrow(() -> new IllegalArgumentException(SCORE_MAX_ERROR_MESSAGE));
	}

	public int findSize() {
		return this.players.size();
	}

}
