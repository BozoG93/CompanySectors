package com.eng.company.controller;

import com.eng.company.service.CompanyDivisionService;
import com.eng.company.entity.CompanyDivision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/divisions")
public class CompanyDivisionsController {

    @Autowired
    CompanyDivisionService companyDivisionService;

    @PostMapping("/save")
    public CompanyDivision saveDivision(@RequestBody CompanyDivision division){
        return companyDivisionService.saveDivision(division);
    }

    @GetMapping("/{divisionId}")
    public Optional<CompanyDivision> findDivisionById(@PathVariable("divisionId") Long divisionId){
        return companyDivisionService.findDivisionById(divisionId);
    }

}
