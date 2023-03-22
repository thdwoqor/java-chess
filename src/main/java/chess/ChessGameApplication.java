package chess;

import chess.controller.Controller;

public final class ChessGameApplication {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();
    }
}
