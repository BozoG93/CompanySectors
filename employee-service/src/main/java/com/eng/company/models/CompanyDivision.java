package com.eng.company.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompanyDivision {

    private Long id;
    private String divisionCode;
    private String divisionName;
    private String divisionDescription;
}
