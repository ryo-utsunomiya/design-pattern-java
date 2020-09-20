package info.ryo511.designpattern.memento;

import info.ryo511.designpattern.memento.game.Gamer;

public class Main {

  public static void main(String[] args) {
    var gamer = new Gamer(100);
    var memento = gamer.createMemento();
    for (int i = 0; i < 100; i++) {
      System.out.println(gamer);
      gamer.bet();
      System.out.printf("money: %d%n", gamer.getMoney());

      if (gamer.getMoney() > memento.getMoney()) {
        System.out.println("saving current state");
        memento = gamer.createMemento();
      } else if (gamer.getMoney() < memento.getMoney()) {
        System.out.println("restoring previous state...");
        gamer.restoreMemento(memento);
      }

      try {
        Thread.sleep(1000);
      } catch (InterruptedException ignored) {
      }
    }
  }
}
