package demo_Aspire.steps.serenity;

import demo_Aspire.Commons.Commons;
import demo_Aspire.pages.BusinessDetailsPage;
import demo_Aspire.pages.MobileVerificationPage;
import demo_Aspire.pages.PersonalDetailsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PersonalDetailSteps extends ScenarioSteps {
//    Wait wait;
    @Step("Then User enter Personal detail information")
    public void  enterPersonalDetail(String _birthday, String _nationality, String _gender) throws InterruptedException {
        getDriver().findElement(By.xpath(PersonalDetailsPage.txtBirthday)).click();
        Thread.sleep(200);

        Commons.selectDate(_birthday);
//        getDriver().findElement(By.xpath(PersonalDetailsPage.btnYear)).click();
//
//        getDriver().findElement(By.xpath(PersonalDetailsPage.btnPrevYears)).click();
//        getDriver().findElement(By.xpath(PersonalDetailsPage.btnYearSelect)).click();
//        getDriver().findElement(By.xpath(PersonalDetailsPage.btnDay)).click();

        Thread.sleep(1000);

//        wait.waitForControl_Exist(PersonalDetailsPage.txtNation,30);

        getDriver().findElement(By.xpath(PersonalDetailsPage.txtNation)).sendKeys(_nationality);
        Commons.selectItemCombobox(_nationality);

        Thread.sleep(2000);
//        wait.waitForControl_Exist(PersonalDetailsPage.txtGender,30);
        getDriver().findElement(By.xpath(PersonalDetailsPage.txtGender)).sendKeys(_gender);
        Commons.selectItemCombobox(_gender);

        getDriver().findElement(By.xpath(PersonalDetailsPage.btnSubmit)).click();

        Thread.sleep(2000);
//        wait.waitForControl_Exist(MobileVerificationPage.txtOTP,30);
        Assert.assertEquals(getDriver().findElements(By.xpath(MobileVerificationPage.txtOTP)).size(),1);

        getDriver().findElement(By.xpath(MobileVerificationPage.txtOTP)).sendKeys("1234");
        Thread.sleep(2000);
//        wait.waitForControl_Exist(BusinessDetailsPage.txtBusinessName,30);
        Assert.assertEquals(getDriver().findElements(By.xpath(BusinessDetailsPage.txtBusinessName)).size(),1);

    }
}
