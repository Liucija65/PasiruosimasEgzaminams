import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BasePageTest {
    HomePage homePage = new HomePage(driver);
   // RegistrationPage registrationPage;
    @Test
   // @Order(1)
    void clickCreateAccountbutton(){
       HomePage homePage = new HomePage(driver);
       homePage = new HomePage(driver);
        homePage.clickButtonRegister();
        //RegistrationPage registrationPage = new RegistrationPage(driver);
        homePage.enterUsername("Testas23");
       homePage.enterEmail("testas23@gmail.com");
        homePage.enterPassword("Testas23.123");
        homePage.enterConfirmPassword("Testas23.123");
        homePage.clickButtonCreateAnAccount();
        homePage.waitForLoginPage();
        homePage.enterEmailLog("testas23@gmail.com");
        homePage.enterPasswordLog("Testas23.123");
        homePage.clickButtonLogin();


        //String actualTitle = registrationPage.getTitleRegistration();
       // String expectedTitle = "PlanPro";
       // Assertions.assertEquals(expectedTitle, actualTitle);


    }
}
