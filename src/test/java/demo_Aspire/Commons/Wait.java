package demo_Aspire.Commons;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class Wait extends PageObject{

    public void waitForControl_NotExist(String control, int timeout) throws InterruptedException {
        for (int second = 0; second<= timeout; second++)
        {

            if (Wait.super.isElementVisible(By.xpath(control))==true)
            {
                Thread.sleep(1000);
            }else
                break;
        }
    }

    public void waitForControl_Exist(String control, int timeout) throws InterruptedException {
        for (int second = 0; second<= timeout; second++)
        {

            if (Wait.super.isElementVisible(By.xpath(control))==false)
            {
                Thread.sleep(1000);
            }else
                break;
        }
    }

}