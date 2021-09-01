package multiplication.domain;

import java.util.ArrayList;
import java.util.List;

import multiplication.calculator.Calculation;
import static multiplication.domain.ExceptionMessage.*;

public class Number extends RuntimeException{
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 50;
	private static String number;

	public Number(String number) throws IllegalAccessException {
		checkNumberNull(number);
		checkNumberEmpty(number);
		checkNumberType(number);
		checkMinNumberRange(number);
		checkMaxNumberRange(number);
		this.number = number;
	}


	private void checkNumberNull(String number) throws IllegalAccessException {
		if(number == null){
			throw new IllegalAccessException(NULL_ERROR_MESSAGE);
		}
	}

	private void checkNumberEmpty(String number) throws IllegalAccessException {
		if(number.isEmpty()){
			throw new IllegalAccessException(EMPTY_ERROR_MESSAGE);
		}
	}

	private void checkMinNumberRange(String number) throws IllegalAccessException {
		int isNumeric = Integer.parseInt(number);
		if(isNumeric < MIN_NUMBER){
			throw new IllegalAccessException(MIN_NUMBER_ERROR_MESSAGE);
		}
	}

	private void checkMaxNumberRange(String number) throws IllegalAccessException {
		int isNumeric = Integer.parseInt(number);
		if(isNumeric > MAX_NUMBER){
			throw new IllegalAccessException(MAX_NUMBER_ERROR_MESSAGE);
		}
	}

	private void checkNumberType(String number) throws IllegalAccessException{
		boolean isNumeric = number.matches("[+-]?\\d*(\\.\\d+)?");
		if(!isNumeric){
			throw new IllegalAccessException(NUMBER_ERROR_MESSAGE);
		}
	}

	public String getNumber() {
		return number;
	}

	public List<Integer> calculatorResult(String number, String range){
		int numberOne = Integer.parseInt(number);
		int numberTwo = Integer.parseInt(range);
		List<Integer> result = new ArrayList<>();
		for(int i=MIN_NUMBER; i <= numberTwo; i++){
			result.add(Calculation.calculateValue("*",numberOne,i));
		}
		return new NumberRange(result).getMultipliceValue();
	}
}
