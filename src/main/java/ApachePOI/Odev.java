package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Odev {
    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/Odev.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Carpm Tablom yanyana");

//        Row row=sheet.createRow(0);
//        Cell cell=row.createCell(0);
//
//        cell.setCellValue("1");


        int rowcount = 0;
        for (int i = 1; i <= 10; i++) {
            int a = -1;
            Row row = sheet.createRow(rowcount);
            for (int j = 1; j <= 10; j++) {
                Cell cell = row.createCell(j + a);
                cell.setCellValue(j);
                cell = row.createCell(j + a + 1);
                cell.setCellValue("X");
                cell = row.createCell(j + a + 2);
                cell.setCellValue(i);
                cell = row.createCell(j + a + 3);
                cell.setCellValue(" =");
                cell = row.createCell(j + a + 4);
                cell.setCellValue(i * j);
                a += 5;
            }
            rowcount++;
        }


        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

}