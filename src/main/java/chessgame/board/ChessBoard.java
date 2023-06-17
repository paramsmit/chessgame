package chessgame.board;

import chessgame.Move;
import chessgame.Pair;
import chessgame.cell.ChessCell;
import chessgame.piece.ChessPiece;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board{

    final List<List<ChessCell>> cells;
    final static int rowCount = 8;
    final static int columnCount = 8;

    @Override
    public void display() {}

    @Override
    public void applyMove(Move move) {
        ChessCell source = getCell(move.getSource());
        ChessPiece chessPiece = source.getChessPiece().get();
        chessPiece.move(source, getCell(move.getDestination()), this);
    }

    public ChessBoard() {
        this.cells = new ArrayList<>();
        for(int i = 0; i < rowCount; i++){
            List<ChessCell> chessCells = new ArrayList<>();
            for(int j = 0; j < columnCount; j++){
                chessCells.add(new ChessCell(i,j));
            }
            cells.add(chessCells);
        }
    }

    public ChessCell getCell(Pair pair){
        return this.cells.get(pair.getX()).get(pair.getY());
    }

    public void removePiece(int row, int col){
        cells.get(row).get(col).setChessPiece(Optional.empty());
    }
}
