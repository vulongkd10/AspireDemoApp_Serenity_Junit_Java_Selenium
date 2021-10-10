package demo_Aspire.steps.serenity;

import demo_Aspire.Commons.Commons;
import demo_Aspire.pages.LoginPage;
import demo_Aspire.pages.MobileVerificationPage;
import demo_Aspire.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;


public class RegisterSteps extends ScenarioSteps {

//    Wait wait;
    @Step("When user registers")
    public void  registerAccount(String _fullName, String _preferredName, String _email, int _mobile, String _knowAboutUs) throws InterruptedException {
        getDriver().findElement(By.xpath(LoginPage.lnkRegister)).click();

        getDriver().findElement(By.xpath(RegisterPage.txtFullname)).sendKeys(_fullName);
        getDriver().findElement(By.xpath(RegisterPage.txtPreferredname)).sendKeys(_preferredName);
        getDriver().findElement(By.xpath(RegisterPage.txtEmail)).sendKeys(_email);
        getDriver().findElement(By.xpath(RegisterPage.txtPhone)).sendKeys(String.valueOf(_mobile));
        getDriver().findElement(By.xpath(RegisterPage.txtKnowAboutUs)).click();
        Commons.selectItemCombobox(_knowAboutUs);
        getDriver().findElement(By.xpath(RegisterPage.chkTermCondition)).click();
        getDriver().findElement(By.xpath(RegisterPage.btnContinue)).click();

        Thread.sleep(2000);
//        wait.waitForControl_Exist(MobileVerificationPage.txtOTP,30);

        Assert.assertEquals(getDriver().findElements(By.xpath(MobileVerificationPage.txtOTP)).size(),1);
    }
}
