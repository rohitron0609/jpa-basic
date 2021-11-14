package com.dastan.jpabasic.service;

import com.dastan.jpabasic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
