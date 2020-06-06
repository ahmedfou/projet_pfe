package com.ance.pfe.service;

import com.ance.pfe.domain.User;

import java.util.List;

public interface IUserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
