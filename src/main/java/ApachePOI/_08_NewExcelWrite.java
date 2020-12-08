package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        String path="src/main/resources/NewExcelFile.xlsx";
        //yeni workbook,sheet,row,cell olustur
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("calisma sayfasi");
        Row row=sheet.createRow(5);
        Cell cell= row.createCell(5);
        cell.setCellValue("Slm dünyali biz geldik");
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();

    }
}
