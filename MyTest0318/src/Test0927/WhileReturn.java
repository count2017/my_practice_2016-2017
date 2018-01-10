package Test0927;

public class WhileReturn {
	public boolean beOrNot(int i,int j){
		if(i>50){
			while(true){
				if(j==3){
//					break;
					System.out.println("up is right");
					return true;
				}else{
					System.out.println("up##");
				}
				j--;
			}
//			System.out.println("dfj");
		}else{
			while(j>0){
				if(j==5){
					System.out.println("down##");
					return true;
				}
				j--;
			}
		}
		return false;
	}
}
