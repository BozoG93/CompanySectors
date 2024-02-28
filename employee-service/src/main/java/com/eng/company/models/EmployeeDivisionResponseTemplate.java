package com.eng.company.models;

import com.eng.company.entity.Employees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDivisionResponseTemplate {

    private Employees employee;
    private CompanyDivision companyDivision;
}
