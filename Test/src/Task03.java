
import java.util.Calendar;
import java.util.Scanner;

/**
 * ��1������yyyy-MM-dd����ʽ����һ���ַ��������ڡ� 
 ��2�����������Ϊ�����еĵڼ��ܡ�

 * **/
public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ã����������ڣ���XXXX��-XX��-XX�ո�ʽ����");
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
