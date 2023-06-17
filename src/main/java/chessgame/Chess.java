package chessgame;

import chessgame.board.ChessBoard;
import chessgame.piece.ChessPieceName;
import chessgame.player.ChessPlayer;
import chessgame.player.Player;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Chess extends BoardGame {

    ChessPlayer player1, player2;

    public Chess(ChessBoard chessBoard, ChessPlayer player1, ChessPlayer player2) {
        super(chessBoard, new ArrayDeque<>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean isOver() {
        return player1.getPiece(ChessPieceName.KING).isDead() || player2.getPiece(ChessPieceName.KING).isDead();
    }

}
