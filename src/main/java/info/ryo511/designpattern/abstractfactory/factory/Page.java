package info.ryo511.designpattern.abstractfactory.factory;

import java.util.ArrayList;

public abstract class Page {

  protected String title;
  protected String author;
  protected ArrayList<Item> content = new ArrayList<>();

  public Page(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void add(Item item) {
    content.add(item);
  }

  public abstract String makeHTML();
}
