package main.piece;

import main.Color;
import main.Coordinates;

import java.util.Set;

public class King extends Piece {

    public King(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
