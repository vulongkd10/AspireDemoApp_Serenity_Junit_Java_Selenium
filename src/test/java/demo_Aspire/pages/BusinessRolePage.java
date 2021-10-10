package demo_Aspire.pages;

import net.serenitybdd.core.pages.PageObject;

public class BusinessRolePage extends PageObject {
    public static String imgDirector="//img[contains(@src,'director')]";
    public static String cboCountry = "//div[@placeholder='Select any of the following' and contains(@url,'countries/all')]/span";
    public static String chkCompanyNotRegistered = "//div[@role='checkbox']//div[.='My company is not registered yet']";
    public static String cboSolution = "//label[contains(.,'applicable options')]//i";
    public static String itemSolutionDropdown = "//div[.='voluptas' and contains(@class,'label')]";
    public static String btnContinue = "//button[.='Continue']";
    public static String btnGetStart4Standard = "//div[div[contains(.,'Standard Registration')] and contains(@class,'onboarding-step-register-select')]//button";
    public static String imgLogo = "//aside//img";


}
