package uri_test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenStream {
	public static void h(){
		URL url = null;
		try {
			url = new URL("http://www.baidu.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 InputStream in = null;
		try {
			in = url.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ByteArrayOutputStream output = new ByteArrayOutputStream();
		 byte[] buffer = new byte[1024];
		 int len = -1;
		 try {
			while ((len = in.read(buffer)) != -1)
			 {
			    output.write(buffer, 0, len);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.err.println(new String(output.toByteArray()));
	}
	public static void main(String[] args) {
		h();
	}
}
