/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class Link extends WebElement {
    private String link;

    public Link(String linkText, String link) {
        super(linkText);
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public String toString() {
        return "<a href =\"" + getLink() + "\">" + getText() + "</a>";
    }
}
