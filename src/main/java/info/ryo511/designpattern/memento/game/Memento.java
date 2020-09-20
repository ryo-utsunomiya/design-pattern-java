package info.ryo511.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

  private final int money;
  private final List<String> fruits = new ArrayList<>();

  Memento(int money) {
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  void addFruit(String fruit) {
    fruits.add(fruit);
  }

  List<String> getFruits() {
    return fruits;
  }
}
