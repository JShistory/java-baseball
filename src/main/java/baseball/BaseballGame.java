package baseball;

public class BaseballGame {
    private User user;
    private Computer computer;

    private int strike;
    private int ball;

    public BaseballGame() {
        user = new User();
        computer = new Computer();
        computer.createComputerNumbers();
    }

    public void countStrikeBall(String userNumbers) {
        resetScore();
        for (int i = 0; i < computer.getComputerNumbers().size(); i++) {
            if (computer.getComputerNumbers().contains(userNumbers.charAt(i) -'0')) {
                isStrike(computer.getComputerNumbers().indexOf(userNumbers.charAt(i)- '0'), i);
            }
        }
    }

    public boolean successGame(){
        if(strike == 3){
            return true;
        }
        return false;
    }

    private void resetScore(){
        strike = 0;
        ball = 0;
    }

    public void isStrike(int computerIndex, int index) {
        if (computerIndex == index) {
            strike++;
            ball--;
        }
        ball++;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
