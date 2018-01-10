public class PingFangShu {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for(int i=2; i<=100000; i++){
			for(int j=1; j<i; j++){
				a = i*i-j*j;
				if(a==168){
					b = j*j-100;
					System.out.println(b);
				}
									}
								}
	}

}
