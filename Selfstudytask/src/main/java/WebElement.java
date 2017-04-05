/**
 * Created by Volha_Hitskaya on 4/4/2017.
 */
public class WebElement {
    private String text;
    private String style;
    private String classProperty;

    public WebElement() {

    }

    public WebElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getStyle() {
        return style;
    }

    public String getClassProperty() {
        return classProperty;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setClassProperty(String classProperty) {
        this.classProperty = classProperty;
    }

    public String toString() {
        return "";
    }
}
