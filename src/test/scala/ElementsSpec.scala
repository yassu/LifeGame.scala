package lifegame.elements

import org.scalatest.FunSpec

class ColorSpec extends FunSpec {
  describe("Color object should be initialized.") {
    it("Black color object should be initialized.") {
      Black
    }
    it("White color object should be initialized.") {
      White
    }
  }

  describe("BlackCell object should be initialized.") {
    Cell(Black)
    assert(true)
  }
}

class CellSepc extends FunSpec {
  describe("Cell of Black object should be initialized.") {
    Cell(Black)
  }
  describe("Char of White Cell should be □.") {
    assert(Cell(White).colorChar == '□')
  }
}
