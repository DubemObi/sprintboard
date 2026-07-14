package com.backend.sprintboard.repository;

import com.backend.sprintboard.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {

}