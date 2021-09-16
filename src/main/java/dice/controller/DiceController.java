package dice.controller;

import java.util.List;

import dice.domain.PlayerNumber;
import dice.domain.PlayerScore;
import dice.service.DiceService;
import dice.view.InputView;
import dice.view.ResultView;

public class DiceController {
	public void diceGameStart() {
		PlayerNumber number = new PlayerNumber(InputView.inputNumber());
		List<PlayerScore> scoreByPlayer = DiceService.diceGamePlay(InputView.inputName(number));

		ResultView.resultGameState(scoreByPlayer);
		ResultView.resultGameWinner(DiceService.diceGameWinner(scoreByPlayer));
	}
}
