package HomeProject;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class JsonPage extends BasePage {

    @FindBy(css="body")
    public WebElement body;


    public JsonPage(WebDriver d) {
        super(d);
        super.initilizeElements(this);

    }
    public void goToJsonPage(String url){
        driver.get(url);
    }


    public long getTheCurrentTemp() throws JSONException {
        String json = body.getText();
        JSONObject obj = new JSONObject(json);
        return ((obj.getJSONObject("main").getLong("temp"))/10);

    }

}
