package lifegame.elements

sealed trait Color

case object Black extends Color
case object White extends Color

case class Cell(color: Color) {
  def colorChar: Char = color match {
    case Black => '■'
    case White => '□'
  }

  def isAlive = color match {
    case Black => false
    case White => true
  }
}

case class Board(cells: List[List[Cell]]) {
  override def toString: String =
    (for (y <- (0 until cells.length)) yield (
      for (x <- (0 until cells.head.length)) yield cells(y)(x).colorChar
    ).mkString("")).mkString("\n")
}
