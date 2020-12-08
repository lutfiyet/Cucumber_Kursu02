package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {
/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 *
 */
        Scanner oku=new Scanner(System.in);
        String aranankelime=oku.nextLine();
        String donenkelime=bul(aranankelime);
        System.out.println(donenkelime);}

        static String bul(String aranacakkelime)  {
        String donecekkelime="";
            String path="src/main/resources/LoginData.xlsx";
            FileInputStream inputStream= null;
            try {
                inputStream = new FileInputStream(path);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Workbook workbook= null;
            try {
                workbook = WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Sheet sheet= workbook.getSheet("Login");
            int rowCount= sheet.getPhysicalNumberOfRows();
            for (int i = 0; i <rowCount ; i++) {
                if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranacakkelime))
                {
                    int cellcount=sheet.getRow(i).getPhysicalNumberOfCells();
                    for (int j = 0; j <cellcount ; j++) {
                        donecekkelime=sheet.getRow(i).getCell(j).toString();

                    }
                }

            }


        return donecekkelime;

    }
}