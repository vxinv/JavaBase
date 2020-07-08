import java.util.ArrayList;
import java.util.HashMap;

// 表的详细信息
public class TableData {
    public HashMap<String,String> columns = new HashMap<>();
    public ArrayList<String> indexs = new ArrayList<>();
    public String tableName = "";


    public TableData() {
    }

    public HashMap<String, String> getColumns() {
        return columns;
    }

    public void setColumns(HashMap<String, String> columns) {
        this.columns = columns;
    }

    public ArrayList<String> getIndexs() {
        return indexs;
    }

    public void setIndexs(ArrayList<String> indexs) {
        this.indexs = indexs;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
