package 谷歌Gson;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.gson.Gson;

public class Test01 {

	public static void main(String[] args) {
		//创建Gson实例
		Gson gson = new Gson();
		int[] numbers = {1,2,3,4,5,6,9,8,45,4};
		String str = gson.toJson(numbers);
		System.out.println("str类型是否为String:"+( str instanceof String));
		System.out.println("gson.toJson(str):"+str);
		/*通过gson将Map类型数据转换为json格式*/
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("k1", new Date());
		map.put("k2", new User("小明","123"));
		String s2 = gson.toJson(map);
		System.out.println("map.toString():"+map.toString());
		System.out.println("gson.toJson(map):"+s2);
		/*通过gson将List类型转换为json格式*/
		List<Map<String,Object>> list = new LinkedList<Map<String,Object>>();
		map.clear();
		map.put("l1", new Random().nextInt(255));
		map.put("l2", new User("小花","789"));
		list.add(map);
		map.clear();
		map.put("k1", "我是String对象");
		map.put("k2", new User("小狗","abc"));
		list.add(map);
		String s3 = gson.toJson(list);
		System.out.println("list.toString():"+list.toString());
		System.out.println("gson.toJson(list):"+s3);
		/*反转：将转换后的json格式还原*/
		System.out.println("list.toString():"+list.toString());
		System.out.println("原数组中下标为5的数字为："+gson.fromJson(str,int[].class)[5]);
		System.out.println("还原后的list："+gson.fromJson(s3, new LinkedList<HashMap<String,User>>().getClass()));
		
	}

}
