package lifegame.sampleboards

import lifegame.elements.{Board, Cell, White, Black}

object SampleBoards {
  val blockBoard = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White))
  ))

  val beehive = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(White), Cell(White), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  val boat = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(White), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  val ship = Board(List(
      List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
      List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White)),
      List(Cell(White), Cell(Black), Cell(White), Cell(Black), Cell(White)),
      List(Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
      List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    ))

  val pond = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(White), Cell(White), Cell(Black), Cell(White)),
    List(Cell(White), Cell(Black), Cell(White), Cell(White), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  val blinker = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  val toad = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  val beacon = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  val clock = Board(List(
    List(Cell(White), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black)),
    List(Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(White)),
  ))
}
