package com.backend.sprintboard.controller;

import com.backend.sprintboard.dto.CreateTaskRequest;
import com.backend.sprintboard.entity.Task;
import com.backend.sprintboard.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController (TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id){
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Task addTask(@Valid @RequestBody CreateTaskRequest request){
        return taskService.addTask(request);
    }
}
