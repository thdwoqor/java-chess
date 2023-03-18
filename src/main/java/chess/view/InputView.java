package chess.view;

import chess.dto.ChessInputDto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DELIMITER = " ";
    private static final int GAME_STATE_INDEX = 0;
    private static final int SOURCE_INDEX = 1;
    private static final int TARGET_INDEX = 2;

    private InputView() {
    }

    public static ChessInputDto inputGameState() {
        final String command = scanner.nextLine();

        final List<String> commands = Arrays.asList(command.split(DELIMITER));
        final Command gameState = Command.from(commands.get(GAME_STATE_INDEX));

        if (gameState == Command.START || gameState == Command.END) {
            return ChessInputDto.from(gameState);
        }

        return ChessInputDto.from(gameState, commands.get(SOURCE_INDEX), commands.get(TARGET_INDEX));
    }
}
