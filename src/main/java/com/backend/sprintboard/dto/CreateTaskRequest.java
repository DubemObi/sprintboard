package com.backend.sprintboard.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateTaskRequest {
    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Status is required")
    private String status;

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
