package com.eng.company.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DIVISION")
public class CompanyDivision {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (name= "CODE")
    private String divisionCode;
    @Column (name= "NAME")
    private String divisionName;
    @Column (name= "DESCRIPTION")
    private String divisionDescription;

}
