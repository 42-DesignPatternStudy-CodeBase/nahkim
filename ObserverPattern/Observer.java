package ObserverPattern;

public interface Observer {
    public abstract void update(NumberGenerator generator);
    public abstract void display();
}
