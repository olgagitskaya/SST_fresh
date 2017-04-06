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
        WebElement webElement4 = new Table(5,8);
       // webElement4.setStyle(" style=\"background-color: green; border-color: red; border-style: solid; padding: 5px\"");
        webElement4.setClassProperty(" class =\"tableLayout\"");

        HtmlPage page = new HtmlPage();
        page.addWebElement(webElement1);
        page.addWebElement(webElement2);
        page.addWebElement(webElement3);
        page.addWebElement(webElement4);
        System.out.println(page.toString());
    }
}
