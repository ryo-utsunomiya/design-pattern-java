package info.ryo511.designpattern.TemplateMethod;

public class CharDisplay extends AbstractDisplay {

  private final char ch;

  public CharDisplay(char ch) {
    this.ch = ch;
  }

  public String open() {
    return "<<";
  }

  public String print() {
    return String.valueOf(this.ch);
  }

  public String close() {
    return ">>";
  }
}
