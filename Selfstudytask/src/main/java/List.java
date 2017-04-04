import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class List extends WebElement {
    ArrayList<ListItem> itemList = new ArrayList<ListItem>();

    public List() {

    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("<ul>");
        for (ListItem item : itemList) {
            buf.append(item);
        }
        buf.append("</ul>");
        return buf.toString();
    }

    public String addListItem(ListItem item) {
        itemList.add(item);
        return itemList.toString();
    }
}
