import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeeCsvReader {

    // returns an array list of strings
    public ArrayList<String> readFileLines(String filename){
        String line;
        ArrayList<String> allEmployeeLines = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
            while ((line = br.readLine()) != null) {
                allEmployeeLines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return allEmployeeLines;
    }

    // returns an employee object
    public Employee createEmployee(String line){
        return null;
    }
    // reads
    public ArrayList<Employee> readEmployee(String filename){
        readFileLines(null);
        createEmployee(null);
        return null;
    }


}
