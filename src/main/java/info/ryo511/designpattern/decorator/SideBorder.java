package info.ryo511.designpattern.decorator;

public class SideBorder extends AbstractBorder {

  private final char borderChar;

  public SideBorder(AbstractDisplay display, char ch) {
    super(display);
    this.borderChar = ch;
  }

  @Override
  public int getColumns() {
    return 1 + display.getColumns() + 1;
  }

  @Override
  public int getRows() {
    return display.getRows();
  }

  @Override
  public String getRowText(int row) {
    return borderChar + display.getRowText(row) + borderChar;
  }
}
