package FactoryMethodPattern;

public class CarTest {

  public static void main(String[] args) {

    CarFactory factory = new ProduceCar();
    Car genesis = factory.produceCar(CarType.GENESIS);
    Car grandeur = factory.produceCar(CarType.GRANDEUR);
    Car sonata = factory.produceCar(CarType.SONATA);

    System.out.println(genesis.toString());
    System.out.println(grandeur.toString());
    System.out.println(sonata.toString());
  }
}
