create table mortgage(
    id integer primary key auto_increment,
    nameOfBuyers varchar (255),
    patronymicOfBuyers varchar (255),
    surnameOfBuyers varchar (255),
    phoneNumberOfBuyers varchar (255),
    loanAmount long,
    loanTerm integer,
    estateObject varchar (255),
    costObject long,
    innOfBuyers varchar (255),
    nameOfSellers varchar (255),
    patronymicOfSellers varchar (255),
    surnameOfSellers varchar (255),
    innInd varchar (255),
    nameOrganization  varchar (255),
    innOrg varchar (255),
    ownRights varchar (255)
);