package baseball.view;

public class OutputView{
    private final String STRIKE = "%d스트라이크";
    private final String BALL = "%d볼";
    private final String FAIL = "낫싱";

    public void printResult(int strike, int ball){
        if(ball >= 1){
            System.out.printf(BALL+" ",ball);
        }
        if(strike >= 1){
            System.out.printf(STRIKE,strike);
        }
        System.out.println();
        if(ball == 0 && strike == 0){
            System.out.println(FAIL);
        }

    }

    public void printSuccess(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
