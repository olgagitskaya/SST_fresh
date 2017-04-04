import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class HtmlPage {
    ArrayList<WebElement> webElements = new ArrayList<WebElement>();

    public HtmlPage() {

    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("<html>" + "<body>");
        for(WebElement webElement : webElements)
        {
            buf.append(webElement);
        }
        buf.append("</body>" + "</html>");
        return buf.toString();
    }

    public String addWebElement(WebElement webElement)
    {
        webElements.add(webElement);
        return webElements.toString();
    }

}
