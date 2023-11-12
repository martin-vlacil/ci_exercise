package via.doc1.ex7.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void ctorTest() {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }

    @Test
    public void testGetters() {
        // Arrange
        String id = "1";
        String name = "Task 1";
        String description = "Description for Task 1";
        Task task = new Task(id, name, description);

        // Act & Assert
        assertEquals(id, task.getId());
        assertEquals(name, task.getName());
        assertEquals(description, task.getDescription());
    }

    @Test
    public void testSetters() {
        // Arrange
        Task task = new Task("1", "Task 1", "Description for Task 1");

        // Act
        String newId = "2";
        String newName = "Task 2";
        String newDescription = "Description for Task 2";

        task.setId(newId);
        task.setName(newName);
        task.setDescription(newDescription);

        // Assert
        assertEquals(newId, task.getId());
        assertEquals(newName, task.getName());
        assertEquals(newDescription, task.getDescription());
    }

    @Test
    public void testEqualsAndHashCode() {
        // Arrange
        Task task1 = new Task("1", "Task 1", "Description for Task 1");
        Task task2 = new Task("1", "Task 2", "Description for Task 2");
        Task task3 = new Task("3", "Task 3", "Description for Task 3");

        // Act & Assert
        assertEquals(task1, task2); // Should be equal based on ID
        assertNotEquals(task1, task3); // Should not be equal based on different IDs

        assertEquals(task1.hashCode(), task2.hashCode());
        assertNotEquals(task1.hashCode(), task3.hashCode());
    }

    @Test
    public void testEqualsMethodWithEqualTasks() {
        // Arrange
        Task task1 = new Task("1", "Task 1", "Description for Task 1");
        Task task2 = new Task("1", "Task 2", "Description for Task 2");

        // Act & Assert
        assertTrue(task1.equals(task2)); // Should be equal based on ID
        assertTrue(task2.equals(task1)); // Symmetric property
    }

    @Test
    public void testEqualsMethodWithDifferentIds() {
        // Arrange
        Task task1 = new Task("1", "Task 1", "Description for Task 1");
        Task task3 = new Task("3", "Task 3", "Description for Task 3");

        // Act & Assert
        assertFalse(task1.equals(task3)); // Should not be equal based on different IDs
        assertFalse(task3.equals(task1)); // Symmetric property
    }

    @Test
    public void testEqualsMethodWithNull() {
        // Arrange
        Task task1 = new Task("1", "Task 1", "Description for Task 1");

        // Act & Assert
        assertFalse(task1.equals(null)); // Should not be equal to null
    }

    @Test
    public void testEqualsMethodWithDifferentClass() {
        // Arrange
        Task task1 = new Task("1", "Task 1", "Description for Task 1");
        String differentClassObject = "not a Task object";

        // Act & Assert
        assertFalse(task1.equals(differentClassObject)); // Should not be equal to an object of a different class
    }

    @Test
    public void testEqualsMethodWithSameInstance() {
        // Arrange
        Task task1 = new Task("1", "Task 1", "Description for Task 1");

        // Act & Assert
        assertTrue(task1.equals(task1)); // Should be equal when compared to itself
    }
}
