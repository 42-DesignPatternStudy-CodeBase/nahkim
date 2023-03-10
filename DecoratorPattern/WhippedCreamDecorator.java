package DecoratorPattern;

public class WhippedCreamDecorator extends Decorator {
  public WhippedCreamDecorator(Component coffeeComponent) {
    super(coffeeComponent);
  }

  @Override
  public String add() {
    return super.add() + " Adding WhippedCream";
  }
}
