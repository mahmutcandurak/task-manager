package com.taskmanager.service;


import com.taskmanager.exception.TaskNotFoundException;
import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * @author mahmutcandurak
 */

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    protected Task findTaskById (Long id) {
        return taskRepository.findById(id)
                .orElseThrow
                        (() -> new TaskNotFoundException("Task could not find by id: " + id.toString()));
    }



}
