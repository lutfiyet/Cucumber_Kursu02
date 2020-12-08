package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path="src/main/resources/ApacheExcel1.xlsx";
        //todo dosyayi yani exceli okumaya actim
        FileInputStream dosyaokumayolu=new FileInputStream(path);
        //todo bunun üzerinden calsima kitabini aliyorum
        Workbook calismakitabi= WorkbookFactory.create(dosyaokumayolu);
        //TODO istedigim isimdeki calisma sayfasini aliyorum
        Sheet calismasayfasi=calismakitabi.getSheet("Sheet1");
        //TODO istenen satiri aliyorum
        Row satir=calismasayfasi.getRow(0);
        //TODO istenen satirdaki istenen hücre aliniyor
        Cell hücre=satir.getCell(0);
        System.out.println(hücre);

    }
}
