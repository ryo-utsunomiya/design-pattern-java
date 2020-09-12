package info.ryo511.designpattern.decorator;

public class StringDisplay extends AbstractDisplay {

  private final String string;

  public StringDisplay(String string) {
    this.string = string;
  }

  @Override
  public int getColumns() {
    return string.getBytes().length;
  }

  @Override
  public int getRows() {
    return 1;
  }

  @Override
  public String getRowText(int row) {
    return row == 0 ? string : null;
  }
}
