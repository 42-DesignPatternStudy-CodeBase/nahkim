package VisitorPattern;

// 모든 visitor(기능 제공)를 받아주는 객체
public interface Acceptor {
    public abstract void accept(Visitor v);
}