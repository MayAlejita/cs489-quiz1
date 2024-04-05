package edu.miu.cs.cs489.quiz1.contactsapp.model;

public class Job {
    private String title;
    private String description;

    public Job(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                {\n\t\t"title":"%s", \n\t\t"description":"%s"\n\t}""".formatted(title, description);
    }
}
