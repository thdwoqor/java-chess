package chess;

import java.util.Arrays;

public enum Row {
    ROW_A("a", 0),
    ROW_B("b", 1),
    ROW_C("c", 2),
    ROW_D("d", 3),
    ROW_E("e", 4),
    ROW_F("f", 5),
    ROW_G("g", 6),
    ROW_H("h", 7);

    private final String type;
    private final int index;

    Row(final String type, final int index) {
        this.type = type;
        this.index = index;
    }

    public static int findIndex(final String inputType) {
        return Arrays.stream(Row.values())
                .filter(rowType -> rowType.type.equals(inputType))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 가로 입력값 입니다."))
                .index;
    }
}
