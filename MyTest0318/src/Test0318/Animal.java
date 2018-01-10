package Test0318;

import java.util.Map;
import java.util.Map.Entry;

public class Animal {
	private String name;
	private String color;
	private Map<String,Animal> map;
	private Animal kitty;
	Entry tab[];
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Animal(String name, String color, Map<String, Animal> map) {
		super();
		this.name = name;
		this.color = color;
		this.map = map;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", map=" + map + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Map<String, Animal> getMap() {
		return map;
	}
	public void setMap(Map<String, Animal> map) {
		this.map = map;
	}
	public Animal getKitty() {
		return kitty;
	}
	public void setKitty(Animal kitty) {
		this.kitty = kitty;
	}
	
	void run(){
		 for (Entry<String,String> e = tab[5], prev = null ; e != null ; prev = e, e = e) {}
	}
	
	
	
}
