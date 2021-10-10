package demo_Aspire.steps.serenity;

import demo_Aspire.Commons.Commons;
import demo_Aspire.Commons.Wait;
import demo_Aspire.pages.BusinessDetailsPage;
import demo_Aspire.pages.BusinessRolePage;
import demo_Aspire.pages.IdentityVerificationPage;
import demo_Aspire.pages.OnboardingNPSPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;


public class BusinessDetailsSteps extends ScenarioSteps {


    @Step("And User enter Business detail information")
    public void  enterBusinessDetails(String _businessName,String _businessCategory, String _entityType, String _UEN, String _industry,String _subIndustry,String _businessActivity,String _productExample, String _website, String _companySize, String _companyRevenue, String _companyPayMonthly, String _businessFund, String _accountUseFor) throws InterruptedException {
        getDriver().findElement(By.xpath(BusinessDetailsPage.txtBusinessName)).sendKeys(_businessName);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtEntityCategory)).click();
        Commons.selectItemCombobox(_businessCategory);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtEntityType)).click();
        Commons.selectItemCombobox(_entityType);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtUEN)).sendKeys(_UEN);


        getDriver().findElement(By.xpath(BusinessDetailsPage.txtIndustry)).click();
        Commons.selectItemCombobox(_industry);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtIndustry)).click();
        Commons.selectItemCombobox(_subIndustry);

        getDriver().findElement(By.xpath(BusinessDetailsPage.btnContinue)).click();
        Thread.sleep(2000);
//        wait.waitForControl_Exist(BusinessDetailsPage.txtBusinessActivity,30);

        //Check Next page displays
        Assert.assertEquals(getDriver().findElements(By.xpath(BusinessDetailsPage.txtBusinessActivity)).size(),1);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtBusinessActivity)).sendKeys(_businessActivity);
        getDriver().findElement(By.xpath(BusinessDetailsPage.txtProductExample)).sendKeys(_productExample);
        getDriver().findElement(By.xpath(BusinessDetailsPage.txtBusinessWebsite)).sendKeys(_website);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtCompanySize)).click();
        Commons.selectItemCombobox(_companySize);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtRevenue)).click();
        Commons.selectItemCombobox(_companyRevenue);

        getDriver().findElement(By.xpath(BusinessDetailsPage.txtCardMonthly)).click();
        Commons.selectItemCombobox(_companyPayMonthly);

        getDriver().findElement(By.xpath(BusinessDetailsPage.btnSubmit)).click();
        Thread.sleep(12000);

        //Check Next page displays
        Assert.assertEquals(getDriver().findElement(By.xpath(OnboardingNPSPage.txtAccountUseFor)).isDisplayed(),true);

        getDriver().findElement(By.xpath(OnboardingNPSPage.txtAccountUseFor)).click();
        Commons.selectItemCombobox(_businessFund);
        //Click on Logo to close dropdown
        getDriver().findElement(By.xpath(BusinessRolePage.imgLogo)).click();

        getDriver().findElement(By.xpath(OnboardingNPSPage.txtBusinessFund)).click();
        Commons.selectItemCombobox(_accountUseFor);
        //Click on Logo to close dropdown
        getDriver().findElement(By.xpath(BusinessRolePage.imgLogo)).click();

        getDriver().findElement(By.xpath(BusinessDetailsPage.btnContinue)).click();
        Thread.sleep(3000);
        //Check Next page displays
        Assert.assertEquals(getDriver().findElements(By.xpath(OnboardingNPSPage.chkBussinessAddress)).size(),1);

        getDriver().findElement(By.xpath(OnboardingNPSPage.chkBussinessAddress)).click();
        getDriver().findElement(By.xpath(OnboardingNPSPage.btnContinue)).click();

        Thread.sleep(5000);

        Assert.assertEquals(1, getDriver().findElements(By.xpath(IdentityVerificationPage.btnUpload)).size());

    }
}
