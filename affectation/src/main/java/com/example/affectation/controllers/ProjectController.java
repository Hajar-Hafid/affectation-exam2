package com.example.affectation.controllers;

import com.example.affectation.model.Project;
import com.example.affectation.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectRepository prepo;
    @GetMapping
    public List<Project>getProjects(){
        return prepo.findAll();
    }


}
