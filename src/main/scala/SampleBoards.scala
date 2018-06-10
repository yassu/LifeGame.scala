package lifegame.sampleboards

import lifegame.elements.{Board, Cell, White, Black}

object SampleBoards {
  def blockBoard: Board = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White))
  ))

  def beehive: Board = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(White), Cell(White), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(Black), Cell(Black), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))

  def blinkerBoard: Board = Board(List(
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(Black), Cell(Black), Cell(Black), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
    List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
  ))
}
