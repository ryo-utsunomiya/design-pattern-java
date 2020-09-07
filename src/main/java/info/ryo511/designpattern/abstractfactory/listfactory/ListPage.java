package info.ryo511.designpattern.abstractfactory.listfactory;

import info.ryo511.designpattern.abstractfactory.factory.Page;

public class ListPage extends Page {

  public ListPage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    var sb = new StringBuilder();
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<meta charset=\"utf-8\" />");
    sb.append(String.format("<title>%s</title>", title));
    sb.append("</head>");
    sb.append("<body>");
    sb.append(String.format("<h1>%s</h1>", title));
    sb.append("<ul>");
    for (var item : content) {
      sb.append(item.makeHTML());
    }
    sb.append("</ul>");
    sb.append("<hr>");
    sb.append(String.format("<address>%s</address>", author));
    sb.append("</body>");
    sb.append("</html>");
    return sb.toString();
  }
}
