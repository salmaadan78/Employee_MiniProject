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
        String[] arrayOfLines = line.split(",");
        Employee emp = new Employee(arrayOfLines[0],arrayOfLines[1],arrayOfLines[2],arrayOfLines[3],arrayOfLines[4],arrayOfLines[5]);
        return emp;

    }
    // reads
    public ArrayList<Employee> readEmployee(String filename){
        ArrayList<String> list = readFileLines(filename);
        for (var eachLine : list){
            createEmployee(eachLine);
        }

        return null;
    }


}
