package problems.tictactoe.selfandllm;

public interface WinningStrategy {
    boolean checkWinner(Board board, Position lastMove, char symbol);
}
