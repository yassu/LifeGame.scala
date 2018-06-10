package lifegame

import lifegame.sampleboards.SampleBoards

object Application extends App {
  var board = SampleBoards.blinkerBoard
  for (i <- (0 to 3)) {
    board = board.nextBoard
    println(board)
    println()
  }
}
