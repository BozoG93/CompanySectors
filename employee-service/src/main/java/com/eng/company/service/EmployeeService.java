package com.eng.company.service;

import com.eng.company.entity.Employees;
import com.eng.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(@Autowired EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employees saveEmployee(Employees employee) {
        return employeeRepository.save(employee);
    }

    public List<Employees> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employees> findOneEmployee(Long id){
        return employeeRepository.findById(id);
    }
}
