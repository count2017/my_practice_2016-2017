package HttpS;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class TestUUID {
	 public static String getEncoding(String str){

	        try {
	        	String encode = "ISO-8859-1";
		            if(str.equals(new String(str.getBytes(encode),encode))){
		                String s1 = encode;
		                return encode;
		            }
	        	
	             encode = "GB2312";
	            if(str.equals(new String(str.getBytes(encode),encode))){
	                String s = encode;
	                return s;
	            }

	           

	            encode = "UTF-8";
	            if(str.equals(new String(str.getBytes(encode),encode))){
	                String s2 = encode;
	                return encode;
	            }
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	       return "";
	    }

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		uuid = uuid.replace("-", "");
		System.out.println(uuid);*/
		System.out.println(getEncoding("<>?>?L#&$I$UNGDK"));
	}

}
