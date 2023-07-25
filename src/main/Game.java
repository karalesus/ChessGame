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
            if (isWhiteToMove ) {
                System.out.println("White to move");
            }else{
                System.out.println("Black to move");
            }
            // input
            Coordinates sourceCoordinates = InputCoordinates
                    .inputPlaceCoordinateForColor(isWhiteToMove ? Color.WHITE : Color.BLACK, board);
            Piece piece = board.getPiece(sourceCoordinates);
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            renderer.render(board, piece);
            Coordinates targetCoordinates = InputCoordinates.inputAvailableSqaure(availableMoveSquares);
            // make move
            board.movePiece(sourceCoordinates, targetCoordinates);
            // pass move
             isWhiteToMove =  !isWhiteToMove;
        }
    }
}
