package org.example.model;


import javax.validation.constraints.NotNull;
import lombok.*;
import org.example.validation.InnValidation;

import javax.persistence.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MortgageClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String nameOfBuyers;

    @NotNull
    private String patronymicOfBuyers;

    @NotNull
    private String surnameOfBuyers;

    @NotNull
    private String phoneNumberOfBuyers;

    @NotNull
    private long loanAmount;

    @NotNull
    private int loanTerm;

    @NotNull
    private String estateObject;

    @NotNull
    private long costObject;

    @NotNull
    private String innOfBuyers;

    @NotNull
    private String nameOfSellers;

    @NotNull
    private String patronymicOfSellers;

    @NotNull
    private String surnameOfSellers;

    @NotNull
    @InnValidation
    private String innInd;

    @NotNull
    private String nameOrganization;

    @NotNull
    @InnValidation
    private String innOrg;

    @NotNull
    private String ownRights;
}

