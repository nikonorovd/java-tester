package modelcontacts;

public class AddNewData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;

    public AddNewData(String firstname, String middlename, String lastname, String nickname, String company, String address, String home, String mobile, String work) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
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

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }
}
