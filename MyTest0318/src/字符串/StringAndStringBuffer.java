package 字符串;

import java.util.Date;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		 Date d = new Date();  
        String s = "str"; 
        String cs = s;
        long r = Runtime.getRuntime().freeMemory();  
        StringBuffer sb = new StringBuffer("str");  
        for (int i = 0; i < 10000; i++) {  
            s += cs;  
        }  
        System.out.println("String Memory used: "  
                + ((r - Runtime.getRuntime().freeMemory()) / 1000) + "K");  
        System.out.println("String Time Used : "  
                + (new Date().getTime() - d.getTime()) + " ms");  
//        System.gc(); 
        //-----------------
        r = Runtime.getRuntime().freeMemory();  
        d = new Date();  
        for (int i = 0; i < 10000; i++) {  
            sb.append(i);  
        }  
        System.out.println("StringBuffer Memory used: "  
                + ((r - Runtime.getRuntime().freeMemory()) / 1000) + "K");  
        System.out.println("StringBuffer Time Used : "  
                + (new Date().getTime() - d.getTime()) + " ms");
//        System.gc(); 
        //-----------------
        r = Runtime.getRuntime().freeMemory();  
        d = new Date(); 
        s = "str";
        sb = new StringBuffer("str");
        for (int i = 0; i < 10000; i++) {  
            s = s + sb.toString(); 
            s += sb;
        }  
        System.out.println("String拼接StringBuffer Memory used: "  
                + ((r - Runtime.getRuntime().freeMemory()) / 1000) + "K");  
        System.out.println("String拼接StringBuffer Time Used : "  
                + (new Date().getTime() - d.getTime()) + " ms");
        
		
	}

}
