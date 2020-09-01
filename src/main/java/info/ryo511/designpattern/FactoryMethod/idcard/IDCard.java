package info.ryo511.designpattern.FactoryMethod.idcard;

import info.ryo511.designpattern.FactoryMethod.framework.Product;

public class IDCard extends Product {

  private final String owner;

  IDCard(String owner) {
    this.owner = owner;
  }

  public void use() {
    System.out.println(owner + "のカードを使います。");
  }

  public String getOwner() {
    return owner;
  }
}
