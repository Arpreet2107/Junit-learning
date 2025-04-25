package net.junit.assertions;

import net.junit.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeAttributesWithAssertNotEquals() {
        Employee emp1 = new Employee(101, "Arjun", 50000.00);
        Employee emp2 = new Employee(102, "Meera", 60000.00);

        // ✅ assertNotEquals for integers
        // Check that employee IDs are not equal
        assertNotEquals(emp1.getId(), emp2.getId(), "Employee IDs should not be the same");

        // ✅ assertNotEquals for Strings
        // Ensure names are not equal
        assertNotEquals(emp1.getName(), emp2.getName(), "Employee names should not be the same");

        // ✅ assertNotEquals for doubles
        // Ensure salaries are different
        assertNotEquals(emp1.getSalary(), emp2.getSalary(), "Salaries should not be the same");

        // ✅ assertNotEquals when comparing same value and expecting test to fail
        emp2.setSalary(50000.00);
        // Now both salaries are same, so this will fail if uncommented
        // assertNotEquals(emp1.getSalary(), emp2.getSalary()); // ❌ Fails

        // ✅ assertNotEquals with custom message
        // Creating another employee with a unique name
        Employee emp3 = new Employee(103, "Sameer", 45000.00);
        assertNotEquals("Arjun", emp3.getName(), "Names must be different");
    }
}
