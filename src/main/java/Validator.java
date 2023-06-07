<<<<<<< HEAD
=======
import java.time.LocalDate;
>>>>>>> b03a5b0be44716403de3390c2a8bdbfedac6c2a4
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean idValidator(String id){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher match = pattern.matcher(id);
        return match.find();
<<<<<<< HEAD

=======
>>>>>>> b03a5b0be44716403de3390c2a8bdbfedac6c2a4
    }

    public boolean dateValidator(String date){
        Pattern pattern = Pattern.compile("[0-9]{1,2}\\-[0-9]{1,2}\\-[0-9]{4}");
        Matcher match = pattern.matcher(date);
        return match.find();
    }
<<<<<<< HEAD
=======

>>>>>>> b03a5b0be44716403de3390c2a8bdbfedac6c2a4
    public boolean nameValidator(String name){
        Pattern pattern = Pattern.compile("[A-Z]+([ '-][a-zA-Z]+)*");
        Matcher match = pattern.matcher(name);
        return match.find();
    }

    public boolean genderValidator(String gender){
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher match = pattern.matcher(gender);
        return match.find();
    }
<<<<<<< HEAD
=======



>>>>>>> b03a5b0be44716403de3390c2a8bdbfedac6c2a4
}
