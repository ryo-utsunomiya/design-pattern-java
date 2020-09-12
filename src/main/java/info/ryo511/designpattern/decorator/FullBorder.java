package info.ryo511.designpattern.decorator;

public class FullBorder extends AbstractBorder {

  public FullBorder(AbstractDisplay display) {
    super(display);
  }

  @Override
  public int getColumns() {
    return 1 + display.getColumns() + 1;
  }

  @Override
  public int getRows() {
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0 || row == display.getRows() + 1) {
      return "+" + "-".repeat(display.getColumns()) + "+";
    }
    return "|" + display.getRowText(row - 1) + "|";
  }
}
