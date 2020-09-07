package info.ryo511.designpattern.abstractfactory.factory;

public abstract class Link extends Item {

  protected final String url;

  public Link(String caption, String url) {
    super(caption);
    this.url = url;
  }
}
