package info.ryo511.designpattern.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

  private final Writer writer;

  public HtmlWriter(Writer writer) {
    this.writer = writer;
  }

  public void title(String title) throws IOException {
    writer.write("<html>");
    writer.write("<head>");
    writer.write("<meta charset=\"utf-8\">");
    writer.write(String.format("<title>%s</title>", title));
    writer.write("</head>");
    writer.write("<body>");
  }

  public void paragraph(String msg) throws IOException {
    writer.write(String.format("<p>%s</p>", msg));
  }

  public void link(String href, String caption) throws IOException {
    writer.write(String.format("<a href=\"%s\">%s</a>", href, caption));
  }

  public void mailto(String mailAddress, String userName) throws IOException {
    link("mailto:" + mailAddress, userName);
  }

  public void close() throws IOException {
    writer.write("</body>");
    writer.write("</html>");
    writer.close();
  }
}
