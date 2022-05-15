package HomeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConerterPage extends MeasurementPage {

    @FindBy(css="#argumentConv")
    public WebElement converterTextFieldOneChoice;

    @FindBy(css="#userConvert input[name='argumentConv1']")
    public WebElement converterTheFirstMeaurmentField;

    @FindBy(css="#userConvert input[name='argumentConv2']")
    public WebElement converterTheSecondMeaurmentField;


    @FindBy(css="#answer")
    public WebElement covertAnswer;

    public ConerterPage(WebDriver d) {
        super(d);
        super.initilizeElements(this);
    }

//    public void insertValueOneChoice(int value){
//        converterTextFieldOneChoice.sendKeys(String.valueOf(value));
//    }

    public String returnFalernResult(){
        String ans = covertAnswer.getText().split("=")[1];
        return ans;
    }



}
