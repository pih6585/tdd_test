package multiplication.view;

import java.util.List;

import multiplication.controller.MultipliceController;

public class MultipliceResultView {

	public static void printUserNameResult(String name) throws IllegalAccessException {
		new MultipliceController().checkUserNameResult(name);
	}

	public static void printNumberResult(String number) throws IllegalAccessException {
		new MultipliceController().checkNumberRangeResult(number);
	}

	public static void printRangeResult(String range) throws IllegalAccessException {
		new MultipliceController().checkNumberRangeResult(range);
	}

	public static void printCalculationResult(String name, String number, String range) throws IllegalAccessException {
		List<Integer> result = new MultipliceController().checkCalculationResult(number, range);
		for(int i=1; i<=result.size(); i++){
			System.out.println(number + " * " + i + " = " + result.get(i-1));
		}
		System.out.println(name + " 이(가) " + number + "단을 실행 했습니다.");
	}
}
