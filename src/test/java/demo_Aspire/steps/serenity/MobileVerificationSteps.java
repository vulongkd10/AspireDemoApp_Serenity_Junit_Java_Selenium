package demo_Aspire.steps.serenity;

import demo_Aspire.pages.BusinessRolePage;
import demo_Aspire.pages.MobileVerificationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MobileVerificationSteps extends ScenarioSteps {


    @Step("Then user authenticate Mobile verification")
    public void  authenMobile(String _verificationCode) throws InterruptedException {
        getDriver().findElement(By.xpath(MobileVerificationPage.txtOTP)).sendKeys(_verificationCode);
        Thread.sleep(2000);
//        wait.waitForControl_Exist(MobileVerificationPage.lblMobileVerificationSuccess,30);
        Assert.assertEquals(getDriver().findElements(By.xpath(MobileVerificationPage.lblMobileVerificationSuccess)).size(),1);

        getDriver().findElement(By.xpath(MobileVerificationPage.btnContinue)).click();

        Assert.assertEquals(getDriver().findElements(By.xpath(BusinessRolePage.imgDirector)).size(),1);
    }
}
