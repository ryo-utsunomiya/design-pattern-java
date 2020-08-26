package info.ryo511.designpattern.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookShelfIteratorTest {

  @Test
  void canIterateOverBookShelf() {
    String[] names = {"Around the world in 80 Days", "Bible", "Cinderella", "Daddy-Long-Legs"};
    var bookShelf = new BookShelf();

    for (var name : names) {
      bookShelf.add(new Book(name));
    }

    int i = 0;
    for (var book : bookShelf) {
      assertEquals(names[i++], book.getName());
    }
  }
}