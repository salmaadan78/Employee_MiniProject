import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class EmployeeTests {

    @Test
    @DisplayName("Given the method reads file lines")
    public void testReadFileLines() throws FileNotFoundException {
        String filename = "src/main/resources/Employees_short.csv";
        EmployeeCsvReader reader = new EmployeeCsvReader();
        Assertions.assertEquals(10,reader.readFileLines(filename).size());
    }

    @Test
    @DisplayName("Given a file name is wrong, an exception is thrown")
    public void testReadFileLinesReturnsException(){
        String filename = "";
        EmployeeCsvReader reader = new EmployeeCsvReader();
        var e = Assertions.assertThrows(FileNotFoundException.class, () -> reader.readFileLines(filename));
        Assertions.assertEquals( "File is not found", e.getMessage());
    }

    @Test
    @DisplayName("Given create employee method returns employee object")
    public void testCreateEmployee(){
        String line = "123,2000-07-19,Salma,Adan,F,2023-04-17";
        EmployeeCsvReader reader = new EmployeeCsvReader();
        Employee emp = new Employee("123","2000-07-19","Salma", "Adan", "F", "2023-04-17");
        Assertions.assertEquals(emp.toString(), reader.createEmployee(line).toString());
    }




}
