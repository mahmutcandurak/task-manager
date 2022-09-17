package com.taskmanager.dto;

import java.util.Date;

/**
 * @author mahmutcandurak
 */

public class TaskDto {

    private Long id;
    private String name;
    private Date deadline;
    private String description;
    private String status;

    public TaskDto() {
    }

    public TaskDto(Long id, String name, Date deadline, String description, String status) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.description = description;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
