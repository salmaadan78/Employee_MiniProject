import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, JsonProcessingException {

        EmployeeCsvReader reader = new EmployeeCsvReader();
        ArrayList<Employee> empList = reader.readEmployee("src/main/resources/Employees_short.csv");
        System.out.println(empList);
        EmployeeConversion empConversion = new EmployeeConversion();
            System.out.println(empConversion.employeeObjectToJSON(empList));

    }
}

