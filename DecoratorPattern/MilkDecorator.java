package DecoratorPattern;

public class MilkDecorator extends Decorator {
  public MilkDecorator(Component coffeeComponent) {
    super(coffeeComponent);
  }

  @Override
  public String add() {
    return super.add() + " Adding Milk";
  }
}
