package info.ryo511.designpattern.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

  private final Random random;

  private boolean won = false;

  private Hand nextHand;

  public WinningStrategy(int seed) {
    random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    if (!won) {
      nextHand = Hand.getHand(random.nextInt(3));
    }
    return nextHand;
  }

  @Override
  public void study(boolean win) {
    won = win;
  }
}
