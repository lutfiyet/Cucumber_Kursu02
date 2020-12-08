package JDBC.Gun2;

import JDBC._ParentBeforeAfter;
import com.mysql.cj.protocol.Resultset;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends _ParentBeforeAfter {
    @Test
    public void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from customer");
        int rowcount=0;
       while (rs.next()) {
           String firstName = rs.getNString("first_name");
           String last_name = rs.getNString("last_name");
         // System.out.println(firstName+"--"+last_name);
           System.out.printf("%-15s %-15s %-4d\n",firstName,last_name,rs.getRow());
           // stringler 15 karakter olacak sekilde,sayilar4 basamak olck sekilde,- ile sola dayali yazdrdk
           rowcount++;
       }
        System.out.println("kayit sayisi= "+rowcount);
       rs.last();
        System.out.println(rs.getRow());
    }

    @Test
    public void test2() throws SQLException {
    ResultSet rs = statement.executeQuery("select * from customer ");

    int rowCount=0;
        while(rs.next()) {

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");

        //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
        System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());

        rowCount++;
    }

        System.out.println("Kayıt Miktarı="+rowCount);

        rs.last();
        System.out.println(rs.getRow());
}


    // Task : yukarıdaki örneği for döngüsü yapınız.
    @Test
    public void task1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer ");
        rs.last();
        int rowCount = rs.getRow();

        rs.first();
        for (int i = 1; i <= rowCount; i++) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());

            rs.next();
        }


//        for (int i = 1; i <= rowCount; i++) {
//            rs.absolute(i);
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//        }


//        for (int i = rowCount; i > 0; i--) { // sondan başa doğru
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//
//            rs.next();
//        }

    }



}
