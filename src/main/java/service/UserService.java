package service;

import entity.User;

public interface UserService {
    void registerUser(User user);

    User getUserById(Long userId);
    void updateUser(User user);
    void deleteUser(Long userId);
    User login(String email, String password);
}