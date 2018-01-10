package myannotation;


public class SayHell {
	  
	     @HelloWorld(name = "xiaoming")
	     @Yts
	     public void sayHello(String name){
	         if(name == null || name.equals("")){
	              System.out.println("hello world!");
	          }else{
	             System.out.println(name + "say hello world!");
	         }
	     }
	       
}
