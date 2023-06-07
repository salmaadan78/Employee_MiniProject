import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class EmployeeCsvReader {
private static Logger logger = LogManager.getLogger("src/main/resources/Employees_short.csv");
    // returns an array list of strings
    public ArrayList<String> readFileLines(String filename) throws FileNotFoundException {
        String line;
        ArrayList<String> allEmployeeLines = new ArrayList<>();
        if (filename.isEmpty()){
            throw new FileNotFoundException("File is not found");
        }
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
            while ((line = br.readLine()) != null) {
                allEmployeeLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allEmployeeLines;
    }


    // returns an employee object
    public Employee createEmployee(String line) {
        String[] arrayOfLines = line.split(",");

//        if ((validateEmployee(arrayOfLines)) {
            Employee emp = new Employee(arrayOfLines[0], arrayOfLines[1], arrayOfLines[2], arrayOfLines[3], arrayOfLines[4], arrayOfLines[5]);
            return emp;
        }


//            try {
//                throw new Exception("Could not process employee");
//            } catch (Exception e) {
//                logger.warn("Could not process employee");
//                logger.catching(e);
//                throw new RuntimeException(e);
//            }





    public void validateEmployee(String [] arrayOfLines){
        Validator validator = new Validator();
        if(
        validator.idValidator(arrayOfLines[0]) |
        validator.dateValidator(arrayOfLines[1]) |
        validator.nameValidator(arrayOfLines[2]) |
        validator.nameValidator(arrayOfLines[3]) |
        validator.genderValidator(arrayOfLines[4]) |
        validator.dateValidator(arrayOfLines[5]) == false){
                    try {
                        throw new Exception("Could not process employee");
                    } catch (Exception e) {
                        logger.warn("Could not process employee");
                        logger.catching(e);
                        throw new RuntimeException(e);
                    }
                }
            }

    public ArrayList<Employee> readEmployee(String filename) throws FileNotFoundException {
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        ArrayList<String> list = readFileLines(filename);
        for (var eachLine : list){
            listOfEmployees.add(createEmployee(eachLine));
        }
        return listOfEmployees;
    }


}
