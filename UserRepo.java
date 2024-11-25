package com.urspayce.repository;

import java.util.Optional;

import com.urspayce.entities.user;


public interface UserRepo extends JpaRepository<user, Long> {
    Optional<user> findByEmail(String email);

    user save(user user);
}





