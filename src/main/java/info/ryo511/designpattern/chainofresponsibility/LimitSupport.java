package info.ryo511.designpattern.chainofresponsibility;

public class LimitSupport extends Support {

  private final int limit;

  public LimitSupport(String name, int limit) {
    super(name);
    this.limit = limit;
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return trouble.getNumber() < limit;
  }
}
