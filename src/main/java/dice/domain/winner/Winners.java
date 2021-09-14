package dice.domain.winner;

import java.util.Collections;
import java.util.List;

public class Winners {
	private final List<Winner> winners;

	public Winners(List<Winner> names) {
		this.winners = Collections.unmodifiableList(names);
	}

	public List<Winner> getWinners() {
		return winners;
	}
}