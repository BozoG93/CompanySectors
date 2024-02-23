package com.eng.company.controller;

import com.eng.company.entity.Employees;
import com.eng.company.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employees saveEmployee(@RequestBody Employees employee){
        log.info("Inside save employee endpoint");
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/findAll")
    public List<Employees> findAll(){
        log.info("Inside findAll endpoint");
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public Optional<Employees> findOne(@PathVariable("employeeId") Long employeeId){
        return employeeService.findOneEmployee(employeeId);
    }
}
