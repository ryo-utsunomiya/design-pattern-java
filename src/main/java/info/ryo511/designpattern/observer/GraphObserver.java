package info.ryo511.designpattern.observer;

public class GraphObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    System.out.println("GraphObserver:" + "*".repeat(generator.getNumber()));
    try {
      Thread.sleep(100);
    } catch (InterruptedException ignored) {
    }
  }
}
