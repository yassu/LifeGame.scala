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
  it("Cell of Black object should be initialized.") {
    Cell(Black)
  }
  describe("Test for Char of White Cell") {
    it("Char of White Cell should be □.") {
      assert(Cell(White).colorChar == '□')
    }
    it("Char of Black Cell should be ■.") {
      assert(Cell(Black).colorChar == '■')
    }
  }
  describe("isAlive") {
    it("If color is White, isAlive is True.") {
      assert(Cell(Black).isAlive)
    }
  }
}

class BoardSpec extends FunSpec {
  it("Board instance should be initialized.") {
    Board(List(
        List(Cell(Black), Cell(Black), Cell(White)),
        List(Cell(Black), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(White))
      )
    )
  }

  it("putCell") {
    val board = Board(List(
      List(Cell(White), Cell(Black), Cell(White)),
      List(Cell(White), Cell(White), Cell(White))
    ))
    val resultBoard = Board(List(
      List(Cell(White), Cell(Black), Cell(White)),
      List(Cell(White), Cell(White), Cell(Black))
    ))
    assert(board.putCell(Cell(Black), (1, 2)) == resultBoard)
  }

  describe("size") {
    val board = Board(List(
      List(Cell(Black), Cell(White), Cell(White)),
      List(Cell(White), Cell(White), Cell(White))
    ))
    assert(board.size == (3, 2))
  }

  describe("numberOfAlivedNeighborCells") {
    val board = Board(List(
      List(Cell(Black), Cell(Black), Cell(White)),
      List(Cell(Black), Cell(White), Cell(White)),
      List(Cell(White), Cell(White), Cell(White))
    ))
    it("test1") {
      assert(board.numberOfAlivedNeighborCells(0, 0) == 2)
    }
    it("test2") {
      assert(board.numberOfAlivedNeighborCells(1, 1) == 3)
    }
  }

  describe("nextCell") {
    it("birth") {
      val board = Board(List(
        List(Cell(Black), Cell(Black), Cell(White)),
        List(Cell(White), Cell(White), Cell(White)),
        List(Cell(White), Cell(Black), Cell(White))
      ))
      assert(board.nextCell(1, 0) == Cell(Black))
    }
    it("existence2") {
      val board = Board(List(
        List(Cell(Black), Cell(Black), Cell(White), Cell(White)),
        List(Cell(White), Cell(Black), Cell(Black), Cell(Black))
      ))
      assert(board.nextCell(0, 0) == Cell(Black))
    }
    it("existence3") {
      val board = Board(List(
        List(Cell(Black), Cell(Black), Cell(White)),
        List(Cell(Black), Cell(Black), Cell(Black)),
        List(Cell(White), Cell(Black), Cell(Black))
      ))
      assert(board.nextCell(2, 2) == Cell(Black))
    }
    it("depopulation0") {
      val board = Board(List(
        List(Cell(White), Cell(White), Cell(Black)),
        List(Cell(Black), Cell(White), Cell(White))
      ))
      assert(board.nextCell(1, 0) == Cell(White))
    }
    it("depopulation1") {
      val board = Board(List(
        List(Cell(White), Cell(White), Cell(Black)),
        List(Cell(Black), Cell(White), Cell(White))
      ))
      assert(board.nextCell(1, 0) == Cell(White))
    }
    it("overcrowded") {
      val board = Board(List(
        List(Cell(Black), Cell(Black), Cell(Black)),
        List(Cell(White), Cell(Black), Cell(White)),
        List(Cell(White), Cell(Black), Cell(White))
      ))
      assert(board.nextCell(1, 1) == Cell(White))
    }
  }

  describe("nextBoard") {
    it("Block") {
      val blockBoard = Board(List(
        List(Cell(White), Cell(White), Cell(White), Cell(White)),
        List(Cell(White), Cell(Black), Cell(Black), Cell(White)),
        List(Cell(White), Cell(Black), Cell(Black), Cell(White)),
        List(Cell(White), Cell(White), Cell(White), Cell(White))
      ))
      assert(blockBoard.nextBoard == blockBoard)
    }
    it("blinker") {
      val blinkerBoard = Board(List(
        List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
        List(Cell(White), Cell(Black), Cell(Black), Cell(Black), Cell(White)),
        List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
      ))
      val blinkerNextBoard = Board(List(
        List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(Black), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(Black), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(Black), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(White), Cell(White), Cell(White)),
      ))
      assert(blinkerBoard.nextBoard == blinkerNextBoard)
    }
  }

  it("toString") {
    assert(Board(List(
        List(Cell(Black), Cell(Black), Cell(White)),
        List(Cell(Black), Cell(White), Cell(White)),
        List(Cell(White), Cell(White), Cell(White))
      )).toString ==
      "■■□\n" +
      "■□□\n" +
      "□□□"
    )
  }

  it("emptyBoard") {
    val resultBoard = Board(List(
      List(Cell(White), Cell(White), Cell(White)),
      List(Cell(White), Cell(White), Cell(White)),
    ))
    assert(Board.emptyBoard((3, 2)) == resultBoard)
  }
}
