package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
String path="src/main/resources/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook =WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("merhaba dünya");
        inputStream.close();//okuma islemi kapatildi
        //yazma islemi icin exceli yazma modunda aciyorum
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();




    }
}