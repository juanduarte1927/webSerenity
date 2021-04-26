package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterUI {

    private static final By btnDemoSite = By.id("menu-item-251");
    private static final By txtFirstName = By.cssSelector("input[placeholder='First Name']");
    private static final By txtLastName = By.cssSelector("input[placeholder='Last Name']");
    private static final By txtAddress = By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']");
    private static final By txtEmail = By.id("eid");
    private static final By txtPhone = By.cssSelector("input[type='tel']");
    private static final By rbGenderMale = By.cssSelector("input[value='Male']");
    private static final By rbGenderFemale = By.cssSelector("input[value='FeMale']");
    private static final By chHobbiesCricket = By.id("checkbox1");
    private static final By chHobbiesMovies = By.id("checkbox2");
    private static final By chHobbiesHockey = By.id("checkbox3");
    private static final By btnLanguages = By.xpath("//div[@id='msdd']");
    private static final By lstLanguages = By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']");
    private static final By btnSkills = By.id("Skills");
    private static final By lblExitList = By.cssSelector("div:nth-child(7) label:nth-child(1)");
    private static final By lstDepartment = By.cssSelector("span[role='combobox']");
    private static final By txtSearchDepartment = By.cssSelector("input[role='textbox']");
    private static final By txtFirstPassword =  By.id("firstpassword");
    private static final By txtSecondPassword =  By.id("secondpassword");
    private static final By btnSubmit =  By.id("submitbtn");

    private static final By lblRegister =  By.xpath("//h2[normalize-space()='Register']");

    public static By btnDemoSite() {return btnDemoSite;}
    public static By txtFirstName() {return txtFirstName;}
    public static By txtLastName() {return txtLastName;}
    public static By txtAddress() {return txtAddress;}
    public static By txtEmail() {return txtEmail;}
    public static By txtPhone() {return txtPhone;}
    public static By rbGenderMale() {return rbGenderMale;}
    public static By rbGenderFemale() {return rbGenderFemale;}
    public static By chHobbiesCricket() {return chHobbiesCricket;}
    public static By chHobbiesMovies() {return chHobbiesMovies;}
    public static By chHobbiesHockey() {return chHobbiesHockey;}
    public static By btnLanguages() {return btnLanguages;}
    public static By lstLanguages() {return lstLanguages;}
    public static By optSkills(String value) {
        final By lstSkills = By.cssSelector("option[value='"+value+"']");
        return lstSkills;
    }
    public static By lblExitList() {return lblExitList;}
    public static By optCountry(String value) {
        final By lstCountry = By.cssSelector("option[value='"+value+"']");
        return lstCountry;
    }
    public static By lstDepartment() {return lstDepartment;}
    public static By txtSearchDepartment() {return txtSearchDepartment;}
    public static By txtFirstPassword() {return txtFirstPassword;}
    public static By txtSecondPassword() {return txtSecondPassword;}
    public static By btnSubmit() {return btnSubmit;}
    public static By lblRegister() {return lblRegister;}


}
