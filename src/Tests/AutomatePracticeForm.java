package Tests;

import Constants.Paths;
import Pages.PracticeForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class AutomatePracticeForm {


    public static WebDriver driver;
    public static SoftAssert sa;

    @BeforeMethod

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver-2"); //izbrisati kad udje u testSuite
        driver = new ChromeDriver();
        sa = new SoftAssert();
    }

    @Test

    public void practiceFrom() throws InterruptedException {
        driver.get(Paths.formUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        PracticeForm.getFirstName(driver).sendKeys("Marko");
        PracticeForm.getLastName(driver).sendKeys("Jovanovic");
        PracticeForm.getGender(driver).click();
        PracticeForm.getExp(driver).click();
        PracticeForm.getDate(driver).sendKeys("2020/10/19");
        PracticeForm.getProfession(driver).click();
        PracticeForm.getAutTool(driver).click();
        PracticeForm.getContinent(driver).selectByVisibleText("Europe");
        PracticeForm.getCommands(driver).selectByVisibleText("WebElement Commands");
        PracticeForm.getChooseFile(driver).sendKeys("/Users/ivana/Downloads/1ddb3bc7f02c30cbd857008e4c8467a7.jpg");
        PracticeForm.getDownloadFile(driver).click();
        driver.navigate().back();
        Thread.sleep(2000);
        PracticeForm.getSubmitButton(driver).click();
        driver.close();

    }
}
