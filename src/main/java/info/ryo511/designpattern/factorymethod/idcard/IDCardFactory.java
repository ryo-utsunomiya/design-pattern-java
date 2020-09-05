package info.ryo511.designpattern.factorymethod.idcard;

import info.ryo511.designpattern.factorymethod.framework.Factory;
import info.ryo511.designpattern.factorymethod.framework.Product;
import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

  private final List<String> owners = new ArrayList<String>();

  protected Product createProduct(String owner) {
    System.out.println(owner + "のカードを作ります。");
    return new IDCard(owner);
  }

  protected void registerProduct(Product product) {
    owners.add(((IDCard) product).getOwner());
  }

  public List<String> getOwners() {
    return owners;
  }
}
