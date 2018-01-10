
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb=new HSSFWorkbook(); // 定义一个新的工作簿
		HSSFSheet sheet1 =  wb.createSheet("new sheet"); 
		FileOutputStream fileOut=new FileOutputStream("d:\\用Poi搞出来的工作簿.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}
