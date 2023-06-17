package chessgame;

public class Move {
    final Pair source, destination;

    public Move(Pair source, Pair destination) {
        this.source = source;
        this.destination = destination;
    }

    public Pair getSource() {
        return source;
    }

    public Pair getDestination() {
        return destination;
    }
}

