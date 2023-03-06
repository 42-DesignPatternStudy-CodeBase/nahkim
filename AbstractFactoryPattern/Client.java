package AbstractFactoryPattern;

public class Client {

  public static void main(String[] args) {

    // UserInfo info = new UserInfo();

    // info.setPasswd("12345");
    // info.setUserId("nahkim");
    // info.setUserName("sdfwdk");

    // info.print();

    // Product product = new Product();
    // product.setProductId("0011AA");
    // product.setProductName("TV");

    // product.print();

    // MySqlUserInfoDao mysqluser = new MySqlUserInfoDao();
    // mysqluser.insertUserInfo(info);
    // info.setPasswd("54321");
    // info.setUserId("jekim");
    // info.setUserName("kdwfds");
    // mysqluser.updateUserInfo(info);
    // mysqluser.deleteUserInfo(info);


    // MySqlProductDao mysqlproduct = new MySqlProductDao();
    // mysqlproduct.insertProduct(product);
    // product.setProductId("1111AA");
    // mysqlproduct.updateProduct(product);
    // mysqlproduct.deleteProduct(product);

    // OracleUserInfoDao orcleuser = new OracleUserInfoDao();
    // orcleuser.insertUserInfo(info);
    // info.setPasswd("54321");
    // info.setUserId("jekim");
    // info.setUserName("kdwfds");
    // orcleuser.updateUserInfo(info);
    // orcleuser.deleteUserInfo(info);


    // OracleProductDao orcleproduct = new OracleProductDao();
    // orcleproduct.insertProduct(product);
    // product.setProductId("1111AA");
    // orcleproduct.updateProduct(product);
    // orcleproduct.deleteProduct(product);

    String dbType = "MYSQL";
    UserInfo userInfo = new UserInfo();
    userInfo.setUserId("12345");
    userInfo.setPasswd("!@#$%");
    userInfo.setUserName("Tomas");
    Product product = new Product();
    product.setProductId("0011AA");
    product.setProductName("TV");
    DaoFactory daoFactory = null;
    UserInfoDao userInfoDao = null;
    ProductDao productDao = null;

    if(dbType.equals("ORACLE")){
      daoFactory = new OracleDaoFactory();
      }
      else if(dbType.endsWith("MYSQL")){
      daoFactory = new MySqlDaoFactory();
    }
      else{
      System.out.println("db support error");
      return;
      }
      userInfoDao = daoFactory.createUserInfoDao();
      productDao = daoFactory.createProductDao();
      System.out.println("==USERINFO TRANSACTION==");
      userInfoDao.insertUserInfo(userInfo);
      userInfoDao.updateUserInfo(userInfo);
      userInfoDao.deleteUserInfo(userInfo);
      System.out.println("==PRODUCT TRANSACTION==");
      productDao.insertProduct(product);
      productDao.updateProduct(product);
      productDao.deleteProduct(product);
  }
  
}
