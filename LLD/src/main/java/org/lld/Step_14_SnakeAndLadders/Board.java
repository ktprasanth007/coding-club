package main.java.org.lld.Step_14_SnakeAndLadders;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {

        initializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {

        // creating a board of this size of type Cell
        cells = new Cell[boardSize][boardSize];

        for(int i=0;i<boardSize;i++) {
            for(int j=0; j<boardSize;j++) {
                // filling each entry with Cell object
                // we don't care abt the normal order of these cells and the actual board front end shows (They can handle it from front end)
                // Any player wins the game when he reaches the end of the board and it doesn't matter whether it's up or down
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }
    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders){

        while(numberOfSnakes > 0) {
           int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
           int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
           if(snakeTail >= snakeHead) {
               // if snake tail is greater than head then it becomes a ladder, so we are skipping it
               continue;
           }

           Jump snakeObj = new Jump();
           snakeObj.start = snakeHead;
           snakeObj.end = snakeTail;

           Cell cell = getCell(snakeHead);
           cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart >= ladderEnd) {
                // if ladder start is greater than end then it becomes a snake, so we are skipping it
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numberOfLadders--;
        }

    }

    Cell getCell(int playerPosition) {
        // if the position is 75 then it means it is present at row index 7 and column index 5
        // by below logic we can get both
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }
}
