import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class HtmlPage {
    ArrayList<WebElement> webElements = new ArrayList<WebElement>();
    private String cssRefTable = "<link rel=\"stylesheet\" href=\"cssTable.css\"/>";
    private String cssRefDiv= "<link rel=\"stylesheet\" href=\"cssDiv.css\"/>";

    public HtmlPage() {

    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("<html>" + "<head>" + cssRefTable + cssRefDiv + "</head>");
        buf.append("<body>");
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
