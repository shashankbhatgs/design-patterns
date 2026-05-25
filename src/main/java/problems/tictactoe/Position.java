package problems.tictactoe;

import java.util.Objects;

public class Position {
    private final int row;
    private final int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


//Since Position is a value object, I’ll override equals/hashCode based on row and column.
// Because p1 = new Position(2, 3) should be equal to p2 = new Position(2, 3) // we need p1 == p2.
// Hence, overriding equals and hashcode
// We don't have to spend 10-15mins overriding equals/hashcode. We can just inform this to the interviewer

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return row == position.row && col == position.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
