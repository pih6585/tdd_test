package multiplication.controller;

import java.util.List;

import multiplication.service.MultipliceService;

public class MultipliceController {

	private final MultipliceService multipleService = new MultipliceService();

	public boolean playerCheck(String name){
		return multipleService.playerCheck(name);
	}

	public boolean numberCheck(int number){
		return multipleService.numberCheck(number);
	}

	public List<String> calculation(int number, int range){
		return multipleService.multipliceValue(number, range);
	}
}
