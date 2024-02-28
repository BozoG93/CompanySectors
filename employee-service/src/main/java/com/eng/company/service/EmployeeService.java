package com.eng.company.service;

import com.eng.company.entity.Employees;
import com.eng.company.models.CompanyDivision;
import com.eng.company.models.EmployeeDivisionResponseTemplate;
import com.eng.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    @Autowired
    private RestTemplate restTemplate;

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

    public EmployeeDivisionResponseTemplate getEmployeeWithDivision(Long employeeId)  {
        EmployeeDivisionResponseTemplate employeeDivisionResponseTemplate = new EmployeeDivisionResponseTemplate();
        Optional<Employees> employeebyId = employeeRepository.findById(employeeId);

        CompanyDivision companyDivision = restTemplate.getForObject("http://division-service/divisions/"+employeebyId.get().getDivisionId(), CompanyDivision.class);

        employeeDivisionResponseTemplate.setEmployee(employeebyId.get());
        employeeDivisionResponseTemplate.setCompanyDivision(companyDivision);

        return employeeDivisionResponseTemplate;

    }
}
