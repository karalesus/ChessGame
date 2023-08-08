package main;

import main.Board;
import main.piece.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Board board = newBboard();
//        board.setupDefaultPiecesPosition();

        Board board = new BoardFactory().fromFEN("8/8/5p2/8/5K2/8/5k2/8 w - - 0 1");
                //"3k4/8/p5n1/5Q2/R7/3P4/P7/3K4 w - - 0 1");
                //3k4/6n1/8/2N5/3B4/8/8/3K4 w - - 0 1");
                //"rnbqkbnr/pppppppp/8/8/3N4/5B2/PPPPPPPP/R1BQK1NR w KQkq - 0 1");
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
