/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class Runner {
    public static void main(String[] args) {
        WebElement webElement1 = new Div("This is my first page.");
        WebElement webElement2 = new Link("Search in google", "www.google.com");
        List list = new List();
        list.addListItem(new ListItem("Item number one"));
        list.addListItem(new ListItem("Item number two"));
        WebElement webElement3 = list;


        HtmlPage page = new HtmlPage();
        page.addWebElement(webElement1);
        page.addWebElement(webElement2);
        page.addWebElement(webElement3);
        System.out.println(page.toString());
    }
}
