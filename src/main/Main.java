package main;

import main.Board;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPosition();
        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        renderer.render(board);
    }
}
