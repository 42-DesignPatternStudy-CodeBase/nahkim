package IteratorPattern;

public class IteratorTest {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around the World in 80 Days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));

    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
        Book book = (Book)it.next();
        System.out.println("" + book.getName());
    }
    System.out.println("=====================");

    Iterator rit = bookShelf.reverseIterator();
    while (rit.hasNext()) {
        Book book = (Book)rit.next();
        System.out.println("" + book.getName());
    }

    System.out.println("=====================");
    BookFactory bookFactory = new BookFactory();
    Iterator it1 = bookFactory.create(bookShelf, 0);
    Iterator it2 = bookFactory.create(bookShelf, 1);

    while (it1.hasNext()) {
        Book book = (Book)it1.next();
        System.out.println("" + book.getName());
    }

    System.out.println("=====================");

    while (it2.hasNext()) {
        Book book = (Book)it2.next();
        System.out.println("" + book.getName());
    }
  }
}
