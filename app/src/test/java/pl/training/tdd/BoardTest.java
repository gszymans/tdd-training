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

    @DisplayName("Init new game board with determined vertical size")
    @Test
    void initGameBoardWithSpecifiedVerticalSize(){
        var gamebord = new GameBoard(3,3);
        Assertions.assertEquals(gamebord.getVerticalSize(), 3 );
    }

    @DisplayName("Init new game board with determined horizontal size")
    @Test
    void initGameBoardWithSpecifiedHorizontalSize(){
        var gamebord = new GameBoard(3,3);
        Assertions.assertEquals(gamebord.getHorizontalSize(), 3 );
    }

    @DisplayName("Given movement can occupied the field")
    @Test
    void checkIfGivenMovementIsPossible(){
        var gamebord = new GameBoard(3,3);
        Assertions.assertEquals(gamebord.makeMove(1,1,"X"), Boolean.TRUE);
    }

}
