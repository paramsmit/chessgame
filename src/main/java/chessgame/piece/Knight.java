package chessgame.piece;

import chessgame.board.ChessBoard;
import chessgame.cell.ChessCell;

public class Knight implements ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

        int xDiff = Math.abs(source.getX() - destination.getX());
        int yDiff = Math.abs(source.getY() - destination.getY());

        if(!(Math.max(xDiff, yDiff) == 2 && Math.min(xDiff, yDiff) == 1)){
            throw new RuntimeException("invalid move");
        }

        if(destination.getChessPiece().isPresent()){
            if(destination.getChessPiece().get().getColor().equals(this.color)){
                throw new RuntimeException("destination invalid, own piece");
            } else {
                destination.getChessPiece().get().setDead(true);
            }
        }

        chessBoard.removePiece(source.getX(), source.getY());
        chessBoard.putPiece(this, destination.getX(), destination.getY());


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
