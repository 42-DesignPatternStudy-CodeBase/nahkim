package VisitorPattern;

import java.util.*;

public class Directory extends Entry {
  private String name;
  // 디렉토리 안에 또다른 엔트리가 들어갈 수 있기 때문
  private ArrayList<Entry> children;

  public Directory(String name) {
    this.name = name;
    children = new ArrayList<Entry>();
  }
  
  @Override
  // 방문자를 받아들임
  public void accept(Visitor v) { 
    v.visit(this);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int totalSize = 0;
    for (Entry child : children) {
      totalSize += child.getSize();
    }
    return totalSize;
  }
  
  public Entry add(Entry entry)  {
    children.add(entry);
    System.out.println("Add entry : " + entry.getName());
    return entry;
  }

  public Iterator<Entry> iterator() {
    return children.iterator();
  }
}