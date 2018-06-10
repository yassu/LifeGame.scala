package lifegame.elements

sealed trait Color

case object White extends Color
case object Black extends Color

case class Cell(color: Color) {
  def colorChar: Char = color match {
    case White => '□'
    case Black => '■'
  }

  def isAlive: Boolean = color match {
    case White => false
    case Black => true
  }

  def isDead: Boolean = ! isAlive
}

case class Board(cells: List[List[Cell]]) {
  def getCell(y: Int, x: Int): Cell = cells(y)(x)
  def putCell(cell: Cell, t: (Int, Int)): Board = Board(
    (
      for(y <- (0 until cells.length)) yield(
        (
          for(x <- (0 until cells.head.length))
              yield if (t._1 == y && t._2 == x) cell else cells(y)(x)
        ).toList
      )
    ).toList
  )
  def size: (Int, Int) = (this.cells(0).size, this.cells.size)

  def numberOfAlivedNeighborCells(y: Int, x: Int): Int = {
    Set(
      (x - 1, y - 1), (x, y - 1), (x + 1, y - 1),
      (x - 1, y), (x + 1, y),
      (x - 1, y + 1), (x, y + 1), (x + 1, y + 1)).
    filter(t =>
      t._1 >= 0 && t._1 < size._1 &&
      t._2 >= 0 && t._2 < size._2 &&
      cells(t._2)(t._1).isAlive
      ).size
  }

  def nextCell(y: Int, x: Int) =
    if (cells(y)(x).isDead && numberOfAlivedNeighborCells(y, x) == 3) Cell(Black)
    else if (cells(y)(x).isAlive && Set(2, 3).contains(numberOfAlivedNeighborCells(y, x)))
      Cell(Black)
    else if (cells(y)(x).isAlive && numberOfAlivedNeighborCells(y, x) <= 1)
      Cell(White)
    else if (cells(y)(x).isAlive && numberOfAlivedNeighborCells(y, x) >= 4)
      Cell(White)
    else cells(y)(x)

  def nextBoard: Board = Board(
    (
      for (y <- (0 until cells.length)) yield (
        for (x <- (0 until cells.head.length)) yield this.nextCell(y, x)
      ).toList
    ).toList)


  override def toString: String =
    (for (y <- (0 until cells.length)) yield (
      for (x <- (0 until cells.head.length)) yield cells(y)(x).colorChar
    ).mkString("")).mkString("\n")

}

object Board {
  def emptyBoard(size: (Int, Int)): Board =
    Board(
      (
        for (y <- (0 until size._2)) yield (
          (
            for (x <- (0 until size._1)) yield Cell(White)
          ).toList
        )
      ).toList
    )
}

