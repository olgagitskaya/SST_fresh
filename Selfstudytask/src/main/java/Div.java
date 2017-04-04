/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class Div extends WebElement {

    Div(String divText) {
        super(divText);
    }

    public String toString() {
        return "<div>" + getText() + "</div>";
    }
}
