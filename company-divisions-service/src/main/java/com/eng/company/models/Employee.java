package com.eng.company.models;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private Long id;
    private String companyId;
    private String firstName;
    private String lastName;
    private String email;
    private Long divisionId;
}
