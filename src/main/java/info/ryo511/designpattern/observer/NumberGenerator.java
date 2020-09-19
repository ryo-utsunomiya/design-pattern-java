package info.ryo511.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

  private final List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void deleteObserver(Observer observer) {
    this.observers.remove(observer);
  }

  public void notifyObservers() {
    observers.forEach(o -> o.update(this));
  }

  public abstract int getNumber();

  public abstract void execute();
}
