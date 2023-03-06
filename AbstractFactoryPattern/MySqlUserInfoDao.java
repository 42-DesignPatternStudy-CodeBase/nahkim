package AbstractFactoryPattern;

public class MySqlUserInfoDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo info) {
    System.out.println(String.format("MYSQL : Insert to %s %s %s", info.getUserId(), info.getUserName(), info.getPasswd()));
  }

  @Override
  public void updateUserInfo(UserInfo info) {
    System.out.println(String.format("MYSQL : Update to %s %s %s", info.getUserId(), info.getUserName(), info.getPasswd()));
  }

  @Override
  public void deleteUserInfo(UserInfo info) {
    System.out.println(String.format("MYSQL : Delete to %s %s %s", info.getUserId(), info.getUserName(), info.getPasswd()));
  }
  
}
