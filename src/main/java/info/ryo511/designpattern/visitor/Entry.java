package info.ryo511.designpattern.visitor;

import java.util.Collections;
import java.util.Iterator;

public abstract class Entry implements Element, Iterable<Entry> {

  public abstract String getName();

  public abstract int getSize();

  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  public Iterator<Entry> iterator() {
    return Collections.emptyIterator();
  }

  public String toString() {
    return String.format("%s (%d)", getName(), getSize());
  }
}
