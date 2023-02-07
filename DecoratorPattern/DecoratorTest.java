package DecoratorPattern;

public class DecoratorTest {
  public static void main(String[] args) {

    Component kenyaBean = new KenyaBeanComponent();
    System.out.println(kenyaBean.add());

    // Component latte = new MilkDecorator(new KenyaBeanComponent());
    Component latte = new MilkDecorator(kenyaBean);
    System.out.println(latte.add());

    Component syrupCoffee = new SyrupDecorator(new MilkDecorator(new KenyaBeanComponent()));
    System.out.println(syrupCoffee.add());

    Component etiopiaBean = new WhippedCreamDecorator(new SyrupDecorator(new MochaDecorator(new MilkDecorator(new EtiopiaBeanComponent()))));
    System.out.println(etiopiaBean.add());
  }
}
