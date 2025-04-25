package net.junit.assertions;

import net.junit.Student;
import net.junit.StudentService;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentTest() {
        StudentService studentService = new StudentService();

        // No students added yet, so the list should be empty
        List<Student> listOfStudents = studentService.getStudents();
        boolean actualResult = listOfStudents.isEmpty();

        // ===== ALL assertTrue VARIATIONS =====

        // 1. Basic assertTrue - no message
        assertTrue(actualResult);

        // 2. assertTrue with BooleanSupplier (lazy evaluation)
        // Useful when the condition is expensive to compute
        assertTrue(() -> actualResult);

        // 3. assertTrue with failure message as String
        // Message appears if assertion fails
        assertTrue(actualResult, "List of students should be empty");

        // 4. assertTrue with BooleanSupplier and String message
        // Lazy condition evaluation + static message
        assertTrue(() -> actualResult, "List of students should be empty");

        // 5. assertTrue with failure message as Supplier<String>
        // Message is only constructed if assertion fails (good for expensive messages)
        assertTrue(actualResult, () -> "List of students should be empty");

        // 6. assertTrue with BooleanSupplier and Supplier<String> message
        // Most efficient: lazy evaluation for both condition and message
        assertTrue(() -> actualResult, () -> "List of students should be empty");

        // ===== PRACTICAL USAGE EXAMPLES =====

        // Example: Testing after adding a student
        studentService.addStudent(new Student(1, "Alice"));
        boolean afterAddResult = studentService.getStudents().isEmpty();

        // With descriptive failure message
        assertFalse(afterAddResult, "List should not be empty after adding a student");

        // With dynamic message generation
        int actualSize = studentService.getStudents().size();
        assertTrue(actualSize > 0,
                () -> String.format("Expected at least 1 student but found %d", actualSize));
    }
}