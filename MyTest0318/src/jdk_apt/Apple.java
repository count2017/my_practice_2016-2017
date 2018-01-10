package jdk_apt;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

import org.junit.Test;

@FruitColor
public class Apple {
    
    @FruitName(value = "Apple")
    private String appleName;
    
//    @FruitColor(fruitColor=Color.RED)
    private String appleColor;
    
    
    
    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }
    
    
    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }
    
    @Test 
    public void displayName(){
        System.out.println("水果的名字是："+ appleName);
        // 获取方法上的所有注解，并打印出来
        Class<Apple> c = Apple.class;
        Method method = null;
		try {
			method = c.getMethod("displayName", new Class[]{});
			Annotation[] annotations = method.getAnnotations();
	        for(Annotation annotation : annotations){
	            System.out.println(annotation);
	        }
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
	@Override
	public String toString() {
		return "Apple [appleName=" + appleName + ", appleColor=" + appleColor + "]";
	}
    
}