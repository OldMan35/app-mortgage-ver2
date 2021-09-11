package org.example.model;

import lombok.*;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class MortgageClients {

//   @Id
    private int id;

    private String nameOfBuyers;

    private String patronymicOfBuyers;

    private String surnameOfBuyers;

    private String phoneNumberOfBuyers;

    private long loanAmount;

    private int loanTerm;

    private String estateObject;

    private long costObject;

    private String innOfBuyers;

    private String nameOfSellers;

    private String patronymicOfSellers;

    private String surnameOfSellers;

    private String innInd;

    private String nameOrganization;

    private String innOrg;

    private String ownRights;
}

