package info.ryo511.designpattern.iterator;

public class Main {

  public static void main(String[] args) {
    var bookShelf = new BookShelf();
    bookShelf.add(new Book("Around the world in 80 Days"));
    bookShelf.add(new Book("Bible"));
    bookShelf.add(new Book("Cinderella"));
    bookShelf.add(new Book("Daddy-Long-Legs"));
    for (Book book : bookShelf) {
      System.out.println(book.getName());
    }
  }
}
