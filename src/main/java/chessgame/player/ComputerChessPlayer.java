package chessgame.player;

import chessgame.Move;
import chessgame.board.ChessBoard;
import chessgame.piece.ChessPiece;
import chessgame.piece.ChessPieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{

    public ComputerChessPlayer(String name, Map<ChessPieceName, ChessPiece> pieces, ChessBoard chessBoard) {
        super(name, pieces, chessBoard);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
