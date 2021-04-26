package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tasks.OpenSite;
import tasks.Register;


public class RegisterDefinitions {

    @Steps
    Register register;
    OpenSite openSite;

    @Given("that the user Open the Site")
    public void openWebSite()  {
        openSite.openWebSite();
    }

    @When("Register their Account with personal information {string} {string} {string}")
    public void registerAccount1(String firstName, String lastName, String address)  {
        register.doRegister1(firstName,lastName,address);
    }

    @And("contact information {string} {string}")
    public void registerAccount2(String email, String phone)  {
        register.doRegister2(email,phone);
    }

    @And("gender information {string}")
    public void registerAccount2(String gender)  {
        register.doRegister3(gender);
    }

    @And("also info about {string} {string} {string}")
    public void registerAccount3(String hobbies, String languages, String skills)  {
        register.doRegister4(hobbies, languages, skills);
    }

    @And("the location info {string} {string}")
    public void registerAccount3(String country, String department)  {
        register.doRegister5(country, department);
    }

    @And("{string} information")
    public void birthdayInfo(String birthday)  {
        register.doRegister6(birthday);
    }

    @And("for last the account info {string}")
    public void passwordInfo(String password)  {
        register.doRegister7(password);
    }

    @And("the user is registered succesfully {string}")
    public void verifyUserRegistered(String message)  {
        register.verifyUserRegistered(message);
    }

}
