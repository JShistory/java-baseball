package baseball;

import baseball.User;
import java.util.List;

public class BaseballGame {
    private User user;

    private int strike;
    private int ball;

    public BaseballGame(){
        user = new User();
    }

    public void countBall(List<Integer> computer, List<Integer> user){
        for(int i=0; i<computer.size(); i++){
            if(computer.contains(user.get(i))){
                countStrike(computer.indexOf(user.get(i)),i);
            }
        }
    }

    public void countStrike(int computerIndex, int index){
        if(computerIndex == index){
            strike ++;
            ball--;
        }
        ball++;
    }
    public int getStrike(){
        return strike;
    }
    public int getBall(){
        return ball;
    }
}
