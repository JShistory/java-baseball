package baseball;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final List<String> userNumbers;

    public User() {
        this.userNumbers = new ArrayList<>();
    }

    public List<String> createStringToList(String userNumbers){
        return List.of(userNumbers.split(""));
    }


}


