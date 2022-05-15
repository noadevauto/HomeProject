import HomeProject.ConerterPage;
import HomeProject.JsonPage;
import HomeProject.MeasurementPage;
import HomeProject.WeatherPage;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class ExtraTest  extends BaseTest{

    WeatherPage weatherPage;
    JsonPage jsonP;
    @BeforeClass()
    public void setup(){
        createDriver("https://weather.com/");
        weatherPage=new WeatherPage(driver);
        jsonP= new JsonPage(driver);



    }

    @Test(priority =1)
    public void testCompareTempAccordingToApi() throws JSONException {
        weatherPage.waitElementTobeClickable(weatherPage.weatherTextFielByZipCode);
        weatherPage.weatherTextFielByZipCode.sendKeys("20852");
        weatherPage.firslChoiceFromTheDDL.click();
        int tempFromPage = Integer.valueOf(weatherPage.theCurrentTemp.getText().split("°")[0]);
        jsonP.goToJsonPage("https://api.openweathermap.org/data/2.5/weather?zip=20852&appid=c5acd2b2517d5936419674faf4d218dd");
        long tempFromApi = jsonP.getTheCurrentTemp();
        float percentage;
        percentage = ((tempFromApi-tempFromPage)*100)/tempFromPage;
        Assert.assertTrue(percentage<10,String.format("The gap percentage is %f",percentage));





    }


}
