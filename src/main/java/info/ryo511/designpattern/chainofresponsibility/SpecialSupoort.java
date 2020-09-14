package info.ryo511.designpattern.chainofresponsibility;

public class SpecialSupoort extends Support {

  private final int number;

  public SpecialSupoort(String name, int number) {
    super(name);
    this.number = number;
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return trouble.getNumber() == number;
  }
}
