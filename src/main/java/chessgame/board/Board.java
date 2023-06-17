
package chessgame.board;

import chessgame.Move;

public interface Board {
    public void display();
    void applyMove(Move move);
}

