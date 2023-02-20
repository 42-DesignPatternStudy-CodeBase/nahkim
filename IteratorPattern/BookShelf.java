package IteratorPattern;

public class BookShelf implements Aggregate {

  private Book[] Books;
  private int num = 0;

  public BookShelf(int num) {
    this.Books = new Book[num];
  }

  public void appendBook(Book book) {
    this.Books[num] = book;
    num++;
  }

  public Book getBook(int index) {
    return Books[index];
  }

  @Override
  public Iterator iterator() {
    return new BookIterator(this);
  }

  @Override
  public int getLength() {
    return num;
  }
}
