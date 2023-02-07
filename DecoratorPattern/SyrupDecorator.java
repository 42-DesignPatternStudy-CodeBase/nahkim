package DecoratorPattern;

public class SyrupDecorator extends Decorator {
  public SyrupDecorator(Component coffeeComponent) {
    super(coffeeComponent);
  }

  @Override
  public String add() {
    return super.add() + " Adding Syrup";
  }
}
