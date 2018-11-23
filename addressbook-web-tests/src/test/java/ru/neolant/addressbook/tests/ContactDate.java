package ru.neolant.addressbook.tests;

public class ContactDate {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String home;
    private final String mobile;
    private final String email;

    public ContactDate(String firstname, String middlename, String lastname, String nickname, String home, String mobile, String email) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.home = home;
        this.mobile = mobile;
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

    public String getNickname() {
        return nickname;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
