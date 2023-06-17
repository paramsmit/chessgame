package chessgame;

import chessgame.board.Board;
import chessgame.player.Player;

import java.util.Queue;


/*
* abstract class helps to share the common functionality among the different implementations
*/


public abstract class BoardGame {

    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void startGame(){
        while (true){
            Player currentPlayer = players.poll();
            Move move = currentPlayer.makeMove();
            this.board.applyMove(move);
            if(isOver()){
                System.out.println("Game over. " + currentPlayer.getName() + " won");
                break;
            }
            players.add(currentPlayer);
        }
    }

    public abstract boolean isOver();


}


