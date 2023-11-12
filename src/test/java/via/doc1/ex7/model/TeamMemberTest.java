package via.doc1.ex7.model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;



public class TeamMemberTest {

    @Test
    public void testGetters() {
        // Arrange
        String id = "1";
        String name = "John Doe";
        String email = "john.doe@example.com";
        List<Task> tasks = Arrays.asList(new Task("1", "Task 1", "Description for Task 1"));

        TeamMember teamMember = new TeamMember(id, name, email, tasks);

        // Act & Assert
        assertEquals(id, teamMember.getId());
        assertEquals(name, teamMember.getName());
        assertEquals(email, teamMember.getEmail());
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void testSetters() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", null);

        // Act
        String newId = "2";
        String newName = "Jane Doe";
        String newEmail = "jane.doe@example.com";
        List<Task> newTasks = Arrays.asList(new Task("2", "Task 2", "Description for Task 2"));

        teamMember.setId(newId);
        teamMember.setName(newName);
        teamMember.setEmail(newEmail);
        teamMember.setTasks(newTasks);

        // Assert
        assertEquals(newId, teamMember.getId());
        assertEquals(newName, teamMember.getName());
        assertEquals(newEmail, teamMember.getEmail());
        assertEquals(newTasks, teamMember.getTasks());
    }

    @Test
    public void testToString() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", null);

        // Act & Assert
        assertEquals("TeamMember{id='1', name='John Doe', email='john.doe@example.com'}", teamMember.toString());
    }
}