package demo_Aspire.Commons;

import demo_Aspire.pages.PersonalDetailsPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Commons {
    @Step("Given user has start to Aspire application")
    public static void  selectItemCombobox(String _item)  {
        getDriver().findElement(By.xpath("//div[contains(@class,'label') and .='"+ _item+ "']")).click();
    }

    public static void selectDate(String _yyyymmmdd) throws InterruptedException {
        String dt[] = _yyyymmmdd.split("/");
        getDriver().findElement(By.xpath(PersonalDetailsPage.btnYear)).click();
        //div[contains(@class,'q-date__years-content')]//button[.='2001']
        while (getDriver().findElements(By.xpath("//div[contains(@class,'q-date__years-content')]//button[.='" + dt[0] + "']")).size() != 1)
        {
            getDriver().findElement(By.xpath(PersonalDetailsPage.btnPrevYears)).click();
//        if(getDriver().findElements(By.xpath("//div[contains(@class,'q-date__years-content')]//button[.='" + dt[0] + "']")).size()==1)
//        {
//            getDriver().findElements(By.xpath("//div[contains(@class,'q-date__years-content')]//button[.='2001']"));
//        }
        }

        //Click Year
        getDriver().findElement(By.xpath("//div[contains(@class,'q-date__years-content')]//button[.='" + dt[0] + "']")).click();
        Thread.sleep(300);
//        getDriver().findElement(By.xpath(PersonalDetailsPage.btnYearSelect)).click();

        //Select Month
        getDriver().findElement(By.xpath(PersonalDetailsPage.btnMonth)).click();
        getDriver().findElement(By.xpath("//div[contains(@class,'q-date__months')]//button[.='" +dt[1] + "']")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div[contains(@class,'calendar-days')]//button[.='" +dt[2]+"']")).click();
    }
}
