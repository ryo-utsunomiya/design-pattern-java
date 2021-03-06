package info.ryo511.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

  private final List<Book> books;

  public BookShelf() {
    this(10);
  }

  public BookShelf(int initialCapacity) {
    this.books = new ArrayList<>(initialCapacity);
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  public void add(Book book) {
    books.add(book);
  }

  public int getLength() {
    return books.size();
  }
  
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }
}
