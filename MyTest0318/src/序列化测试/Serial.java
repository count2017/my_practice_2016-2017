package 序列化测试;

import java.io.Serializable;

public class Serial implements Serializable {
	/** * */
	private static final long serialVersionUID = 6977402643848374753L;
	int id;
	String name;
	public int age=18;

	public Serial(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "DATA: " + id + " " + name;
	}
}