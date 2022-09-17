package com.taskmanager.repository;

import com.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mahmutcandurak
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
