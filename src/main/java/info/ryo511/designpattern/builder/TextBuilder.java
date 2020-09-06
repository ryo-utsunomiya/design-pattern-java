package info.ryo511.designpattern.builder;

public class TextBuilder extends Builder {

  private final StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    buffer.append("====================\n");
    buffer.append(String.format("『%s』%n", title));
    buffer.append("\n");
  }

  @Override
  public void makeString(String str) {
    buffer.append(String.format("■%s%n", str));
    buffer.append("\n");
  }

  @Override
  public void makeItems(String[] items) {
    for (var item : items) {
      buffer.append(String.format("- %s%n", item));
    }
    buffer.append("\n");
  }

  @Override
  public void close() {
    buffer.append("====================\n");
  }

  public String getResult() {
    return buffer.toString();
  }
}
