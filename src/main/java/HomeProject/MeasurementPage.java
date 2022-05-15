package HomeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeasurementPage extends  BasePage{

    public MeasurementPage(WebDriver d) {
        super(d);
        super.initilizeElements(this);
    }


    @FindBy(css="#mainLinks [href*='celsius-to-fahrenheit']")
    public WebElement celsiusToFarenButton;

    @FindBy(css="#mainLinks [href*='meters-to-feet']")
    public WebElement meterToFeetButton;

    @FindBy(css="#mainLinks [href*='pounds-to-kilograms']")
    public WebElement poundsToKg;
}
