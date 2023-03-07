package BridgePattern;
import java.util.*;

public class LinkedListImpl<T> implements AbstractList<T> {
  
  private LinkedList<T> linkedList = new LinkedList<T>();

  public void addElement(T obj) {
    linkedList.add(obj);
  }

  public T deleteElement(int i) {
    return linkedList.remove(i);
  }

  public int insertElement(T obj, int i) {
    linkedList.add(i, obj);
    return i;
  }

  public T getElement(int i) {
    return linkedList.get(i);
  }

  public int getElementSize() {
    return linkedList.size();
  }
}
