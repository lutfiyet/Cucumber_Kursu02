package JDBC.Gun1;

import JDBC._ParentBeforeAfter;
import org.testng.annotations.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsuluteRelative extends _ParentBeforeAfter {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");
        rs.absolute(10);// 10.satira git
        String title = rs.getNString("title");
        System.out.println(title);
        rs.absolute(15);
        title = rs.getString("title");
        System.out.println(title);
    }


}
