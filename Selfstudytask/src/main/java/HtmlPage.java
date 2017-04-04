import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class HtmlPage {
    ArrayList<WebElement> webElements = new ArrayList<WebElement>();

    public HtmlPage() {

    }

    public String toString() {
        return "<html>" + "<body>" + webElements + "</body>" + "</html>";
    }

    public String addWebElement(WebElement webElement)
    {
        webElements.add(webElement);
        return webElements.toString();
    }

}
