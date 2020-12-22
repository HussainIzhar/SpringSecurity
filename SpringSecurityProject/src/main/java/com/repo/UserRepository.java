package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
