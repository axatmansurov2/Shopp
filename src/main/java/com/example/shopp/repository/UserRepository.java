package com.example.shopp.repository;

import com.example.shopp.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User,UUID> {

    User getUserByEmail(String email);
}
