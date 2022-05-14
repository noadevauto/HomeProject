package HomeProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MetricaPage extends  BasePage{

    @FindBy(css="#mainLinks [href*='celsius-to-fahrenheit']")
    public WebElement celsiusToFarenButton;

    @FindBy(css="#mainLinks [href*='meters-to-feet']")
    public WebElement meterToFeetButton;

    @FindBy(css="#mainLinks [href*='pounds-to-kilograms']")
    public WebElement poundsToKg;
}
