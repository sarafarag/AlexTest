import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LabTest {

    private CILabInterface myString;
    @BeforeEach
    public void setup() {
        myString = new CILab();
    }

    @AfterEach
    public void teardown() {
        myString = null;
    }

    @Test
    public void testMixedCaps() {
        myString.setString("This String Has Captials");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testNoCaps() {
        myString.setString("this string has no captials");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void testAllCaps() {
        myString.setString("THIS STRING IS ONLY CAPITALS");
        assertTrue(myString.detectCapitalUse());
    }

}
