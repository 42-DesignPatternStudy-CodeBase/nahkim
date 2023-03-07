package BridgePattern;

import org.w3c.dom.ranges.RangeException;

public class Stack<T> extends List<T> {
  public Stack(AbstractList<T> list) {
    super(list);
    System.out.println("Stack를 구현합니다.");
  }
  public void push(T obj) {
    impl.addElement(obj);
  }

  public T pop() {
    if (impl.getElementSize() == 0) {
      throw new RangeException((short) 1, "잘못된 경로입니다.");
    }
    return impl.deleteElement(impl.getElementSize() - 1);
  }
}
