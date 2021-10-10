package demo_Aspire.pages;

import net.serenitybdd.core.pages.PageObject;

public class BusinessDetailsPage extends PageObject {
    public static String txtBusinessName="//input[@placeholder='The full legal business name']";
    public static String txtEntityCategory = "//input[@placeholder='Select your business registration type']";
    public static String dropdownEntityCategory = "//div[contains(@class,'label') and .='Limited companies']";
    public static String txtEntityType = "//input[@placeholder='Select any of the following' and contains (@data-cy,'sub-registration-type')]";
    public static String dropdownEntityType = "//div[contains(@class,'label') and .='Limited partnership']";
    public static String txtUEN = "//input[@placeholder='Enter your business registration number']";
    public static String txtIndustry = "//input[@placeholder='Select any of the following']";
    public static String dropdownIndustry = "//div[contains(@class,'label') and .='Business Services']";
    public static String dropdownSubIndustry = "//div[contains(@class,'label') and .='Auction and Valuation Services']";
    public static String btnContinue = "//button[.='Continue']";
    public static String txtBusinessActivity = "//input[contains(@placeholder,'We provide IT services to businesses')]";
    public static String txtProductExample = "//input[contains(@placeholder,'Consult on market-entry strategy')]";
    public static String txtBusinessWebsite = "//input[contains(@placeholder,'Enter your website URL')]";
    public static String txtCompanySize = "//input[contains(@placeholder,'Select your company size')]";
    public static String dropdownCompanySize = "//div[contains(@class,'label') and .='1']";
    public static String txtRevenue = "//input[@placeholder='Select your annual revenue']";
    public static String dropdownRevenue = "//div[contains(@class,'label') and .='S$0 - S$50,000']";
    public static String txtCardMonthly = "//input[@placeholder='Select your total monthly card spend']";
    public static String dropdownCardMonthly = "//div[contains(@class,'label') and .='0']";
    public static String btnSubmit = "//button[.='Submit']";

}
