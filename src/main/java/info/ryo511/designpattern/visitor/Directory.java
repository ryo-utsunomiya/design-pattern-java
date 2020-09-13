package info.ryo511.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

  private final String name;
  private final ArrayList<Entry> dir = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return dir.stream().mapToInt(Entry::getSize).sum();
  }

  @Override
  public Entry add(Entry entry) {
    dir.add(entry);
    return this;
  }

  @Override
  public Iterator<Entry> iterator() {
    return dir.iterator();
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
