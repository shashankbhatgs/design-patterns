package problems.tictactoe.selfandllm;

import java.util.List;

// Does this reference represent stable configuration or
// evolving runtime state? -> Decide `final` or not

public class Game {
    private final Board board;
    private final List<Player> players;
    private final WinningStrategy winningStrategy;
    private Player currentPlayer;
    private GameStatus status;
    private Player winner;

    public Game(Board board, List<Player> players,
                WinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.winningStrategy = winningStrategy;
        this.status = GameStatus.IN_PROGRESS;
        this.currentPlayer = players.get(0);
    }

    public void play() {
        while (status == GameStatus.IN_PROGRESS) {
            // render board (we can use a separate RendererClass for it)
            Position move = currentPlayer.makeMove(board);
            MoveStatus moveStatus = board.placeMove(move, currentPlayer.symbol());
            if (moveStatus != MoveStatus.SUCCESS) {
                System.out.println(moveStatus);
                continue;
            }

            // move status is SUCCESS
            boolean isWinner = winningStrategy.checkWinner(board, move, currentPlayer.symbol());

            if (isWinner) {
                this.status = GameStatus.WIN;
                winner = currentPlayer;
                break;
            }

            if (board.isFull()) {
                winner = null;
                this.status = GameStatus.DRAW;
                break;
            }

            switchPlayer();
        }
    }

    public void switchPlayer() {
        //(currentPlayerIndex + 1) % players.size() if more than two players are present

        for (Player player : players) {
            if (player != currentPlayer) {
                currentPlayer = player;
            }
        }
    }

    public Player getWinner() {
        return winner;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
