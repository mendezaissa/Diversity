package com.example.diversity.controllers;

import com.example.diversity.models.*;
import com.example.diversity.services.DiversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WebControllers {

    @Autowired
    DiversityService service;

    @GetMapping("/governors")
    public List<Governor> getGovernors(){
        return service.getAllGovernors();
    }

    @GetMapping("/HORs")
    public List<HOR> getHORs(){
        return service.getAllHORs();
    }

    @GetMapping("/mayors")
    public List<Mayor> getMayors(){
        return service.getAllMayors();
    }

    @GetMapping("/persons")
    public List<Person> getPersons(){
        return service.getAllPersons();
    }

    @GetMapping("/senators")
    public List<Senator> getSenators(){
        return service.getAllSenators();
    }


}
