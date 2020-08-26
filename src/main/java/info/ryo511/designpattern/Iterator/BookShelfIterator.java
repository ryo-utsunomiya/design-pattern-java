package info.ryo511.designpattern.Iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

  private final BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  public boolean hasNext() {
    return index < bookShelf.getLength();
  }

  public Book next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
