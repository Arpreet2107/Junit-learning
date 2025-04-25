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

        // Assert that the list is indeed empty
        assertTrue(actualResult);

        //assertTrue (() -> actualResult);
        //assertTrue(actualResult, "List of students is empty.");
        //assertTrue (() -> actualResult,"List of students is empty.");
        //assertTrue(actualResult,()-> "List of students is empty");
        //assertTrue(() -> actualResult, () -> "List of students is empty!");
    }
}
