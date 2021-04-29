package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid; // imported dependency

import com.example.demo.Task;
import com.example.demo.repositories.TaskRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private final TaskRepo repo;

    @Autowired
    public HomeController(TaskRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("randMsg", "RANDOM AAAA LOOK AT ME EKSDEEE");
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/addTask")
    public String addTask(Task task) {
        return "addTask";
    }

    @RequestMapping("/addedTask")
    public String addedTask(@Valid Task task, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("result", "Oopsie! We made a fuckie-wuckie!");
            return "addTask";
        } else if (task.getDescription().length() < 3) {
            model.addAttribute("result", "Task description too short!");
            return "addTask";
        }
        model.addAttribute("result", "Task successfully added!");
        repo.save(task);
        return "addTask";
    }
}
