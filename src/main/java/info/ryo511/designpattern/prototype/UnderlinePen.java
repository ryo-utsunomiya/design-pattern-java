package info.ryo511.designpattern.prototype;

import info.ryo511.designpattern.prototype.framework.Product;

public class UnderlinePen extends Product {

  private final char ulChar;

  public UnderlinePen(char ulChar) {
    this.ulChar = ulChar;
  }

  @Override
  public void use(String s) {
    System.out.printf("\"%s\"%n", s);
    System.out.printf(" %s %n", String.valueOf(ulChar).repeat(s.getBytes().length));
  }
}
