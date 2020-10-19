package Pages;

import Constants.Paths;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

    public static WebElement getFirstName(WebDriver driver){
        return driver.findElement(By.xpath(Paths.firstName));
    }

    public static WebElement getLastName(WebDriver driver){
        return driver.findElement(By.xpath(Paths.lastName));
    }

    public static WebElement getGender(WebDriver driver){
        return driver.findElement(By.cssSelector(Paths.gender));
    }

    public static WebElement getExp(WebDriver driver){
        return driver.findElement(By.cssSelector(Paths.exp));
    }

    public static WebElement getDate(WebDriver driver){
        return driver.findElement(By.xpath(Paths.date));
    }

    public static WebElement getProfession (WebDriver driver){
        return driver.findElement(By.cssSelector(Paths.profession));
    }

    public static WebElement getAutTool (WebDriver driver){
        return driver.findElement(By.cssSelector(Paths.auttool));
    }

    public static Select getContinent (WebDriver driver){
        Select select = new Select(driver.findElement(By.xpath(Paths.continent)));
        return select;
    }

    public static Select getCommands (WebDriver driver){
        Select select = new Select(driver.findElement(By.xpath(Paths.commands)));
        return select;
    }

    public static WebElement getChooseFile (WebDriver driver) {
        return driver.findElement(By.xpath(Paths.chooseFile));
    }

    public static WebElement getDownloadFile (WebDriver driver) {
        return driver.findElement(By.xpath(Paths.downloadFile));
    }

    public static WebElement getSubmitButton (WebDriver driver) {
        return driver.findElement(By.xpath(Paths.submit));
    }

}
