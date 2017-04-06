import java.util.ArrayList;

/**
 * Created by Volha_Hitskaya on 4/5/2017.
 */
public class Table extends WebElement{
    ArrayList<Row> rowList = new ArrayList<Row>();
    int numberOfRows = 0;
    int numberOfCells = 0;

    public Table(int numberOfRows, int numberOfCells) {
        this.numberOfRows = numberOfRows;
        this.numberOfCells = numberOfCells;
        for (int i = 0; i < numberOfRows; i++) {
            rowList.add(new Row((i == 0), numberOfCells));
        }
    }

    public String toString() {
        //String style = super.getStyle().toString();
        String classProperty = super.getClassProperty().toString();
        StringBuilder buf = new StringBuilder();
        buf.append("<table" + classProperty + ">\n");
        for (Row row : rowList) {
            buf.append(row.toString());
        }
        buf.append("</table>\n");
        String html = buf.toString();
        return html;
    }
}
