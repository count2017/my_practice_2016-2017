package Test1122;

public class Tickets {
	private String order;
	private int num;
	private String date;
	public Tickets() {
		super();
	}
	public Tickets(String order, int num, String date) {
		super();
		this.order = order;
		this.num = num;
		this.date = date;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + num;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tickets other = (Tickets) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (num != other.num)
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tickets [order=" + order + ", num=" + num + ", date=" + date + "]";
	}
	public static Tickets[] generate(int number){
		Tickets t[] = new Tickets[number];
		for(int i = 0; i <number ; i++){
		 t[i]  = new Tickets("k1024",i,"2016-11-22");
	 }
		return t;
	}
	
}
