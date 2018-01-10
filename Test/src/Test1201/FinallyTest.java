package Test1201;

public class FinallyTest  
{
	public static void main(String[] args) {
		 
		System.out.println(new FinallyTest().test());;
	}

	static int test()
	{
		int x = 1;
		try
		{
			x = x++;
			return x;
		}
		finally
		{
			++x;
		}
	}
}
