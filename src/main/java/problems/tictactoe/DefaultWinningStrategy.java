package problems.tictactoe;

public class DefaultWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Position lastMove, char symbol) {
        int size = board.getSize();
        int row = lastMove.getRow();
        int col = lastMove.getCol();

        boolean horizontalWin = true;
        for (int j = 0; j < size; j++) {
            if (symbol != board.getCellValue(new Position(row, j))) {
                horizontalWin = false;
                break;
            }
        }

        boolean verticalWin = true;
        for (int i = 0; i < size; i++) {
            if (symbol != board.getCellValue(new Position(i, col))) {
                verticalWin = false;
                break;
            }
        }

        boolean diagonalWin = false;
        if(row == col) {
            diagonalWin = true;
            for(int i = 0; i<size; i++) {
                if (symbol != board.getCellValue(new Position(i, i))) {
                    diagonalWin = false;
                    break;
                }
            }
        }

        boolean antiDiagonalWin = false;
        if(row + col == size - 1) {
            antiDiagonalWin = true;
            for(int i = 0; i<size; i++) {
                if(symbol != board.getCellValue(new Position(i, size - i -1))) {
                    antiDiagonalWin = false;
                    break;
                }
            }
        }


        return horizontalWin || verticalWin || diagonalWin || antiDiagonalWin;
    }
}
