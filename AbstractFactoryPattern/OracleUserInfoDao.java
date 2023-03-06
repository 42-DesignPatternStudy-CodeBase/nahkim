package AbstractFactoryPattern;

public class OracleUserInfoDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo info) {
    System.out.println(String.format("ORACLE : Insert to %s %s %s", info.getUserId(), info.getUserName(), info.getPasswd()));
  }

  @Override
  public void updateUserInfo(UserInfo info) {
    System.out.println(String.format("ORACLE : Update to %s %s %s", info.getUserId(), info.getUserName(), info.getPasswd()));
  }

  @Override
  public void deleteUserInfo(UserInfo info) {
    System.out.println(String.format("ORACLE : Delete to %s %s %s", info.getUserId(), info.getUserName(), info.getPasswd()));
  }
  
}
