package myannotation;

import java.lang.reflect.InvocationTargetException;

public class Test {
		public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException, InstantiationException {
	          ParseAnnotation parse = new ParseAnnotation();
	           parse.parseMethod(SayHell.class);
	           parse.parseType(SayHell.class);
     }
}
