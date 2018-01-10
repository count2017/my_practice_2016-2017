import java.util.Scanner;
public class SuShu {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,m,i,j,k;
		m = 2;
		 a = sc.nextInt();
		 k = a;
		for(i=1; i<=a; i++){
		
			if( k==1 || k==2){
				System.out.println(k);
				break;
			       }else{
			    for(j=2; j<i; j++){
			    	m++;
			    	if(i%j != 0){
			    		while(m==i){System.out.print("  "+i);}
			    		continue;
			    		}else{
			    					break;
			    				}
			    					}	   
			    	   
			       		}
			
							}
	}
}
