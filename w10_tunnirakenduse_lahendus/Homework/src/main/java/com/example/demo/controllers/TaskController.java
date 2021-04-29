package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/index")
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String showSignUp(Task task) {
        return "add";
    }

    @PostMapping("/addTask")
    public String addTask(@Valid Task task, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add";
        }

        taskRepository.save(task);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable("id") long id, Model model) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No such task with id " + id));

        taskRepository.delete(task);

        return "redirect:/index";
    }
}