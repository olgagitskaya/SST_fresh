/**
 * Created by Volha_Hitskaya on 4/5/2017.
 */
public class Cell extends WebElement{

    boolean isHeader;
    String text = "";

    public Cell(boolean isHeader, String text)
    {
        this.isHeader = isHeader;
        this.text = text;
    }

    public String toString()
    {
        if(isHeader)
        {
            return "<th>" + text + "</th>";
        }
        else{
            return "<td>" + text + "</td>";
        }
    }
}
