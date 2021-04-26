package utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Actions extends PageObject {

    private int tiempoEspera = 15;

    public WebElement waitObjects(By object, int... tiempo) {

        getDriver().manage().timeouts().implicitlyWait(
                tiempo.length >0 ? tiempo[0] : tiempoEspera,
                TimeUnit.SECONDS);
        return getDriver().findElement(object);
    }

    public void click(By object){
        click(waitObjects(object));
    }

    public void enter(By object){
        enter(waitObjects(object));
    }

    public void enter(WebElement object){
        object.sendKeys(Keys.ENTER);
       // Serenity.takeScreenshot();
    }

    public void click(WebElement object){
        object.click();
       // Serenity.takeScreenshot();
    }

    public void setInputText(By object, String dato){
        setInputText(waitObjects(object), dato);
    }

    public void setInputText(WebElement el, String dato){
        el.sendKeys(dato);
       // Serenity.takeScreenshot();
    }

    public void verifyMessage(By locators, String message){
        String siteMessage = waitObjects(locators).getText();
       // Serenity.takeScreenshot();
        if(!siteMessage.contains(message)){
            throw new AssertionError(String.format("El mensaje: %s no est\u00E1 contenido en el sitio: %s", message,siteMessage));
        }
    }


}
