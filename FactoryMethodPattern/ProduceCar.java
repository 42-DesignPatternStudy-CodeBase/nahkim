package FactoryMethodPattern;

public class ProduceCar extends CarFactory {

  @Override
  public Car produceCar(CarType cartype) {
    
    switch (cartype) {
      case SONATA:
        return new Sonata();
      case GENESIS:
        return new Genesis();
      case GRANDEUR:
        return new Grandeur();
      default:
        throw new RuntimeException("noname");
    }
  }
  
}
