package main.java.org.lld.Step_14_SnakeAndLadders;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;

    // The operations like removing player from the list and adding him at the back for his next turn will be easier with Deque
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(){

        // Game will be initialised when this constructor is called
        initializeGame();
    }

    private void initializeGame() {

        board = new Board(10, 5,4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame(){

        while(winner == null) {

            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPosition);

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            int playerNewPosition = playerTurn.currentPosition + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length-1){
                winner = playerTurn;
            }

        }

        System.out.println("WINNER IS:" + winner.id);
    }


    private Player findPlayerTurn() {

        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck (int playerNewPosition) {

        // checking if the player position is more than the board length
        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        // if the cell has a jump then we will jump to new position
        if(cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }
}
