package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final String NOT_VAILD_SIZE_1 = "[ERROR] 입력 사이즈가 3이어야 합니다.";
    private final String NOT_VAILD_NUMBER = "[ERROR] 입력은 숫자이어야 합니다.";
    private final String NOT_VAILD_SIZE_2 = "[ERROR] 입력 사이즈가 1이어야 합니다.";

    public String inputNumber() {
        System.out.printf("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        validateInputNumber(input);

        return input;
    }

    public int retryNumber() {
        System.out.printf("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
        String input = Console.readLine();

        validateRetryNumber(input);

        return Integer.parseInt(input);
    }

    private void validateInputNumber(String inputNumber) {
        if (inputNumber.length() != 3) {
            throw new IllegalArgumentException(NOT_VAILD_SIZE_1);
        }
        if (!Character.isDigit(inputNumber.charAt(0)) || !Character.isDigit(inputNumber.charAt(1))
                || !Character.isDigit(inputNumber.charAt(2))) {
            throw new IllegalArgumentException(NOT_VAILD_NUMBER);
        }
    }

    private void validateRetryNumber(String inputNumber) {
        if (inputNumber.length() != 1) {
            throw new IllegalArgumentException(NOT_VAILD_SIZE_2);
        }
        if (!Character.isDigit(inputNumber.charAt(0))) {
            throw new IllegalArgumentException(NOT_VAILD_NUMBER);
        }
    }

}
