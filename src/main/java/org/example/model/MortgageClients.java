package org.example.model;


import jakarta.validation.constraints.NotNull;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "mortgage")
public class MortgageClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
//    @Column(name = "nameofbuyers")
    private String nameOfBuyers;

    @NotNull
//    @Column(name = "patronymicofbuyers")
    private String patronymicOfBuyers;

    @NotNull
    //  @Column(name = "surnameofbuyers")
    private String surnameOfBuyers;

    @NotNull
    //  @Column(name = "phonenumberofbuyers")
    private String phoneNumberOfBuyers;

    @NotNull
    //  @Column(name = "loanamount")
    private long loanAmount;

    @NotNull
    //   @Column(name = "loanterm")
    private int loanTerm;

    @NotNull
    //  @Column(name = "estateobject")
    private String estateObject;

    @NotNull
    //   @Column(name = "costobject")
    private long costObject;

    @NotNull
    //  @Column(name = "innofbuyers")
    private String innOfBuyers;

    @NotNull
    //  @Column(name = "nameofsellers")
    private String nameOfSellers;

    @NotNull
    //  @Column(name = "patronymicofsellers")
    private String patronymicOfSellers;

    @NotNull
    //   @Column(name = "surnameofsellers")
    private String surnameOfSellers;

    @NotNull
    //   @Column(name = "innind")
    private String innInd;

    @NotNull
    //   @Column(name = "nameorganization")
    private String nameOrganization;

    @NotNull
    //  @Column(name = "innorg")
    private String innOrg;

    @NotNull
    //  @Column(name = "ownrights")
    private String ownRights;
}

