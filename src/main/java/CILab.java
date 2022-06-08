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

        String regEx = "^[A-Z]+$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(myString);

        return matcher.groupCount() > 0 ? true : false;
    }
}

