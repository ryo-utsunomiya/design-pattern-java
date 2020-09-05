package info.ryo511.designpattern.templatemethod;

public abstract class AbstractDisplay {

  abstract String open();

  abstract String print();

  abstract String close();

  public final String display() {
    var sb = new StringBuilder();
    sb.append(open());
    for (int i = 0; i < 5; i++) {
      sb.append(print());
    }
    sb.append(close());
    return sb.toString();
  }
}
