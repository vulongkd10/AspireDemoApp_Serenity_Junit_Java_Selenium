package demo_Aspire.pages;

import net.serenitybdd.core.pages.PageObject;

public class PersonalDetailsPage extends PageObject {
    public static String txtBirthday = "//input[@placeholder='Set your date of birth']";
    public static String btnYear = "//div[contains(@class,'date__navigation')]/div[5]//button";
    public static String btnMonth = "//div[contains(@class,'date__navigation')]/div[2]//button";
    public static String btnPrevYears = "//div[contains(@class,'q-date__view q-date__years')]//i[contains(@class,'left')]";
    public static String btnYearSelect = "//div[contains(@class,'q-date__years-content')]/div[1]/button";
    public static String btnDay = "//div[contains(@class,'calendar-days')]/div[1]/button";
    public static String txtNation = "//input[@placeholder-field='Nationality']";
    public static String dropdownNation = "//div[contains(@class,'label') and .='Singapore']";
    public static String txtGender = "//input[@placeholder='Set your gender']";
    public static String dropdownGender = "//div[contains(@class,'label') and .='Male']";
    public static String btnSubmit = "//button[.='Submit']";

}
