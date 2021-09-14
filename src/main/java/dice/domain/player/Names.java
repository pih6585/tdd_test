package dice.domain.player;

import java.util.Collections;
import java.util.List;

public class Names {

	private static final String NAME_OVERLAP_ERROR_MESSAGE = "이름이 중복됩니다.";
	private final List<Name> names;

	public Names(List<Name> names) {
		this.names = Collections.unmodifiableList(checkNamesOverlap(names));
	}

	private List<Name> checkNamesOverlap(List<Name> names) {
		if (names.size() != names.stream().distinct().count()) {
			throw new IllegalArgumentException(NAME_OVERLAP_ERROR_MESSAGE);
		}
		return names;
	}

	public List<Name> getNames() {
		return names;
	}

}