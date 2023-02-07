package DecoratorPattern;

public class Decorator implements Component {
  public Component coffeeComponent;

  public Decorator(Component coffeeComponent) {
    this.coffeeComponent = coffeeComponent;
  }

  public String add() {
    return coffeeComponent.add();
  }
  
}