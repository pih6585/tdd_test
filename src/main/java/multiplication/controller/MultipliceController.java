package multiplication.controller;

import java.util.List;

import multiplication.domain.Name;
import multiplication.domain.Number;
import multiplication.view.MultipliceInputView;

public class MultipliceController{

	public void run() throws IllegalAccessException { new MultipliceInputView().printMultipleInputView(); }

	public void checkUserNameResult(String name) throws IllegalAccessException {
		new Name(name);
	}

	public void checkNumberRangeResult(String number) throws IllegalAccessException {
		new Number(number);
	}

	public List<Integer> checkCalculationResult(String number, String range) throws IllegalAccessException {
		return new Number(number).calculatorResult(number, range);
	}

}
