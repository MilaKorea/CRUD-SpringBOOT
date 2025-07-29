package com.example.crudboot.service;

import com.example.crudboot.model.User;

public interface UserService {
    Object getAllUsers();

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    void updateUser(User user);
}
