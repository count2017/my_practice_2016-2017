package uri_test;

import java.net.URL;

import org.junit.Test;

public class UrlTest {
	@Test  
	public void urlTest() throws Exception{  
	    URL url = new URL("nntp://www.qiandu.com:8080/goods/index.html?username=dgh&passwd=123#j2se");
//	    java.net.MalformedURLException
	    System.out.println("URL：                  " + url.toString());  
	    System.out.println("protocol：        " + url.getProtocol());  
	    System.out.println("authority：      " + url.getAuthority());  
	    System.out.println("file name：      " + url.getFile());  
	    System.out.println("host：                " + url.getHost());  
	    System.out.println("path：                " + url.getPath());  
	    System.out.println("port：                " + url.getPort());  
	    System.out.println("default port：" + url.getDefaultPort());  
	    System.out.println("query：              " + url.getQuery());  
	    System.out.println("ref：                  " + url.getRef());  
	}
}
