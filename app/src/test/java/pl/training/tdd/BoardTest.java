package pl.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoardTest {



    @DisplayName("Init new game board, expecting non null object")
    @Test
    void initGameBoardTest(){
        var gamebord = new GameBoard(3,3);
        Assertions.assertNotNull(gamebord);
    }

    @DisplayName("Init new game board with determined size")
    @Test
    void initGameBoardWithSpecifiedSize(){
        var gamebord = new GameBoard(3,3);
        Assertions.assertEquals(gamebord.getVerticalSize(), 3 );
    }


}
