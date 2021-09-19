package dice.controller;

import java.util.List;

import dice.domain.Player;
import dice.domain.Number;
import dice.service.DiceService;
import dice.view.InputView;
import dice.view.ResultView;

public class DiceController {
	public void diceGameStart() {
		Number number = new Number(InputView.inputNumber());
		List<Player> players = DiceService.diceGamePlay(InputView.inputName(number));

		ResultView.resultGameState(players);
		ResultView.resultGameWinner(DiceService.diceGameWinner(players));
	}
}
