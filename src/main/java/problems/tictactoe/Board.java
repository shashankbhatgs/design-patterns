package problems.tictactoe;

// Always ask: “Does this class truly have enough knowledge to own this behavior?”
// You generally do NOT want external objects mutating your internal state directly.

import java.util.Arrays;

public class Board {
    private static final char EMPTY = '-';
    private static final char X = 'X';
    private static final char O = 'O';

    private final int size;
    private final char[][] board; // final because the variable board cannot point to a different array later.

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        for (char[] x : board) {
            Arrays.fill(x, EMPTY);
        }
    }

    public boolean isCellEmpty(Position position) {
        return board[position.getRow()][position.getCol()] == EMPTY;
    }

    public MoveStatus placeMove(Position position, char symbol) {
        if (!isWithinBounds(position)) return MoveStatus.OUT_OF_BOUNDS;

        if(!isCellEmpty(position)) return MoveStatus.CELL_OCCUPIED;

        if(!isValidSymbol(symbol)) return MoveStatus.INVALID_SYMBOL;

        board[position.getRow()][position.getCol()] = symbol;
        return MoveStatus.SUCCESS;
    }

    public char getCellValue(Position position) {
        if (!isWithinBounds(position)) {
            throw new IllegalArgumentException("Position is not valid");
        }

        return board[position.getRow()][position.getCol()];
    }

    public boolean isFull() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isWithinBounds(Position position) {
        int row = position.getRow();
        int col = position.getCol();

        return row < size && col < size && row >= 0 && col >= 0;
    }


    private boolean isValidSymbol(char symbol) {
        return symbol == X || symbol == O;
    }

    public int getSize() {
        return size;
    }
}
