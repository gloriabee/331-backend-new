package se331.lab_new.security.user;

public interface UserDao {
    User findByUsername(String username);

    User save(User user);
}