package IteratorPattern;

public class BookIterator implements Iterator {

  private BookShelf bookshelf;
  private int index;

  public BookIterator(BookShelf bookshelf) {
    this.bookshelf = bookshelf;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return (index < bookshelf.getLength());
  }

  @Override
  public Object next() {
    Book book = bookshelf.getBook(index);
    index++;
    return book;
  }
  
}
