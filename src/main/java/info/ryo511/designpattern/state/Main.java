package info.ryo511.designpattern.state;

public class Main {

  public static void main(String[] args) {
    var frame = new SafeFrame("State Sample");
    while (true) {
      for (int i = 0; i < 24; i++) {
        frame.setClock(i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
      }
    }
  }
}
