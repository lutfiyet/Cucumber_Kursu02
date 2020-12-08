package JDBC.Gun1;
import com.mysql.cj.protocol.Resultset;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_Giris {

    @Test
    public void test1() throws SQLException {
        String URL = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        Connection connection= DriverManager.getConnection(URL,username,password);//baglanti saglanti
        Statement statement= connection.createStatement();// sorgulari calstrmk icin bir yol olustu
        ResultSet rs=statement.executeQuery("select * from actor");//calistirildi, sonuclar rs degiskenine
//fakat performans icin bütün sonuclar bir anda rs ye aktarilamiyor. biz komut verdiikce satir satir geleck
        rs.next();
        String firstname=rs.getString("first_name");
        String lastname=rs.getString("last_name");
        firstname=rs.getString("first_name");
        lastname=rs.getString("last_name");
        System.out.println(firstname+lastname);
        connection.close();
    }
}
