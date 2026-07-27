  // メール存在チェック
public class EmailChecker{  
  public boolean existsByEmail(String email) {
    return userMapper.findByEmail(email) != null;
  }
}
