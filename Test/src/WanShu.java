
public class WanShu {

	public static void main(String[] args) {
		int a = 0;
		int i=2;
		for(; i<=10000; i++){
			for(int j=1; j<i; j++){
				if(i%j == 0){
					a =a+j;
							}
									}
			if(a==i){
				System.out.print(" "+a);
				a = 0;
					}else{a=0;}
						}
	}

}
