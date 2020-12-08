package JDBC.Gun2;

import JDBC._ParentBeforeAfter;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColoumn extends _ParentBeforeAfter {
@Test
public void Test1() throws SQLException {
    ResultSet rs=statement.executeQuery("select * from language");
    ResultSetMetaData resultSetMetaData=rs.getMetaData();
    int coloumncount=resultSetMetaData.getColumnCount();
    System.out.println(coloumncount);
    while (rs.next()){
        for (int i = 1; i <coloumncount ; i++)
        {
            System.out.println(rs.getString(i)+" ");
        }
        System.out.println();
    }

    }
}




