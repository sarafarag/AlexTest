
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {

       for(int i = 0; i < myString.length(); i++){
           char letter = myString.charAt(i);
           if(Character.isUpperCase(letter)){
               return true;
           }
       }
       return false;
    }
}

