package info.ryo511.designpattern.abstractfactory.listfactory;

import info.ryo511.designpattern.abstractfactory.factory.Factory;
import info.ryo511.designpattern.abstractfactory.factory.Link;
import info.ryo511.designpattern.abstractfactory.factory.Page;
import info.ryo511.designpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }
}
