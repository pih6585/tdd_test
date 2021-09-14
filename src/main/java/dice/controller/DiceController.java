package dice.controller;

import dice.domain.game.Dices;
import dice.domain.game.Scores;
import dice.domain.player.Names;
import dice.domain.player.Number;
import dice.service.DiceService;
import dice.view.InputView;
import dice.view.ResultView;

public class DiceController {
	public void diceGameStart() {
		Number number = new Number(InputView.inputNumber());

		Names names = DiceService.setNames(InputView.inputName(number));
		Dices dices = DiceService.diceGamePlay(number);
		Scores scores = DiceService.playerScore(number, dices);

		ResultView.resultScore(number, names, dices, scores);
		ResultView.resultWinner(DiceService.diceGameWinner(names, scores));
	}
}
