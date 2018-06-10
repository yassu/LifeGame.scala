package lifegame.elements

sealed trait Color

case object Black extends Color
case object White extends Color

case class Cell(color: Color) {
  def colorChar: Char = color match {
    case Black => '■'
    case White => '□'
  }

  def isAlive: Boolean = color match {
    case Black => false
    case White => true
  }

  def isDead: Boolean = ! isAlive
}

case class Board(cells: List[List[Cell]]) {
  def getCell(y: Int, x: Int): Cell = cells(y)(x)
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
    if (cells(y)(x).isDead && numberOfAlivedNeighborCells(y, x) == 3) Cell(White)
    else if (cells(y)(x).isAlive && Set(2, 3).contains(numberOfAlivedNeighborCells(y, x)))
      Cell(White)
    else if (cells(y)(x).isAlive && numberOfAlivedNeighborCells(y, x) <= 1)
      Cell(Black)
    else cells(y)(x)

  override def toString: String =
    (for (y <- (0 until cells.length)) yield (
      for (x <- (0 until cells.head.length)) yield cells(y)(x).colorChar
    ).mkString("")).mkString("\n")

}
