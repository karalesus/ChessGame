package main;

import main.piece.Piece;

import java.util.Set;

public class Game {

    private final Board board;
    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();
    private InputCoordinates inputCoordinates = new InputCoordinates();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        boolean isWhiteToMove = true;
        while (true) {
            // render
            renderer.render(board);
            // input
            Coordinates coordinates = InputCoordinates
                    .inputPlaceCoordinateForColor(isWhiteToMove ? Color.WHITE : Color.BLACK, board);
            Piece piece = board.getPiece(coordinates);
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);
            Coordinates targetCoordinates = InputCoordinates.inputAvailableSqaure(availableMoveSquares);
            // make move
            // pass move
             isWhiteToMove =  !isWhiteToMove;
        }
    }
}
