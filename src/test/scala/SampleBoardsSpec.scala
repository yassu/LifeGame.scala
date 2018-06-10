package lifegame.sampleboards

import org.scalatest.FunSpec

class SampleBoardsSpec extends FunSpec {
  describe("blockBoard.cycle") {
    assert(SampleBoards.blockBoard.isFixed())
  }

  describe("beehive") {
    assert(SampleBoards.beehive.isFixed())
  }

  describe("boat") {
    assert(SampleBoards.boat.isFixed())
  }

  describe("ship") {
    assert(SampleBoards.ship.isFixed())
  }

  describe("pond") {
    assert(SampleBoards.pond.isFixed())
  }

  describe("blinker") {
    assert(SampleBoards.blinker.cycle() == 2)
  }
}
