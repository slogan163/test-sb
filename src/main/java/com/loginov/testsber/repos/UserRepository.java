package com.loginov.testsber.repos;

import com.loginov.testsber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u.firstName FROM User u WHERE u.id = :id")
    String findFirstNameById(@Param("id") UUID id);

}
