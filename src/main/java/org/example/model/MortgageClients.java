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

    @NotNull (message = "Поле обязательно для заполнения")
    private String nameOfBuyers;

    @NotNull (message = "Поле обязательно для заполнения")
    private String patronymicOfBuyers;

    @NotNull (message = "Поле обязательно для заполнения")
    private String surnameOfBuyers;

    @NotNull(message = "Поле обязательно для заполнения")
    private String phoneNumberOfBuyers;

    @NotNull(message = "Поле обязательно для заполнения")
    private long loanAmount;

    @NotNull(message = "Поле обязательно для заполнения")
    private int loanTerm;

    @NotNull(message = "Поле обязательно для заполнения")
    private String estateObject;

    @NotNull(message = "Поле обязательно для заполнения")
    private long costObject;

    @NotNull(message = "Поле обязательно для заполнения")
    @InnValidation
    private String innOfBuyers;

    @NotNull(message = "Поле обязательно для заполнения")
    private String nameOfSellers;

    @NotNull(message = "Поле обязательно для заполнения")
    private String patronymicOfSellers;

    @NotNull(message = "Поле обязательно для заполнения")
    private String surnameOfSellers;

    @NotNull(message = "Поле обязательно для заполнения")
    @InnValidation
    private String innInd;

    @NotNull(message = "Поле обязательно для заполнения")
    private String nameOrganization;

    @NotNull(message = "Поле обязательно для заполнения")
    @InnValidation
    private String innOrg;

    @NotNull(message = "Поле обязательно для заполнения")
    private String ownRights;
}

