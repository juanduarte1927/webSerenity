package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import ui.RegisterUI;
import utils.Actions;

public class OpenSite extends PageObject {

    Actions ac = new Actions();

    @Step("that the user Open the Site")
    public void openWebSite()
    {
        getDriver().get("http://practice.automationtesting.in/");
        ac.click(RegisterUI.btnDemoSite());

    }
}
