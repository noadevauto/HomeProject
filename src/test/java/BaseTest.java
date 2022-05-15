import HomeProject.ConerterPage;
import HomeProject.MeasurementPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest  {

    protected WebDriver driver;





    public void createDriver(String url){
        File chromeDriverExe = new File (this.getClass().getClassLoader().getResource("chromedriver.exe").getFile());
        System.setProperty("webdriver.chrome.driver", chromeDriverExe.getAbsolutePath().replace("%20"," "));
        //Creating an object of ChromeDriver
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();
//Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//launching the specified URL
        driver.get(url);
    }


}
