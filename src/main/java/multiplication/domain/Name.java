package multiplication.domain;

import java.lang.IllegalAccessException;
import static multiplication.domain.ExceptionMessage.*;

public class Name {
	private String name;

	public Name(String name) throws IllegalAccessException {
		checkNameNull(name);
		checkNameNull(name);
		checkNameEmpty(name);
		checkNameLength(name);

		this.name = name;
	}

	private void checkNameNull(String name) throws IllegalAccessException{
		if(name == null){
			throw new IllegalAccessException(NULL_ERROR_MESSAGE);
		}
	}

	private void checkNameEmpty(String name) throws IllegalAccessException {
		if(name.isEmpty()){
			throw new IllegalAccessException(EMPTY_ERROR_MESSAGE);
		}
	}

	private void checkNameLength(String name) throws IllegalAccessException {
		if(name.length() > 5){
			throw new IllegalAccessException(LENGTH_ERROR_MESSAGE);
		}
	}

	public String getName() {
		return name;
	}
}
