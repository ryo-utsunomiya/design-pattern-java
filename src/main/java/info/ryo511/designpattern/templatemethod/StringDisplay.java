package info.ryo511.designpattern.templatemethod;

public class StringDisplay extends AbstractDisplay {

  private final String string;
  private final int width;

  public StringDisplay(String string) {
    this.string = string;
    this.width = string.length();
  }

  public String open() {
    return printLine();
  }

  public String print() {
    return "|" + string + "|\n";
  }

  public String close() {
    return printLine();
  }

  private String printLine() {
    return "+" + "-".repeat(Math.max(0, width)) + "+\n";
  }
}
