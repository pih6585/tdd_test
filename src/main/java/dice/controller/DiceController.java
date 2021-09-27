package dice.controller;

import dice.domain.Number;
import dice.domain.Players;
import dice.service.DiceService;
import dice.view.InputView;
import dice.view.ResultView;

public class DiceController {
	public void diceGameStart() {
		Number number = new Number(InputView.inputNumber());
		Players players = DiceService.diceGamePlay(InputView.inputNames(number));

		ResultView.resultGameScore(players);
		ResultView.resultGameWinner(DiceService.diceGameWinner(players));
	}
}
