package edu.miu.cs.cs489.quiz1.contactsapp;

import edu.miu.cs.cs489.quiz1.contactsapp.model.*;

public class ContactApplication {
    public static void main(String[] args) {

        Company company = new Company("TCS", "IT company");
        Job job = new Job("Architect","Design requirements");
        Contact contact = new Contact("Ada","Smith",company, job);
        Email email  = new Email("mayra@miu.edu",Location.Work);
        contact.addEmailAddress(email);
        contact.addPhoneNumber(new Phone("641-456-879", Location.Home));
        contact.addPhoneNumber(new Phone("734-456-879", Location.Work));

        listContactJson(contact);
    }

    private static void listContactJson(Contact contact) {
        System.out.println("Printed as JSON");
        System.out.println("[");
        System.out.println(contact.toJson());
        System.out.println("]");
    }
}
