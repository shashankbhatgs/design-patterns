package problems.tictactoe;

public interface WinningStrategy {
    boolean checkWinner(Board board, Position lastMove, char symbol);
}
