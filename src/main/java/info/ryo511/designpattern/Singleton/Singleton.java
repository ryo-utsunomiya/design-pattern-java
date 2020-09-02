package info.ryo511.designpattern.Singleton;

public class Singleton {

  private static final Singleton singleton = new Singleton();

  private Singleton() {
    System.out.println("インスタンスを生成しました");
  }

  public static Singleton getInstance() {
    return singleton;
  }
}
