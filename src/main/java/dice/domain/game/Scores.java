package dice.domain.game;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Scores {
	private final List<Score> scores;

	public Scores(List<Score> scores) {
		this.scores = Collections.unmodifiableList(scores);
	}

	public List<Score> getScores() {
		return scores;
	}

	public int getScoreMax() {
		return scores.stream()
			.mapToInt(v -> v.getScore())
			.max()
			.orElseThrow(RuntimeException::new);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Scores scores1 = (Scores)o;
		return Objects.equals(scores, scores1.scores);
	}

	@Override
	public int hashCode() {
		return Objects.hash(scores);
	}
}
