package HomeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public abstract class BasePage {

    WebDriverWait wait;;

    public WebDriver driver;
    public BasePage(WebDriver d){
        driver=d;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        initilizeElements(this);
    }
    protected void initilizeElements(Object obj){
        PageFactory.initElements(driver,obj);
    }
    public void goBack(){
        driver.navigate().back();
    }

    public void waitElementTobeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
