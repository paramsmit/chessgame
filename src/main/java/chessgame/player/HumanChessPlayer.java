package chessgame.player;

import chessgame.Move;
import chessgame.Pair;
import chessgame.board.ChessBoard;
import chessgame.cell.ChessCell;
import chessgame.piece.ChessPiece;
import chessgame.piece.ChessPieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(String name, Map<ChessPieceName, ChessPiece> pieces, ChessBoard chessBoard) {
        super(name, pieces, chessBoard);
    }

    @Override
    public Move makeMove() {

        getChessBoard().display();
        int x,y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt(); y = scanner.nextInt();

        ChessCell chessCell = getChessBoard().getCell(new Pair(x,y));
        Optional<ChessPiece> chessPiece = chessCell.getChessPiece();

        if(chessPiece.isEmpty()){
            throw new RuntimeException("invalid spot");
        }

        if(!chessPiece.get().equals(getPiece(chessPiece.get().getName()))){
            throw new RuntimeException("invalid piece");
        }

        Pair source = new Pair(x,y);

        x = scanner.nextInt(); y = scanner.nextInt();

        // validation on destinations ... pending

        Pair destination = new Pair(x,y);

        return new Move(source, destination);

    }
}
