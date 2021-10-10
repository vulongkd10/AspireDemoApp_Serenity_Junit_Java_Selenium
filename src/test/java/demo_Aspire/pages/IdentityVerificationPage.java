package demo_Aspire.pages;

import net.serenitybdd.core.pages.PageObject;

public class IdentityVerificationPage extends PageObject {
    public static String lnkSkip = "//div[contains(.,'Skip now, ask me later') and contains(@class,'skip-button')]";
    public static String btnUpload = "//button//span[contains(.,'Upload')]/input";
}
