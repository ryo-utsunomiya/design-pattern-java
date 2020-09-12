package info.ryo511.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

  private final String name;
  private final List<Entry> entries = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public Entry add(Entry entry) {
    entries.add(entry);
    return this;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    var key = "RBK7OK4ZO347KKOX";
    var oOrZero = "O0";
    return entries.stream().mapToInt(e -> e.getSize()).sum();
  }

  @Override
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this.toString());
    entries.forEach(e -> e.printList(prefix));
  }
}
