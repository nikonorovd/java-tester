package ru.neolant.addressbook.tests;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String company;
    private final String address;
    private final String home;
    private final String modile;
    private final String email;

    public ContactData(String firstname, String middlename, String lastname, String company, String address, String home, String modile, String email) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.company = company;
        this.address = address;
        this.home = home;
        this.modile = modile;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getModile() {
        return modile;
    }

    public String getEmail() {
        return email;
    }
}
