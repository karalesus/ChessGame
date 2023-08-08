package main.piece;

import main.Board;
import main.BoardUtils;
import main.Color;
import main.Coordinates;

import java.util.List;

public abstract class LongRangePiece extends Piece {


    public LongRangePiece(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }
    @Override
    protected boolean isSquareAvailableForMove(Coordinates coordinates, Board board) {
        boolean result = super.isSquareAvailableForMove(coordinates, board);

        if (result) {
            List<Coordinates> coordinatesBetween;
            if (this.coordinates.file == coordinates.file) {
                coordinatesBetween = BoardUtils.getVerticalCoordinatesBetween(this.coordinates, coordinates);
            } else if (this.coordinates.rank.equals(coordinates.rank)) {
                coordinatesBetween = BoardUtils.getHorizontalCoordinatesBetween(this.coordinates, coordinates);
            } else {
                coordinatesBetween = BoardUtils.getDiagonalsCoordinatesBetween(this.coordinates, coordinates);
            }
            for (Coordinates c : coordinatesBetween) {
                if (!board.isSquareEmpty(c)) {
                    return false;
                }
            }
            return true;
            // 1. get coordinates of squares between current pos and target pos
            // 2. check that square is free
        } else {
            return false;
        }
    }
}
