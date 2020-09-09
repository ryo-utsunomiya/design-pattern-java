package info.ryo511.designpattern.bridge;

public class Display {

  private final DisplayImpl impl;

  public Display(DisplayImpl impl) {
    this.impl = impl;
  }

  public void open() {
    this.impl.rawOpen();
  }

  public void print() {
    this.impl.rawPrint();
  }

  public void close() {
    this.impl.rawClose();
  }

  public final void display() {
    open();
    print();
    close();
  }
}
