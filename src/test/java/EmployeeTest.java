import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.FileNotFoundException;

public class EmployeeTest {

    @Test
    @DisplayName("Test readFileLines")
    public void TestReadFileLines() throws FileNotFoundException {
        String fileName = "src/main/resources/Employees_short.csv";
        EmployeeCsvReader reader = new EmployeeCsvReader();
        Assertions.assertEquals(10, reader.readFileLines(fileName).size());
    }

    @Test
    @DisplayName("Test readFileLines for exception")
    public void TestReadFileLinesException(){
        String fileName = "src/main/resources/Employees_short.csv";
        EmployeeCsvReader reader = new EmployeeCsvReader();
        var e = Assertions.assertThrows(FileNotFoundException.class, ()-> reader.readFileLines(fileName));
        Assertions.assertEquals("File is not found", e.getMessage());
    }


    @Test
    @DisplayName("Test readFileLines for exception")
    public void TestCreateEmployee(){
        Employee emp = new Employee("123","07-11-2000","Tessa","George","F","16-06-2023");
        String line ="123,07-11-2000,Tessa,George,F,16-06-2023";
        EmployeeCsvReader reader = new EmployeeCsvReader();
        Assertions.assertEquals(emp.toString(),reader.createEmployee(line).toString());

    }
}
