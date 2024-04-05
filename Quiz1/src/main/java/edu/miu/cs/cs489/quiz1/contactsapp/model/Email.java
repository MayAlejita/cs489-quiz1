package edu.miu.cs.cs489.quiz1.contactsapp.model;

public class Email {
    private String emailAddress;
    private Location location;

    public Email(String emailAddress, Location location) {
        this.emailAddress = emailAddress;
        this.location = location;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return """
                {\n\t\t"emailAddress":"%s", \n\t\t"location":"%s"\n\t}""".formatted(emailAddress, location);
    }
}
