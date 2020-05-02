package model;

import service.EmailService;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String alternateEmailAddress;
    private Integer mailBoxCapacity;
    private String department;

    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return EmailService.GenerateEmailAddres(this);
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }

    public void setAlternateEmailAddress(String alternateEmailAddress) {
        this.alternateEmailAddress = alternateEmailAddress;
    }

    public Integer getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(Integer mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return getEmail();
    }
}
