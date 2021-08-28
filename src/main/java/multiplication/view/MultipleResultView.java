package multiplication.view;

import java.util.List;

import multiplication.controller.MultipliceController;
import multiplication.Message.MultipleMessage;

public class MultipleResultView {

	MultipliceController controller = new MultipliceController();

	public void printPlayerResult(String player){
		if(!controller.playerCheck(player)){
			System.out.println(MultipleMessage.PLAYER.toString());
			exit();
		}
	}

	public void printNumberResult(int number){
		if(!controller.numberCheck(number)){
			System.out.println(MultipleMessage.NUMBER.toString());
			exit();
		}
	}

	public void printRangeResult(int range){
		if(!controller.numberCheck(range)){
			System.out.println(MultipleMessage.RANGE.toString());
			exit();
		}
	}

	public void printMultipleDetails(String player, int number, int range){
		List<String> list = controller.calculation(number, range);
		for(int i=1; i<=list.size(); i++){
			System.out.println(list.get(i-1));
		}
		System.out.println(player + " 이(가) " + number + "단을 실행 했습니다.");
	}

	private void exit(){
		System.exit(0);
	}
}
