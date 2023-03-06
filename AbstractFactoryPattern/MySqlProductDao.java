package AbstractFactoryPattern;

public class MySqlProductDao implements ProductDao {

  @Override
  public void insertProduct(Product product) {
    System.out.println(String.format("MYSQL : Insert Product as %s %s", product.getProductId(), product.getProductName()));
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println(String.format("MYSQL : Update Product as %s %s", product.getProductId(), product.getProductName()));
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println(String.format("MYSQL : Delete Product as %s %s", product.getProductId(), product.getProductName()));
  }
  
}
