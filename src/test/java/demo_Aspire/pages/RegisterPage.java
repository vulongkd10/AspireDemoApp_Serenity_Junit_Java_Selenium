package demo_Aspire.pages;

import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject {
    public static String txtFullname = "//input[@name='full_name']";
    public static String txtPreferredname = "//input[@name='preferred_name']";
    public static String txtEmail = "//input[@name='email']";
    public static String txtPhone = "//input[@name='phone']";
    public static String txtKnowAboutUs = "//div[contains(@label,'here did you hear about us')]//input";
    public static String chkTermCondition = "//div[contains(@class,'register-step-person__privacy')]/div[@role='checkbox']";
    public static String btnContinue = "//button[.='Continue']";

}
