package com.loginov.testsber.controller;

import com.loginov.testsber.entities.User;
import com.loginov.testsber.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Inject
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public String findSingerById(@PathVariable UUID id) {
        return userService.findFirstName(id);
    }


    @GetMapping(value = "/findAll")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }
}
