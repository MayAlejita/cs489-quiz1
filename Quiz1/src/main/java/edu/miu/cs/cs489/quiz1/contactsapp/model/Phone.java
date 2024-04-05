package edu.miu.cs.cs489.quiz1.contactsapp.model;

public class Phone {
    private String phoneNumber;
    private Location location;

    public Phone(String phoneNumber, Location location) {
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                {\n\t\t"phoneNumber":"%s", \n\t\t"location":"%s"\n\t}""".formatted(phoneNumber, location);
    }
}
