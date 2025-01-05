package com.codewithNandini.fullstackbackend.repository;

import com.codewithNandini.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
