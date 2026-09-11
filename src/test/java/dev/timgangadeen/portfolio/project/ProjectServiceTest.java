package dev.timgangadeen.portfolio.project;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


 class ProjectServiceTest {

@Test
    void findAll_returns_three_projects() {
    //Arrange
    ProjectService service = new ProjectService();

    //Act
    List<Project> result = service.findAll();

    //Assert
    assertEquals(3, result.size());
}

}

