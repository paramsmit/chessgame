package chessgame.piece;

import chessgame.board.ChessBoard;
import chessgame.cell.ChessCell;

public class King implements ChessPiece{
    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public void setDead(boolean isDead) {

    }

    @Override
    public ChessPieceName getName() {
        return null;
    }
}
