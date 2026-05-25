package problems.tictactoe.selfandllm;

import java.util.Scanner;

public class HumanMoveStrategy implements MoveStrategy{
    private Scanner sc;
    public HumanMoveStrategy(){
        sc = new Scanner(System.in);
    }
    @Override
    public Position makeMove(Board board) {
        System.out.println("Enter row and column:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new Position(row, col);
    }
}
