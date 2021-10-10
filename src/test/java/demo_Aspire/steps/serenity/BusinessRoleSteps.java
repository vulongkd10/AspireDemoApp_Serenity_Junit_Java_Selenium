package demo_Aspire.steps.serenity;

import demo_Aspire.Commons.Commons;
import demo_Aspire.pages.BusinessRolePage;
import demo_Aspire.pages.PersonalDetailsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;


public class BusinessRoleSteps extends ScenarioSteps {

    @Step("And user enters Business Role")
    public void  enterBusinessRole(String _role,String _country, String _solution) throws InterruptedException {
        getDriver().findElement(By.xpath("//img[contains(@src,'" + _role + "')]")).click();
        Assert.assertEquals(getDriver().findElements(By.xpath(BusinessRolePage.cboCountry)).size(),1);

//        Assert.assertEquals(_country,getDriver().findElement(By.xpath(BusinessRolePage.cboCountry)).getText());

        getDriver().findElement(By.xpath(BusinessRolePage.cboSolution)).click();
        Commons.selectItemCombobox(_solution);
        getDriver().findElement(By.xpath(BusinessRolePage.imgLogo)).click();

        getDriver().findElement(By.xpath(BusinessRolePage.btnContinue)).click();

//        WebDriverWait wait = new WebDriverWait(getDriver(),30);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath(BusinessRolePage.btnContinue))));

        Thread.sleep(2000);
//        wait.waitForControl_Exist(BusinessRolePage.btnGetStart4Standard,30);
        Assert.assertEquals(getDriver().findElements(By.xpath(BusinessRolePage.btnGetStart4Standard)).size(),1);

        getDriver().findElement(By.xpath(BusinessRolePage.btnGetStart4Standard)).click();
        //Check Personal infor page displays
        Assert.assertEquals(getDriver().findElements(By.xpath(PersonalDetailsPage.txtBirthday)).size(),1);

    }
}
