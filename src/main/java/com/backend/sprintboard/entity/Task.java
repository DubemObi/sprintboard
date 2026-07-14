package com.backend.sprintboard.entity;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String status;

//    public Task(long id, String title, String status){
//        if (title == null || title.trim().isEmpty()){
//            throw new IllegalArgumentException("Title cannot be empty");
//        }
//
//        this.id = id;
//        this.title = title;
//        this.status = status;
//    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Title: " + title + ", Status: " + status;
    }

}
