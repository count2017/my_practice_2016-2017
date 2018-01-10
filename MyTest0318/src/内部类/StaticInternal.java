package 内部类;

public class StaticInternal { 
	static{
		System.out.println("我是静态块1");
	}
	private static String kkk = "我是静态变量kkk";
	{
    	System.out.println("我是块1");
    }
	static{
		if(kkk == null){
			System.out.println("静态变量kkk未初始化");
		}else{
			System.out.println("已经初始化静态变量kkk");
		}
		if(StaticInternal.InnerClass_2.test.equals("test")){
			System.out.println("静态内部类InnerClass_2已初始化");
		}
	}
	
	static{
		System.out.println("我是静态块222");
	}
	
    private static String name = "\"聂庆亮\""; 
    
    public static void setStatic(String n) {        // 外部类的非静态方法  
        System.out.println("[现在访问的是外部类的静态方法!]");  
        name = n;  
    }  
    static class InnerClass_2 {            // 静态内部类开始
        String address, mail;        // 声明String类型变量  
        long phoneNum;        // 声明long类型变量  
        int qq;                // 声明int类型变量  
        static String test = "test";
        static void getStatic() {    // 静态内部类的静态方法  
            System.out.println("[访问外部类的静态变量] name = " + name);  
            setStatic("尹继平");     // 访问外部类的静态方法  
        }  
        // 静态内部类的非静态方法  
        public void setString(String address, String mail) {  
            System.out.println("1.静态内部类的带String型参数的非静态主法");  
            this.address = address;  
            this.mail = mail;  
        }  
        public void setInt(long phoneNum, int qq) {  
            System.out.println("2.静态内部类的带int型参数的非静态主法!");  
            this.phoneNum = phoneNum;  
            this.qq = qq;  
        }  
    }                            // 静态内部类结束  
    public void setValue() {             // 外部类访问静态内部类的静态成员：内部类.静态成员  
        InnerClass_2.getStatic();         // 访问静态内部类的静态方法  
        InnerClass_2 inner = new InnerClass_2();                 // 实例化对象  
        inner.setString("北京昌平区沙河镇", "yinjiping@sina.com");     // 访问静态内部类的非静态方法  
        inner.setInt(89653310, 313557706);  
        System.out.println("\n外部类访问静态内部类的结果如下：");  
        System.out.println("姓名：" + this.name);  
        System.out.println("住址：" + inner.address);  
        System.out.println("联系电话" + inner.phoneNum);  
        System.out.println("E-mail：" + inner.mail);  
        System.out.println("QQ号码：" + inner.qq);  
    }  
    public static void main(String[] args) {                        // java程序主入口处  
        StaticInternal sin = new StaticInternal();  
        sin.setValue();                                         // 调用方法  
    }  
} 
