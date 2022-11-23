package baseball;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    void 숫자_생성(){
        Computer computer = new Computer();
        computer.createComputerNumbers();
        List<Integer> numbers = computer.getComputerNumbers();
       assertThat(numbers.size()).isEqualTo(3);
    }
}