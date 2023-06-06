import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean idValidator(int id){
        Pattern pattern = Pattern.compile("[0-9]+");
        var input = Integer.toString(id);
        Matcher match = pattern.matcher(input);
        return match.find();
    }
}
