import HomeProject.ConerterPage;
import HomeProject.MeasurementPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MeasureMentTest extends BaseTest{



    public MeasurementPage measurementPage;
    public ConerterPage conerterPage;

    @BeforeClass()
    public void setup(){
        createDriver("https://www.metric-conversions.org/");
        measurementPage = new MeasurementPage(driver);
        conerterPage = new ConerterPage(driver);


    }


    @Test(priority =1)
    public void testCelciusToFaren(){
        measurementPage.celsiusToFarenButton.click();
        conerterPage.converterTextFieldOneChoice.sendKeys("50");
        Double farenPage = Double.valueOf(conerterPage.returnFalernResult().trim().split("°")[0]);
        Double actualFaren = (50*1.8)+32;
        Assert.assertEquals(actualFaren,farenPage,"Fahrenheit converting failed");

    }
    @Test(priority =2)
    public void testMeterToFeet(){
        measurementPage.goBack();
        measurementPage.meterToFeetButton.click();
        conerterPage.converterTextFieldOneChoice.sendKeys("50");
        Integer meterToFitFromPage=Integer.valueOf(conerterPage.returnFalernResult().split("ft")[0].trim());
        Integer acutalFit = (int) (50*3.28084);
        Assert.assertEquals(meterToFitFromPage,acutalFit,"Meter to Fit converting failed");

    }
    @Test(priority =3)
    public void testPoundToGram(){
        measurementPage.goBack();
        measurementPage.poundsToKg.click();
        conerterPage.converterTheSecondMeaurmentField.sendKeys("50");
        Double poundsToKgPage=Double.valueOf(conerterPage.returnFalernResult().split("=")[0].trim().split("kg")[0]);
        Assert.assertTrue(poundsToKgPage-50*0.0283495231<0.01, "Coverting Oz to Kg failed");

    }
}
