package AbstractFactoryPattern;

public class UserInfo {

  private String userId;
  private String password;
  private String userName;

  void setUserId(String userId) {
    this.userId = userId;
  }

  void setPasswd(String pw) {
    this.password = pw;
  }

  void setUserName(String username) {
    this.userName = username;
  }

  String getUserId() {
    return this.userId;
  }

  String getPasswd() {
    return this.password;
  }

  String getUserName() {
    return this.userName;
  }

  void print() {
    System.out.println(String.format("userId : %s", userId));
    System.out.println(String.format("password : %s", password));
    System.out.println(String.format("userName : %s", userName));
  }

}
