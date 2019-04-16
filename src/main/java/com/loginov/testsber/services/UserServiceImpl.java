package com.loginov.testsber.services;

import com.loginov.testsber.entities.User;
import com.loginov.testsber.repos.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Inject
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public String findFirstName(UUID id) {
        return userRepository.findFirstNameById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
