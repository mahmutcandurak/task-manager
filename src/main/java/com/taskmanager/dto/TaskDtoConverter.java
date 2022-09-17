package com.taskmanager.dto;

import com.taskmanager.model.Task;
import org.springframework.stereotype.Component;

/**
 * @author mahmutcandurak
 */

@Component
public class TaskDtoConverter {

    public TaskDto convert (Task from) {
        return new TaskDto(from.getId(),
                from.getName(),
                from.getDeadline(),
                from.getDescription(),
                from.getStatus());
    }

}
