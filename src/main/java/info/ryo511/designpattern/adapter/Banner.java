package info.ryo511.designpattern.adapter;

public class Banner {

  private final String string;

  public Banner(String s) {
    this.string = s;
  }

  public String withParen() {
    return "(" + this.string + ")";
  }

  public String withAster() {
    return "*" + this.string + "*";
  }
}
