package main;

import main.Board;
import main.piece.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Board board = newBboard();
//        board.setupDefaultPiecesPosition();

        Board board = new BoardFactory().fromFEN("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
//        renderer.render(board);
//
//        Piece piece = board.getPiece(new Coordinates(File.B, 8));
//        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

//        int a = 123;
            Game game = new Game(board);
            game.gameLoop();
    }
}
