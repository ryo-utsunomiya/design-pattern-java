package info.ryo511.designpattern.observer;

public class Main {
  public static void main(String[] args) {
    var generator = new RandomNumberGenerator();
    var observer1 = new DigitObserver();
    generator.addObserver(observer1);
    generator.execute();
  }
}
