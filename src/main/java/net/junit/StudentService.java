package net.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    // Return an unmodifiable list to protect internal list from external changes
    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    // Add student to the list
    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }
}
