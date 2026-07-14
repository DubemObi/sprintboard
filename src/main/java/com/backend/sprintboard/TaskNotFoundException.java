package com.backend.sprintboard;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(String message){
        super(message);
    }
}
