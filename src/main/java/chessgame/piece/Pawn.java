package chessgame.piece;

import chessgame.board.ChessBoard;
import chessgame.cell.ChessCell;

public class Pawn implements ChessPiece{

    final Color color;
    final ChessPieceName name;
    boolean isDead;

    public Pawn(Color color, ChessPieceName name, boolean isDead) {
        this.color = color;
        this.name = name;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }

    @Override
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    @Override
    public ChessPieceName getName() {
        return this.name;
    }
}
