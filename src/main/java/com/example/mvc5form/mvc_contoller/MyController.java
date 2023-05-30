package com.example.mvc5form.mvc_contoller;

import com.example.mvc5form.mvcmodel.Trainee;
import com.example.mvc5form.mvcmodel.TraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @Autowired
    TraineeRepo traineeRepo;
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/addpage")
    public String addTrainee(){
        return "traineeadd";
    }
    @PostMapping("/add")
    public String addTrainee1(@ModelAttribute("trainee")Trainee trainee){
        traineeRepo.save(trainee);
        return "redirect:/";
    }
}
