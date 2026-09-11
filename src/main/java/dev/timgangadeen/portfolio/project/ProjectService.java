package dev.timgangadeen.portfolio.project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private final List<Project> projects = new ArrayList<>();

    public ProjectService() {
        projects.add(new Project("TopRipz", "https://topripz.com", "Rip-Tag Top loader for protecting and grading your collectable cards.", List.of("Next.js", "React"), 2026));
        projects.add(new Project("Parlay Of Princes", "https://parlayofprinces.vercel.app", "Fantasy Odds tracking site with real daily users", List.of("Next.js", "React"), 2026));
        projects.add(new Project("Retro Macros", "https://retromacros.up.railway.app", "Meal planner/tracking app with AI integration for custom macros to hit your fitness goals.", List.of("Java", "Spring Boot"), 2025));

    }

    public List<Project> findAll() {
        return List.copyOf(projects);
    }
}
