package demo_Aspire.steps;

import demo_Aspire.Commons.LoadConfigFile;
import demo_Aspire.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.Random;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@RunWith(SerenityRunner.class)
public class AspireFlowScenarioSteps {

    Properties properties;
    String propertyFilePath= ".\\src\\test\\Resources\\configs\\Config.properties";

    @Managed(driver = "chrome")
    WebDriver driver;

    @Managed(uniqueSession=true)

    @Steps
    LoginSteps loginSteps;
    @Steps
    RegisterSteps registerSteps;
    @Steps
    MobileVerificationSteps mobileVerificationSteps;
    @Steps
    BusinessRoleSteps businessRoleSteps;
    @Steps
    PersonalDetailSteps personalDetailSteps;
    @Steps
    BusinessDetailsSteps businessDetailsSteps;

    String email,UEN;
    int mobile;
    @Before
    public void init()
    {

        //Generate Data
        Random rnd = new Random();
        mobile = rnd.nextInt(999999999);
        email = "longvu" + mobile + "@longtest.com";
        int UEN_number = rnd.nextInt(999999999);
        String.format("%08d", UEN);
        UEN = UEN_number + "Y";

        //Load config
        properties = LoadConfigFile.loadPropertiesFile(propertyFilePath);

//        user1.setUsername(properties.getProperty("ID"));
//        user1.setPassword(properties.getProperty("pass"));

        System.setProperty(properties.getProperty("ChromeWebDriver"), properties.getProperty("WebDriver_Resource"));
//        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\Resources\\drivers\\chromedriver.exe");
        getDriver().manage().window().maximize();

        loginSteps.openHomepage( properties.getProperty("SiteURL"));

    }
    @Test
//    @Given("Given the user has email address and is on the example application page")
    public void demoFlowAspire() throws InterruptedException {


        //Register
        registerSteps.registerAccount(properties.getProperty("Fullname"),properties.getProperty("PreferName"), email, mobile,properties.getProperty("KnowAboutUs"));

        //Mobile verification
        mobileVerificationSteps.authenMobile(properties.getProperty("AuthenCode"));

        businessRoleSteps.enterBusinessRole(properties.getProperty("Role"), properties.getProperty("Country"), properties.getProperty("Solution"));

        personalDetailSteps.enterPersonalDetail(properties.getProperty("Birthday"),properties.getProperty("Nationality"),properties.getProperty("Gender"));

        businessDetailsSteps.enterBusinessDetails(properties.getProperty("BusinessName"),properties.getProperty("BusinessCategory"),properties.getProperty("EntityType"),UEN,properties.getProperty("Industry"),properties.getProperty("SubIndustry"),properties.getProperty("BusinessActivity"), properties.getProperty("ProductExample"),properties.getProperty("BusinessWebsite"),properties.getProperty("CompanySize"),properties.getProperty("CompanyRevenue"),properties.getProperty("CompanyPayMonthly"), properties.getProperty("BusinessFund"), properties.getProperty("AccountUseFor"));


    }


}
