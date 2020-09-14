package info.ryo511.designpattern.chainofresponsibility;

public abstract class Support {

  private final String name;

  private Support next;

  public Support(String name) {
    this.name = name;
  }

  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  public final void support(Trouble trouble) {
    if (resolve(trouble)) {
      done(trouble);
    } else if (next != null) {
      next.support(trouble);
    } else {
      fail(trouble);
    }
  }

  @Override
  public String toString() {
    return String.format("[%s]", name);
  }

  protected abstract boolean resolve(Trouble trouble);

  protected void done(Trouble trouble) {
    System.out.printf("%s is resolved by %s.%n", trouble, this);
  }

  protected void fail(Trouble trouble) {
    System.out.printf("%s is cannot be resolved.%n", trouble);
  }
}
