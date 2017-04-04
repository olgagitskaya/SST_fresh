/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class List extends WebElement {

    public List(String listItem) {
        super(listItem);
    }

    public String toString() {
        return "<ul>" + "<li>" + getText() + "</li>" + "</ul>";
    }

}
