package info.ryo511.designpattern.factorymethod.idcard;

import info.ryo511.designpattern.factorymethod.framework.Product;

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
