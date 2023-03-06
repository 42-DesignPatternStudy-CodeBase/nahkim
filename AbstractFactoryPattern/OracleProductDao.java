package AbstractFactoryPattern;

public class OracleProductDao implements ProductDao {

  @Override
  public void insertProduct(Product product) {
    System.out.println(String.format("ORACLE : Insert Product as %s %s", product.getProductId(), product.getProductName()));
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println(String.format("ORACLE : Update Product as %s %s", product.getProductId(), product.getProductName()));
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println(String.format("ORACLE : Delete Product as %s %s", product.getProductId(), product.getProductName()));
  }
  
}
