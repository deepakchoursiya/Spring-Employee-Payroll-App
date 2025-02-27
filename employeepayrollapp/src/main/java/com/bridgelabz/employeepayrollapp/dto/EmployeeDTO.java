package com.bridgelabz.employeepayrollapp.dto;

import lombok.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Generates Getters, Setters, toString(), equals(), and hashCode()
@NoArgsConstructor  // Generates a No-Args Constructor
@AllArgsConstructor  // Generates an All-Args Constructor
public class EmployeeDTO {
    private String name;
    private double salary;
}
