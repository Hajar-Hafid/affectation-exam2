package com.example.affectation.model;

import jakarta.validation.constraints.NotEmpty;

public class EmployeeDto {
    @NotEmpty(message="The name is required")
    private String name;
    @NotEmpty(message="The email is required")
    private String email;

    private Project project;
}
