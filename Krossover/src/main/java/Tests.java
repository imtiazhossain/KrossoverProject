import org.junit.Test;

/**
 * Created by Imtiaz on 9/2/15.
 */
public class Tests extends PageObjects{

    @Test
    public void validateForms() throws InterruptedException {
        //Click on basketball link in landing page
        clickBasketballLink();

        //Fill out form
        yourFullNameInput("Test Tester");
        schoolOrTeamName("Test");
        city("Test");
        state("Test");
        teamGender("Male");
        email("test@example.com");
        phoneNumber("555-555-5555");
        bestDay("Friday");

        //click submit (commented out to prevent spam. Uncomment to submit form
//        requestDemoButton().click();

        Thread.sleep(10000);
    }
}
