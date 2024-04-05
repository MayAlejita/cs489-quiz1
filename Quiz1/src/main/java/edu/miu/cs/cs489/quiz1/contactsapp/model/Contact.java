package edu.miu.cs.cs489.quiz1.contactsapp.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private Company company;
    private Job job;
    private List<Phone> phoneNumber;
    private List<Email> emailAddress;

    public Contact(String firstName, String lastName, Company company, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.job = job;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void addPhoneNumber(Phone phone){
        if(phoneNumber == null){
            phoneNumber = new ArrayList<>();
        }
        phoneNumber.add(phone);
    }

    public void addEmailAddress(Email email){
        if(emailAddress == null){
            emailAddress = new ArrayList<>();
        }
        emailAddress.add(email);
    }

    public String toJson() {
        return """
                {\n\t"firstName":%s, \n\t"lastName":"%s", \n\t"company":%s, \n\t"job":%s, \n\t"phoneNumber":%s, \n\t"emailAddress":%s\n}""".formatted(firstName, lastName,
                company, job, phoneNumber, emailAddress);
    }
}
