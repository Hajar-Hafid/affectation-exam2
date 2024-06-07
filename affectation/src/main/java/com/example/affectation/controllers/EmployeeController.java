package com.example.affectation.controllers;

import com.example.affectation.model.Employee;
import com.example.affectation.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository emprepo;
    @GetMapping({"", "/"})
    public String getEmploees(Model model){
         List<Employee> employees=emprepo.findAll();
         model.addAttribute("emloyees", employees);
         return "employees/index";
     }
}
