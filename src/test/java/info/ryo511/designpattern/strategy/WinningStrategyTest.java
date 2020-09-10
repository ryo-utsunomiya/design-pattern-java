package info.ryo511.designpattern.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WinningStrategyTest {

  @Test
  void nextHand() {
    var SUT = new WinningStrategy(1);
    var currentHand = SUT.nextHand();
    SUT.study(true);
    assertEquals(currentHand, SUT.nextHand());
  }
}