package for循环系列;

public class ForTest {
	public void empty_condition(){
		int i=0;
		for(;;){
			System.out.println("for(;;)##");
			i++;
			if(i>10)
				break;
		}
	}
}
