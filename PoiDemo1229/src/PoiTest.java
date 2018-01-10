
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class PoiTest
{

    //将生成好的Excel文件，放到硬盘上

    public void writeToDisk(){

        HSSFWorkbook wb = new HSSFWorkbook();
        //生成一个sheet1
        HSSFSheet sheet = wb.createSheet("sheet1");
        //为sheet1生成第一行，用于放表头信息
        HSSFRow row = sheet.createRow(0);
        
        //第一行的第一个单元格的值为  ‘序号’
        HSSFCell cell = row.createCell((short)0);
//        cell.setEncoding(HSSFCell.ENCODING_UTF_16); //设置编码
        cell.setCellValue("序号");
        
        cell = row.createCell((short)1);
//        cell.setEncoding(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue("姓");
        
        cell = row.createCell((short)2);
//        cell.setEncoding(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue("名");
        
        cell = row.createCell((short)3);
//        cell.setEncoding(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue("年龄");
        
        User u = new User();
        
        List<User> list = u.findAllUser();
        //获得List中的数据，并将数据放到Excel中

        for(int i=0;i<list.size();i++)
        {
            User user = list.get(i);

           //数据每增加一行，表格就再生成一行             

            row = sheet.createRow(i+1);
            //第一个单元格，放序号随着i的增加而增加           

            cell = row.createCell((short)0);
//            cell.setEncoding(HSSFCell.ENCODING_UTF_16);
            cell.setCellValue(i+1);
            //第二个单元格放firstname
            cell = row.createCell((short)1);
//            cell.setEncoding(HSSFCell.ENCODING_UTF_16);
            cell.setCellValue(user.getFirstname());
            //第三个单元格放lastname
            cell = row.createCell((short)2);
//            cell.setEncoding(HSSFCell.ENCODING_UTF_16);
            cell.setCellValue(user.getLastname());
            //第四个单元格放age
            cell = row.createCell((short)3);
//            cell.setEncoding(HSSFCell.ENCODING_UTF_16);
            cell.setCellValue(user.getAge());
            
        }
        
        
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try
        {
            wb.write(os);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        byte[] content = os.toByteArray();
        
        File file = new File("d:/text.xls");//Excel文件生成后存储的位置。
        
        OutputStream fos  = null;
        
        try
        {
            fos = new FileOutputStream(file);
            
            fos.write(content);

            os.close();

            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }          
    }    
    
    public static void main(String[] args)
    {
        
        PoiTest pt = new PoiTest();
        pt.writeToDisk();
        
    }
}