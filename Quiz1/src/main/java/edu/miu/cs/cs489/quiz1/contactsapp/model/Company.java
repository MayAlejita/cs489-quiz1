package edu.miu.cs.cs489.quiz1.contactsapp.model;

public class Company {
    private String name;
    private String description;

    public Company(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return """
                {\n\t\t"name":"%s", \n\t\t"description":"%s"\n\t}""".formatted(name, description);
    }
}
