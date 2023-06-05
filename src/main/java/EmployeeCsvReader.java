import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCsvReader {


    //returns an arraylist of strings, one for each line
    public ArrayList<String> readFileLines(String fileName) throws FileNotFoundException {
        String line;
        ArrayList<String> allEmployeeLines = new ArrayList<>();

        if(fileName.isEmpty()){
            throw new FileNotFoundException("File is not found");
        }
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            while ((line = br.readLine()) != null) {
                allEmployeeLines.add(line);
            }
        } catch (IOException e) {

            e.printStackTrace();

        }
        return allEmployeeLines;
    }

    public Employee createEmployee(String line) {
        String[] arrayOfLines = line.split(",");
        Employee emp = new Employee(arrayOfLines[0], arrayOfLines[1], arrayOfLines[2], arrayOfLines[3], arrayOfLines[4], arrayOfLines[5]);
        return emp;
    }

    //
    public ArrayList<Employee> readEmployees(String fileName) throws FileNotFoundException {
        ArrayList<Employee> listOfEmployee = new ArrayList<>();
        ArrayList<String> list = readFileLines(fileName);
        for(var eachLine: list){
            //System.out.println(createEmployee(eachLine));
            listOfEmployee.add(createEmployee(eachLine));
        }
        //readFileLines(null);
        //createEmployee(null);

        return listOfEmployee;
    }
}


