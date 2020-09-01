package info.ryo511.designpattern.FactoryMethod.framework;

public abstract class Factory {

  public final Product create(String owner) {
    var p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  protected abstract Product createProduct(String owner);

  protected abstract void registerProduct(Product product);
}
