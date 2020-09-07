package info.ryo511.designpattern.abstractfactory.factory;

public abstract class Item {

  protected final String caption;

  public Item(String caption) {
    this.caption = caption;
  }

  public abstract String makeHTML();
}
