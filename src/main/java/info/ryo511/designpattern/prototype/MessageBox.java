package info.ryo511.designpattern.prototype;

import info.ryo511.designpattern.prototype.framework.Product;

public class MessageBox extends Product {

  private final char decoChar;

  public MessageBox(char deco) {
    this.decoChar = deco;
  }

  @Override
  public void use(String s) {
    String decoLine = String.valueOf(decoChar).repeat(s.getBytes().length + 4);

    System.out.printf("%s%n", decoLine);
    System.out.printf("%s %s %s%n", decoChar, s, decoChar);
    System.out.printf("%s%n", decoLine);
  }
}
