
import java.util.Calendar;
import java.util.Scanner;

/**
 * （1）按“yyyy-MM-dd”格式输入一个字符串型日期。 
 （2）输出此日期为本年中的第几周。

 * **/
public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("您好，请输入日期（按XXXX年-XX月-XX日格式）：");
		String d = sc.next();
		String[] m = d.split("-");
		
		int a = Integer.valueOf(m[0]);
		int b = Integer.valueOf(m[1]);
		int c = Integer.valueOf(m[2]);
		
//		Calendar _k =  Calendar.getInstance();
		Calendar k =  Calendar.getInstance();
		k.setFirstDayOfWeek(Calendar.SUNDAY);
		k.setMinimalDaysInFirstWeek(1);
		k.set(a, b, c);
		
		System.out.println(k.get(k.WEEK_OF_YEAR));
		
		
	}

}
