package demo_Aspire.pages;

import net.serenitybdd.core.pages.PageObject;

public class MobileVerificationPage extends PageObject {
    public static String txtOTP = "//div[contains(@class,'otp-form') and contains(@class,'input')]//input[@autocomplete='one-time-code']";

    public static String lblMobileVerificationSuccess = "//p[contains(.,'You have successfully verified your mobile number. You’re on to a great start!')]";
    public static String btnContinue = "//button[.='Continue']";

}
