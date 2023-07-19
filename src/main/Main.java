package main;

import main.Board;
import main.piece.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPosition();
        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        renderer.render(board);

        Piece piece = board.getPiece(new Coordinates(File.B, 8));
        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

        int a = 123;
    }
}
