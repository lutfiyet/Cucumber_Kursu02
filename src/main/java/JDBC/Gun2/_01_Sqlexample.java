package JDBC.Gun2;

import JDBC._ParentBeforeAfter;
import com.mysql.cj.protocol.Resultset;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_Sqlexample extends _ParentBeforeAfter {

    @Test
    public void relativeExample() throws SQLException {
       ResultSet rs= statement.executeQuery("select * from city");
       rs.relative(5);
       String cityname=rs.getNString(2);
        System.out.println(cityname);
        rs.relative(6);
        cityname=rs.getNString(2);
        System.out.println(cityname);
    }
    @Test
    public void lastFirstKeyword() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from city");
        rs.last(); // son row a gidyoor
        String cityname=rs.getNString("city");
        Integer countryId=rs.getInt("country_id");
        System.out.println("lastcityname= "+cityname+"  "+"lastcountryId= "+countryId);
        rs.first();
        cityname=rs.getNString("city");
        countryId=rs.getInt("country_id");
        System.out.println("firstcityname= "+cityname+"  "+"firstcountryId= "+countryId);


    }
    @Test
            public void deneme() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from address");
        rs.absolute(10);// 10.satira git
        String district = rs.getNString("district");
        System.out.println(district);
        rs.absolute(22);
        district = rs.getString("district");
        System.out.println(district);
        rs.last();
        district=rs.getNString("district");
        System.out.println(district);

    }
}
