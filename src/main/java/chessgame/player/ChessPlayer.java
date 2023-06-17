package chessgame.player;

import chessgame.Move;
import chessgame.board.ChessBoard;
import chessgame.piece.ChessPiece;
import chessgame.piece.ChessPieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player{

    final Map<ChessPieceName, ChessPiece> pieces;
    final ChessBoard chessBoard;

    public ChessPlayer(String name, Map<ChessPieceName, ChessPiece> pieces, ChessBoard chessBoard) {
        super(name);
        this.pieces = pieces;
        this.chessBoard = chessBoard;
    }

    @Override
    public abstract Move makeMove();

    public ChessPiece getPiece(ChessPieceName chessPieceName){

        if(!this.pieces.containsKey(chessPieceName)){
            throw new IllegalArgumentException("invalid chess piece name");
        }

        return this.pieces.get(chessPieceName);
    }

    public Map<ChessPieceName, ChessPiece> getPieces() {
        return pieces;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}
