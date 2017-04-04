/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class Runner {
    public static void main(String[] args) {
        WebElement WebElement1 = new Div("This is my first page.");
        WebElement WebElement2 = new Link("Search in google", "www.google.com");
        WebElement WebElement3 = new List("Item number 1");
        HtmlPage page = new HtmlPage();
        page.addWebElement(WebElement1);
        page.addWebElement(WebElement2);
        page.addWebElement(WebElement3);
        System.out.println(page.toString());
    }
}
