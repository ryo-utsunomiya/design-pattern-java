package info.ryo511.designpattern.Adapter;

public class Banner {

  private final String string;

  public Banner(String s) {
    this.string = s;
  }

  public String getWithParen() {
    return "(" + this.string + ")";
  }

  public String getWithAster() {
    return "*" + this.string + "*";
  }
}
