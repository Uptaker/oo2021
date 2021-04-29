package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Must enter a task")
    @Size(min = 10, max = 255, message = "Task must be between 10 and 255 characters")
    private String todo;

    @NotBlank(message = "Must enter a description")
    @Size(min = 5, max = 255, message = "Description must be between 5 and 255 characters")
    private String desc;

    public Task() {
    }

    public Task(String todo, String desc) {
        this.todo = todo;
        this.desc = desc;
    }

    public String getTodo() {
        return this.todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", todo=" + todo + ", desc=" + desc + '}';
    }

}
