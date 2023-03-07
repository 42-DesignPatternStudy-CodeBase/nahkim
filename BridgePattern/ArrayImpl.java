package BridgePattern;
import java.util.*;

public class ArrayImpl<T> implements AbstractList<T> {

  private ArrayList<T> arrayList = new ArrayList<T>();

  public void addElement(T obj) {
    arrayList.add(obj);
  }

  public T deleteElement(int i) {
    return arrayList.remove(i);
  }

  public int insertElement(T obj, int i) {
    try {
      arrayList.add(i, obj);
      return i;
    }
    catch(IndexOutOfBoundsException e) {
      return -1;
    }
  }

  public T getElement(int i) {
    return arrayList.get(i);
  }

  public int getElementSize() {
    return arrayList.size();
  }
}
