package addOrReduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by lenovo on 2017-08-29.
 */
public class Test02 {
	private int[] s = {1,2,3,4};
	
    @Override
	public String toString() {
		return "Test02 [s=" + Arrays.toString(s) + "]";
	}
	/*判断区间是否符合要求*/
    private static boolean judgeSection(int count){
        boolean flag = false;
        return flag;
    }
    /*
     * 将加、减号插入到1-9中
     * **/
    private static String insertSymbol(){
    	String end = null;
    	String add = "+",reduce = "-";
    	LinkedList<String> begin = new LinkedList<String>();
    	/*
    	 *赋初值
    	 **/
    	for(int i=1;i<=9;i++){
    		begin.add(String.valueOf(i));
    	}
    	/*
    	 *插入符号
    	 **/
    	for(int i=1;i<=6;i++){
    		begin.add(i,add);
    	}
        Iterator it = begin.iterator();
        while(it.hasNext()){
        	
        }
    	
    	
    	
    	return end;
    }
    
    /*分割算术表达式，求和*/
    private static int sum(String math_string){
    	String[] addStrArray = math_string.split("\\+");
        int addSum = 0,reduceSum = 0;
        for (int i=0;i<addStrArray.length;i++){
            String[] reduceStrArray = null;
            int reduceIndex = addStrArray[i].indexOf("-");
            if(reduceIndex < 0){
                addSum += Integer.parseInt(addStrArray[i]);
            }
            if(addStrArray[i].length() > 2){
                 reduceStrArray = addStrArray[i].split("\\-");
                 reduceSum += 2*Integer.parseInt(reduceStrArray[0]);
                for (int j=0;j<reduceStrArray.length;j++) {
                    reduceSum -= Integer.parseInt(reduceStrArray[j]);
                }
            }
        }
         return addSum + reduceSum;
    }
    /**/
    private static void findRestult(){
        int[] a = {1,2,3,4,5,6,7,8,9};
        String as = "12+3456789";
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(15);
         /**/
        /*6<= addCount <7*/
        int addCount = 0;
        int reduceCount = 0;


        Iterator<Integer> it = result.iterator();

    }
    public static void main(String[] agrs){
        findRestult();
        String end = null;
    	String add = "+",reduce = "-";
    	LinkedList<String> begin = new LinkedList<String>();
    	/*
    	 *赋初值
    	 **/
    	for(int i=1;i<=9;i++){
    		begin.add(String.valueOf(i));
    	}
    	/*
    	 *插入符号
    	 **/
    	boolean flag = true;
		int symbolsum = 0,index = 1;
		while(flag){
			++symbolsum;
				begin.add(index, add);
				index += 2;
			if(symbolsum > 6){flag=false;  break;}
		}
        Iterator it = begin.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }
    }
}
