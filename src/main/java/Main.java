import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        EmployeeCsvReader reader = new EmployeeCsvReader();
         var result = reader.readFileLines("src/main/resources/Employees_short.csv");
          System.out.println(result);

    }
}
