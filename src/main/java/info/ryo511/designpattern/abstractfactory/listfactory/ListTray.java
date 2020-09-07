package info.ryo511.designpattern.abstractfactory.listfactory;

import info.ryo511.designpattern.abstractfactory.factory.Item;
import info.ryo511.designpattern.abstractfactory.factory.Tray;

public class ListTray extends Tray {

  public ListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    var sb = new StringBuilder();
    sb.append("<li>");
    sb.append(caption);
    sb.append("<ul>");
    for (var item : tray) {
      sb.append(item.makeHTML());
    }
    sb.append("</ul>");
    sb.append("</li>");
    return sb.toString();
  }
}
