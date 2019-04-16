package com.loginov.testsber.services;

import com.loginov.testsber.entities.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    String findFirstName(UUID id);

    List<User> findAll();
}
