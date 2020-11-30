package pl.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoardTest {

    @DisplayName("Init new game board, expecting non null object")
    @Test
    void initGameBoardTest(){
        var gamebord = new GameBoard();
        Assertions.assertNotNull(gamebord);
    }

}
