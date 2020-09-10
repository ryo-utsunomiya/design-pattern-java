package info.ryo511.designpattern.strategy;

public class Main {

  public static void main(String[] args) {
    var p1 = new Player("Taro", new WinningStrategy(1));
    var p2 = new Player("Hana", new ProbStrategy(2));
    for (int i = 0; i < 10000; i++) {
      var h1 = p1.nextHand();
      var h2 = p2.nextHand();
      if (h1.isStrongerThan(h2)) {
        System.out.println("Winner:" + p1);
        p1.win();
        p2.lose();
      } else if (h1.isWeakerThan(h2)) {
        System.out.println("Winner:" + p2);
        p1.lose();
        p2.win();
      } else {
        System.out.println("Even");
        p1.even();
        p2.even();
      }
    }
    System.out.println("Total result:");
    System.out.println(p1.toString());
    System.out.println(p2.toString());
  }
}
