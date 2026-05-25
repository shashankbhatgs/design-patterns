package problems.tictactoe.selfandllm;

public class Player {
    private final char symbol;
    private final MoveStrategy strategy;
    private final String name;

    public Player(MoveStrategy strategy, char symbol, String name) {
        this.name = name;
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public Position makeMove(Board board) {
        return strategy.makeMove(board);
    }

    public char symbol() {
        return symbol;
    }

    public String name() {
        return name;
    }

}
