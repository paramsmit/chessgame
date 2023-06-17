package chessgame.cell;
import chessgame.piece.ChessPiece;
import java.util.Optional;

public class ChessCell {

    final int x;
    final int y;
    Optional<ChessPiece> chessPiece;

    public ChessCell(int x, int y) {
        this.x = x;
        this.y = y;
        this.chessPiece = Optional.empty();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Optional<ChessPiece> getChessPiece() {
        return chessPiece;
    }

    public void setChessPiece(Optional<ChessPiece> chessPiece){
        this.chessPiece = chessPiece;
    }

}
