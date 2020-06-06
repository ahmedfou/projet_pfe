package com.ance.pfe.service;

import com.ance.pfe.domain.User;
import com.ance.pfe.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User oldUser = userRepository.findById(user.getId()).get();

        oldUser.setCin(user.getCin());
        oldUser.setFirstName(user.getFirstName());
        oldUser.setLastNom(user.getLastNom());
        oldUser.setEmail(user.getEmail());
        oldUser.setPassword(user.getPassword());

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
