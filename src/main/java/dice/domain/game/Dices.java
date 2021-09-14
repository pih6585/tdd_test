package dice.domain.game;

import java.util.Collections;
import java.util.List;

public class Dices {
	private final List<Dice> dices;

	public Dices(List<Dice> dices) {
		this.dices = Collections.unmodifiableList(dices);
	}

	public List<Dice> getDices() {
		return dices;
	}
}
