package multiplication;

import java.io.IOException;

import multiplication.controller.MultipliceController;

public class MultiplyApplication {

	public static void main(String[] args) throws IllegalAccessException {
		MultipliceController multipliceController = new MultipliceController();
		multipliceController.run();
	}
}
