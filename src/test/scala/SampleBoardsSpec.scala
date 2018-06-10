package lifegame.sampleboards

import org.scalatest.FunSpec

class SampleBoardsSpec extends FunSpec {
  it("blockBoard.cycle") {
    assert(SampleBoards.blockBoard.isFixed())
  }

  it("beehive") {
    assert(SampleBoards.beehive.isFixed())
  }

  it("boat") {
    assert(SampleBoards.boat.isFixed())
  }

  it("ship") {
    assert(SampleBoards.ship.isFixed())
  }

  it("pond") {
    assert(SampleBoards.pond.isFixed())
  }

  it("blinker") {
    assert(SampleBoards.blinker.cycle() == 2)
  }

  it("toad") {
    assert(SampleBoards.toad.cycle() == 2)
  }

  it("beacon") {
    assert(SampleBoards.beacon.cycle() == 2)
  }

  it("clock") {
    assert(SampleBoards.clock.cycle() == 2)
  }
}
