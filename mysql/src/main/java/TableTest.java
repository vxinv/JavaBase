import com.mysql.jdbc.Driver;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class TableTest {


    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        List<TableData> old = process("wqkj_test");
        List<TableData> pro = process("wqkj");

        check(old,pro);

    }

    static void check(List<TableData> oldDataList,List<TableData> newList){

        for (int i = 0; i < oldDataList.size(); i++) {
            TableData old = oldDataList.get(i);
            // 寻找对应的表
            // 遍历一遍 如果没有
            boolean hasTable = false;
            System.out.println("对比"+old.tableName+"=============>");

            for (int i1 = 0; i1 < newList.size(); i1++) {

                TableData pro = newList.get(i1);

                if (old.tableName.equals(pro.tableName)){
                    //  对比字段
                    hasTable = true;
                    if (old.columns.size() != pro.columns.size()){
                        old.columns.keySet().removeAll(pro.columns.keySet());
                        System.out.println("缺失的字段"+old.columns.keySet());

                    }else {
                        System.out.println("旧表"+old.tableName+"与新表"+pro.tableName+"字段相同");
                    }
                    // 对比索引
                    if (old.indexs.size() != pro.indexs.size()){
                        old.indexs.removeAll(pro.indexs);
                        System.out.println("缺失的索引"+old.indexs);
                    }else {
                        System.out.println("旧表"+old.tableName+"与新表"+pro.tableName+"索引相同");
                    }
                }
            }
            if (!hasTable){
                System.out.println("缺失的表"+old.tableName);
            }
            System.out.println("完毕"+old.tableName+"=============> \n\n");

        }


    }


    static List<TableData> process(String dbName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://rm-2ze3kt2861n4gf13mpo.mysql.rds.aliyuncs.com:3306/"+dbName;
        String name = "root";
        String password = "Wqkj2019";
        Connection connection = DriverManager.getConnection(url,name,password);
        DatabaseMetaData metaData = connection.getMetaData();
        ArrayList<TableData> tableDatas = new ArrayList<>();
        // 获取数据库下所有的表
        ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});
        while (tables.next()) {

            TableData tableData = new TableData();
            // 列的个数
            /*int columnCount = tables.getMetaData().getColumnCount();
            List<String> colNamesList = new ArrayList<String>();
            for (int i = 1; i <= columnCount; i++) { // 获取列名称
                String columnName = tables.getMetaData().getColumnName(i);
                colNamesList.add(columnName) ;
            }
            System.out.println(colNamesList);*/

            // 根据指定列名称获取数据
            String TABLE_NAME = tables.getString("TABLE_NAME") ;
            tableData.setTableName(TABLE_NAME);
            System.out.println(TABLE_NAME);
            // String TABLE_CAT = tables.getString("TABLE_CAT");
            // String TABLE_SCHEM = tables.getString("TABLE_SCHEM");
            // String TABLE_NAME = tables.getString("TABLE_NAME");
            // String TABLE_TYPE = tables.getString("TABLE_TYPE");
            // String REMARKS = tables.getString("REMARKS");
            // String TYPE_CAT = tables.getString("TYPE_CAT");
            // String TYPE_SCHEM = tables.getString("TYPE_SCHEM");
            // String TYPE_NAME = tables.getString("TYPE_NAME");
            // String SELF_REFERENCING_COL_NAME =
            // tables.getString("SELF_REFERENCING_COL_NAME");
            // String REF_GENERATION = tables.getString("REF_GENERATION");


            //  获取表的所有列
            ResultSet columns = metaData.getColumns(null, "%", TABLE_NAME, "%");

            // 列
            List<String> colslist = new ArrayList<String>();
            while (columns.next()) {
                // int columnCount = columns.getMetaData().getColumnCount();
                // for (int i = 1; i <= columnCount; i++) {// 获取所有列名
                // String columnName = columns.getMetaData().getColumnName(i);
                // list.add(columnName);
                // }

                // [TABLE_CAT, TABLE_SCHEM, TABLE_NAME, COLUMN_NAME, DATA_TYPE,
                // TYPE_NAME, COLUMN_SIZE, BUFFER_LENGTH, DECIMAL_DIGITS,
                // NUM_PREC_RADIX, NULLABLE, REMARKS, COLUMN_DEF, SQL_DATA_TYPE,
                // SQL_DATETIME_SUB, CHAR_OCTET_LENGTH, ORDINAL_POSITION,
                // IS_NULLABLE, SCOPE_CATALOG, SCOPE_SCHEMA, SCOPE_TABLE,
                // SOURCE_DATA_TYPE, IS_AUTOINCREMENT, IS_GENERATEDCOLUMN]
                String COLUMN_NAME = columns.getString("COLUMN_NAME");
                String TYPE_NAME = columns.getString("TYPE_NAME");
                tableData.getColumns().put(COLUMN_NAME,TYPE_NAME);
                colslist.add(COLUMN_NAME + "|" + TYPE_NAME);
            }
            System.out.println(colslist);

            ResultSet PrimaryKeys = metaData.getIndexInfo(null, "%", TABLE_NAME,false,false);
            // 获取主键列
            List<String> PrimaryKeysist = new ArrayList<String>();
            while (PrimaryKeys.next()) {
                String COLUMN_NAME = PrimaryKeys.getString("COLUMN_NAME");
                PrimaryKeysist.add(COLUMN_NAME);
                tableData.getIndexs().add(COLUMN_NAME);
            }
            System.out.println(PrimaryKeysist);

            tableDatas.add(tableData);
        }

        return tableDatas;
    }
}
