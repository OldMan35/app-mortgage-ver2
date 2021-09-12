package org.example.controller.dto;

import lombok.*;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MortgageClientsDTO {

    @NotNull
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
    private String innInd;

    @NotNull
    private String nameOrganization;

    @NotNull
    private String innOrg;

    @NotNull
    private String ownRights;

}
