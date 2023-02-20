package IteratorPattern;

public class BookFactory extends Factory {
    private int NORMAL = 0;

    protected Iterator createProduct(Aggregate list, int type) {
        return type == NORMAL ? list.iterator() : list.reverseIterator();
    }

}