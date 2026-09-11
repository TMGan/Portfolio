package dev.timgangadeen.portfolio.project;

import java.util.List;

public class Project {

    private final String name;
    private final String description;
    private final List<String> techStack;
    private final int year;
    private final String liveUrl;


    public Project(String name, String liveUrl, String description, List<String> techStack, int year) {
        this.description = description;
        this.liveUrl = liveUrl;
        this.name = name;
        this.techStack = techStack;
        this.year = year;
    }


    public String getDescription() {
        return description;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Project{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", techStack=" + techStack +
                ", year=" + year +
                ", liveUrl='" + liveUrl + '\'' +
                '}';
    }
}
