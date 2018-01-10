package List嵌套;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class NurseForm {
	private Object[][] mapS = new String[10][6];
	
	public static final int GROUP_NUM = 6;
	public static final int SURVER_ITEM = 10;
	public List<ArrayList<HashMap<String, String>>> list =
			new LinkedList<ArrayList<HashMap<String,String>>>();
	HashMap<String,String> map = new HashMap<String,String>();
	ArrayList<HashMap<String,String>> innerList = new ArrayList<HashMap<String,String>>();
	/*List<ArrayList<HashMap<String, String>>>*/
	public NurseForm() {
		super();
		// TODO Auto-generated constructor stub
		/*for(int i=0;i<SURVER_ITEM;i++){
			this.innerList.add(map);
		}
		for(int i=0;i<GROUP_NUM;i++){
			this.list.add(innerList);
		}*/
	}
	public List<ArrayList<HashMap<String, String>>> getList() {
		return list;
	}
	public void setList(List<ArrayList<HashMap<String, String>>> list) {
		this.list = list;
	}
	
	public Object[][] getMapS() {
		return mapS;
	}
	public void setMapS(Object[][] mapS) {
		this.mapS = mapS;
	}
	@Override
	public String toString() {
		return "NurseForm [list=" + list + ", map=" + map + ", innerList=" + innerList + "]";
	}
	
}	
