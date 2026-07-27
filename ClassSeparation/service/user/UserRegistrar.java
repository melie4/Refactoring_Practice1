 // ユーザー登録
public class UserRegistrar{  
  public User register(UserRegistrationForm form) {
    User existing = userMapper.findByEmail(form.getEmail());
    if (existing != null) {
      throw new IllegalArgumentException("既に登録されています");
    }

    User user = new User();
    user.setName(form.getName());
    user.setEmail(form.getEmail());
    user.setPassword(passwordEncoder.encode(form.getPassword()));
    userMapper.insert(user);

    return userMapper.findById(user.getId());
  }
} 