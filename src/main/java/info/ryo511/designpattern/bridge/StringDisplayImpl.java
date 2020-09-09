package info.ryo511.designpattern.bridge;

public class StringDisplayImpl extends DisplayImpl {

  private final String string;

  private final int width;

  public StringDisplayImpl(String string) {
    this.string = string;
    this.width = string.length();
  }

  @Override
  public void rawOpen() {
    printLine();
  }

  @Override
  public void rawPrint() {
    System.out.println("|" + string + "|");
  }

  @Override
  public void rawClose() {
    printLine();
  }

  private void printLine() {
    System.out.println("+" + "-".repeat(width) + "+");
  }
}
