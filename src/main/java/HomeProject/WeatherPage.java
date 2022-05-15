package HomeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherPage extends BasePage {

    public WeatherPage(WebDriver d) {
        super(d);
        super.initilizeElements(this);
    }

    @FindBy(css="#LocationSearch_input")
    public WebElement weatherTextFielByZipCode;

    @FindBy(css="#LocationSearch_listbox #LocationSearch_listbox-0")
    public WebElement firslChoiceFromTheDDL;

    @FindBy(css="[data-cq-observe='true'] [class*='CurrentConditions--tempValue']")
    public WebElement theCurrentTemp;






}
