package demo_Aspire.steps.serenity;

import demo_Aspire.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginSteps extends  ScenarioSteps{

    LoginPage loginPage;

    @Step("Given user has start to Aspire application")
    public void  openHomepage(String _URL)  {
        getDriver().get(_URL);
        //Check Login page displays
        Assert.assertEquals(getDriver().findElements(By.xpath(LoginPage.lnkRegister)).size(),1);
    }

}
