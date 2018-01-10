package List嵌套;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	private static NurseForm init(NurseForm nurseForm){
		List<ArrayList<HashMap<String, String>>> list = new LinkedList<ArrayList<HashMap<String, String>>>();
		ArrayList<HashMap<String, String>> innerList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<String,String>();
		for(int i=0;i<NurseForm.GROUP_NUM;i++){
			for(int j=0;j<NurseForm.SURVER_ITEM;j++){
				map.put("m"+i+j, ""+i+j);
				innerList.add(j,map);
				map.clear();
			}
			System.out.println(innerList);
			list.add(i,innerList);
			innerList.clear();
		}
		nurseForm.setList(list);
		return nurseForm;
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		NurseForm nf = new NurseForm();
		NurseForm nff = init(nf);
//		System.out.println(nf);
		System.out.println(nff.toString());
		System.out.println(nff.getList().size());
//	
		System.out.println(nff.getList().get(0).size());
	}

}
