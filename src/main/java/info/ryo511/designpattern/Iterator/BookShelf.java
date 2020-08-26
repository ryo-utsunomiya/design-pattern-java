package info.ryo511.designpattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

  private final List<Book> books;

  public BookShelf() {
    this(10);
  }

  public BookShelf(int maxsize) {
    this.books = new ArrayList<>(maxsize);
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
