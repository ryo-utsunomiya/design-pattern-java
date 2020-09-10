package info.ryo511.designpattern.strategy;

public class Hand {

  public static final int HAND_VALUE_GUU = 0;
  public static final int HAND_VALUE_CHO = 1;
  public static final int HAND_VALUE_PAA = 2;

  public static final Hand[] hand = {
      new Hand(HAND_VALUE_GUU),
      new Hand(HAND_VALUE_CHO),
      new Hand(HAND_VALUE_PAA),
  };
  private static final String[] name = {
      "グー", "チョキ", "パー"
  };

  enum RESULT {
    WIN,
    LOSE,
    EVEN
  }

  private final int handValue;

  private Hand(int handValue) {
    this.handValue = handValue;
  }

  public static Hand getHand(int n) {
    return hand[n % 3];
  }

  public boolean isStrongerThan(Hand h) {
    return fight(h) == RESULT.WIN;
  }

  public boolean isWeakerThan(Hand h) {
    return fight(h) == RESULT.LOSE;
  }

  private RESULT fight(Hand h) {
    if (this.handValue == h.handValue) {
      return RESULT.EVEN;
    } else if ((this.handValue + 1) % 3 == h.handValue) {
      return RESULT.WIN;
    }
    return RESULT.LOSE;
  }

  public String toString() {
    return name[handValue];
  }
}
