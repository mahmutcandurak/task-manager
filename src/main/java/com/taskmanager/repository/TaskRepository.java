package com.taskmanager.repository;

import com.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mahmutcandurak
 */

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
