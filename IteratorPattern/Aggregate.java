package IteratorPattern;

public interface Aggregate {
  public abstract Iterator iterator();
  public int getLength();
}