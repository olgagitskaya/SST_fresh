/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class ListItem extends WebElement {

    public ListItem(String listItem) {
        super(listItem);
    }

    public String toString() {
        return "<li>" + getText() + "</li>";
    }

}
