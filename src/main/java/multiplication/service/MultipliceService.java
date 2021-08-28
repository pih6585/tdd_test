package multiplication.service;

import java.util.ArrayList;
import java.util.List;

import multiplication.calculator.Calculation;

public class MultipliceService {

	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 50;

	public boolean playerCheck(String name){
		if((name != null && !name.equals("") && name.length() <= 5)){
			return true;
		}
		return false;
	}

	public boolean numberCheck(int number){
		if(number >= MIN_NUMBER && number <= MAX_NUMBER){
			return true;
		}
		return false;
	}

	public List<String> multipliceValue(int number, int range){
		List<String> list = new ArrayList<String>();
		for(int i=MIN_NUMBER; i<=range; i++){
			list.add(number + " * " + i + " = " + Calculation.calculateValue("*",number,i));
		}
		return list;
	}


}
