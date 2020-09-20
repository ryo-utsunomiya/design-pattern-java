package info.ryo511.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

  private int money;
  private List<String> fruits = new ArrayList<>();
  private final Random random = new Random();
  private static final String[] fruitsNames = {
      "apple",
      "grape",
      "banana",
      "orange"
  };

  public Gamer(int money) {
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  private String getFruit() {
    String prefix = "";
    if (random.nextBoolean()) {
      prefix = "delicious ";
    }
    return prefix + fruitsNames[random.nextInt(fruitsNames.length)];
  }

  public void bet() {
    int dice = random.nextInt(6) + 1;
    if (dice == 1) {
      money += 100;
    } else if (dice == 2) {
      money /= 2;
    } else if (dice == 6) {
      fruits.add(getFruit());
    }
  }

  public Memento createMemento() {
    var m = new Memento(money);
    fruits.stream().filter(f -> f.startsWith("delicious")).forEach(m::addFruit);
    return m;
  }

  public void restoreMemento(Memento memento) {
    this.money = memento.getMoney();
    this.fruits = memento.getFruits();
  }

  @Override
  public String toString() {
    return String.format("[money = %d, fruits = %s]", money, fruits);
  }
}
