package baseball.controller;

import baseball.BaseballGame;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class Controller {
    private final String OVERLAP_NUMBERS = "[ERROR] 숫자가 중복되었습니다.";

    private InputView inputView;
    private OutputView outputView;
    private BaseballGame baseballGame;

    public Controller() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void start() {
        boolean gamePlay = true;
        while (gamePlay == true) {
            baseballGame = new BaseballGame();
            inputUserNumbers();
            outputView.printSuccess();
            gamePlay = retry();
        }
    }

    public void inputUserNumbers() {
        boolean gameEnd = false;
        while (!gameEnd) {
            String userNumbers = inputView.inputNumber();
            validateUserNumbers(userNumbers);
            baseballGame.countStrikeBall(userNumbers);
            gameEnd = baseballGame.successGame();
            outputView.printResult(baseballGame.getStrike(), baseballGame.getBall());
        }
    }

    public boolean retry() {
        int inputRetry = inputView.retryNumber();
        if(inputRetry == 2){
            return false;
        }
        return true;
    }



    private void validateUserNumbers(String userNumbers) {
        List<String> user = List.of(userNumbers.split(""));
        if(user.size() != user.stream().distinct().count()){
            throw new IllegalArgumentException(OVERLAP_NUMBERS);
        }
    }

}