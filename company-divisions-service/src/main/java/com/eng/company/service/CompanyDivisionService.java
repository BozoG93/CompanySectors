package com.eng.company.service;

import com.eng.company.entity.CompanyDivision;
import com.eng.company.repository.CompanyDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyDivisionService {

    @Autowired
    CompanyDivisionRepository companyDivisionRepository;

    public CompanyDivision saveDivision(CompanyDivision companyDivision) {
        return companyDivisionRepository.save(companyDivision);
    }

    public Optional<CompanyDivision> findDivisionById(Long divisionId) {
        return companyDivisionRepository.findById(divisionId);
    }
}
