package ObserverPattern;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    public RandomNumberGenerator() {
        execute();
    }
    public int getNumber() {
        return number;
    }
    public void execute() {
        number = random.nextInt(0, 10);
        notifyObservers();

    } 
}