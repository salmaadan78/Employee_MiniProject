import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        EmployeeCsvReader reader = new EmployeeCsvReader();
        System.out.println(reader.readFileLines("src/main/resources/Employees_short.csv"));

    }
}

