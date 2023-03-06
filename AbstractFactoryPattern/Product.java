package AbstractFactoryPattern;

public class Product {
  private String productId;
  private String productName;

  void setProductId(String productid) {
    this.productId = productid;
  }

  void setProductName(String productname) {
    this.productName = productname;
  }

  String getProductId() {
    return this.productId;
  }

  String getProductName() {
    return this.productName;
  }

  void print() {
    System.out.println(String.format("productId : %s", productId));
    System.out.println(String.format("productName : %s", productName));
  }
}
