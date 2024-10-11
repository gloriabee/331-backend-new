package se331.lab_new.rest.security.user;

public interface UserDao {
    User findByUsername(String username);

    User save(User user);
}