package DecoratorPattern;

public class MochaDecorator extends Decorator {
  public MochaDecorator(Component coffeeComponent) {
    super(coffeeComponent);
  }

  @Override
  public String add() {
    return super.add() + " Adding Mocha";
  }
}
