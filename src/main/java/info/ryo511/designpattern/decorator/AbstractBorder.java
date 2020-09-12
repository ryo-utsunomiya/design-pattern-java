package info.ryo511.designpattern.decorator;

public abstract class AbstractBorder extends AbstractDisplay {

  protected AbstractDisplay display;

  protected AbstractBorder(AbstractDisplay display) {
    this.display = display;
  }
}
