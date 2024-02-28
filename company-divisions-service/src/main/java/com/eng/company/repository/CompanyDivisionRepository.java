package com.eng.company.repository;

import com.eng.company.entity.CompanyDivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDivisionRepository extends JpaRepository<CompanyDivision, Long> {
}
