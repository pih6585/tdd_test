package multiplication.domain;

import java.util.List;

public class NumberRange {
	private final List<Integer> multipliceResult;

	public NumberRange(List<Integer> multipliceResult){
		this.multipliceResult = multipliceResult;
	}

	public List<Integer> getMultipliceValue(){
		return multipliceResult;
	}

}
