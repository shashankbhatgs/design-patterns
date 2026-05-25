## Board owns:
cell state
move validity
placing moves
querying state

## Game owns:
turn flow
current player
game lifecycle
## WinningStrategy owns:
winner determination rules

## Player owns:
symbol
move generation behavior


## At the end, we have
A very polished explanation could be:

Game asks current Player for next move
Player delegates move generation to MoveStrategy
Strategy returns Position
Game asks Board to place move
Board validates and updates state
If move invalid → Game retries same player
If valid → Game invokes WinningStrategy using latest move
If winner found → Game ends
Else if board full → draw
Else switch player


Prefer expressive state models over ambiguous booleans when multiple states exist. 



```text
Game
 → Player.makeMove(board)
      → strategy.makeMove(board)
           → returns Position

Game
 → board.placeMove(position, player.getSymbol())
```