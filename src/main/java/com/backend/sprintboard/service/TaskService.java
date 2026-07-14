package com.backend.sprintboard.service;

import com.backend.sprintboard.TaskNotFoundException;
import com.backend.sprintboard.dto.CreateTaskRequest;
import com.backend.sprintboard.entity.Task;
import com.backend.sprintboard.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
//    List<Task> tasks = new ArrayList<>();
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(long id){
        return taskRepository.findById(id).orElseThrow(()-> new TaskNotFoundException("Task not found"));
    }

    public Task addTask(CreateTaskRequest request){
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setStatus(request.getStatus());

        return taskRepository.save(task);
    }

    public void printTasks(){
        for (Task task : getTasks()) {
            System.out.println(task);
        }
    }

    public void findTask(String title){
        for (Task task : tasks){
            if(task.getTitle().equals(title)) {
                System.out.println("Found: " + task.getTitle());
                return;
            }
        }
        System.out.println("Task not found");
    }

    public void deleteTask(long id){
       taskRepository.deleteById(id);

//       if(!removed){
//           throw new TaskNotFoundException("Task with id "+ id +" not found");
//       }
//        System.out.println("Delete operation completed");
    }

    public void updateTaskStatus(int id, String status){
        for(Task task:tasks){
            if(task.getId()==id){
                task.setStatus(status);
                return;
            }
        }

        throw new TaskNotFoundException("Task with id " + id + " not found");
    }
}
