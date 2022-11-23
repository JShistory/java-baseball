package baseball;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

    @Test
    void 스트라이크_3_볼_0(){
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.countBall(List.of(1,2,3), List.of(1,2,3));
        assertThat(baseballGame.getStrike()).isEqualTo(3);
        assertThat(baseballGame.getBall()).isEqualTo(0);

    }

    @Test
    void 스트라이크_0_볼_3(){
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.countBall(List.of(1,2,3), List.of(3,1,2));
        assertThat(baseballGame.getStrike()).isEqualTo(0);
        assertThat(baseballGame.getBall()).isEqualTo(3);

    }


    @Test
    void 스트라이크_1_볼_2(){
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.countBall(List.of(1,2,3), List.of(1,3,2));
        assertThat(baseballGame.getStrike()).isEqualTo(1);
        assertThat(baseballGame.getBall()).isEqualTo(2);

    }

}