package lifegame.elements

sealed trait Color

case object Black extends Color
case object White extends Color

case class Cell(color: Color) {
  def colorChar: Char = color match {
    case Black => '■'
    case White => '□'
  }
}

case class Board(aliveIndexes: List[(Int, Int)], size: (Int, Int))
