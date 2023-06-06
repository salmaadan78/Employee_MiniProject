import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataConversion {

    public static int stringToInt(String id){
        return Integer.parseInt(id);
    }

    public static LocalDate stringToLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }

    public static char stringToChar(String gender){
       return gender.charAt(0);
    }



}
