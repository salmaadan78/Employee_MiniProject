import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class EmployeeTests {

    @Test
    @DisplayName("Given the method reads file lines")
    public void testReadFileLines() throws FileNotFoundException {
        String filename = "src/main/resources/employees01.csv";
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

    @Test
    @DisplayName("Entering a name validates with given regex constraints")
    public void testNameValidator(){
        String name = "Bob O'Marley The 2nd";
        Validator validator = new Validator();
        Assertions.assertTrue(validator.nameValidator(name));
    }

    @Test
    @DisplayName("Given a string date returns a LocalDate object")
    public void testStringToLocalDate(){
        String date = "06-06-2023";
        DataConversion dataConversion = new DataConversion();
        Assertions.assertEquals(LocalDate.of(2023, 06, 6), dataConversion.stringToLocalDate(date));
    }

    @Test
    @DisplayName("Given a string gender returns a char")
    public void testStringToChar(){
        String gender = "F";
        Assertions.assertEquals('F',DataConversion.stringToChar(gender));
    }

//    @Test
//    @DisplayName("Checking if employee object is converted to a JSON file")
//    public void testEmployeeObjectToJSON() throws JsonProcessingException {
//        Employee emp = new Employee("123","2000-07-19","Salma", "Adan", "F", "2023-04-17");
//        EmployeeConversion em = new EmployeeConversion();
//        em.employeeObjectToJSON(emp);
//        Assertions.assertEquals("",em.employeeObjectToJSON(emp));
//    }










}
