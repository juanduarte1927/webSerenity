package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.RegisterUI;
import utils.Actions;

import java.util.List;


public class Register extends PageObject {

    Actions ac = new Actions();

    @Step("Register Their Account")
    public void doRegister1(String firstName, String lastName, String address)
    {
        ac.setInputText(RegisterUI.txtFirstName(),firstName);
        ac.setInputText(RegisterUI.txtLastName(),lastName);


    }

    @Step("contact information")
    public void doRegister2(String email, String phone)
    {
        //ac.setInputText(RegisterUI.txtEmail(),email);
        ac.setInputText(RegisterUI.txtPhone(),phone);

    }

    @Step("gender information")
    public void doRegister3(String gender)
    {
        if(gender.equals("Male"))
       ac.click(RegisterUI.rbGenderMale());
        if(gender.equals("Female"))
            ac.click(RegisterUI.rbGenderFemale());

    }

    @Step("also info about")
    public void doRegister4(String hobbies, String languages, String skills)
    {
        if(hobbies.equals("Cricket"))
            ac.click(RegisterUI.chHobbiesCricket());
        if(hobbies.equals("Movies"))
            ac.click(RegisterUI.chHobbiesMovies());
        if(hobbies.equals("Hockey"))
            ac.click(RegisterUI.chHobbiesHockey());
        ac.click(RegisterUI.btnLanguages());

        WebElement dropdown =  getDriver().findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));

        List<WebElement> options = dropdown.findElements(By.tagName("li"));
        for (WebElement option : options)
        {
            if (option.getText().equals(languages))
            {
                option.click();
                break;
            }
        }
        ac.click(RegisterUI.lblExitList());
        ac.click(RegisterUI.optSkills(skills));

    }

    @Step("location info")
    public void doRegister5(String country, String department)
    {
        ac.click(RegisterUI.optSkills(country));
        ac.click(RegisterUI.lstDepartment());
        ac.setInputText(RegisterUI.txtSearchDepartment(),department);
        ac.enter(RegisterUI.txtSearchDepartment());

    }

    @Step("birthday info")
    public void doRegister6(String birthday)
    {
        String[] parts = birthday.split(",");
        ac.click(RegisterUI.optSkills(parts[0]));
        ac.click(RegisterUI.optSkills(parts[1]));
        ac.click(RegisterUI.optSkills(parts[2]));


    }

    @Step("password info")
    public void doRegister7(String password)
    {
        ac.setInputText(RegisterUI.txtFirstPassword(),password);
        ac.setInputText(RegisterUI.txtSecondPassword(),password);
        ac.click(RegisterUI.btnSubmit());

    }

    @Step("user registered")
    public void verifyUserRegistered(String message)
    {
        ac.verifyMessage(RegisterUI.lblRegister(), message);



    }
}
