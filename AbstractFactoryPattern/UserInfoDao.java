package AbstractFactoryPattern;

public interface UserInfoDao {

  void insertUserInfo(UserInfo info);
  void updateUserInfo(UserInfo info);
  void deleteUserInfo(UserInfo info);
}
