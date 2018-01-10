package Map系列;

public interface Iterator<E> {
	boolean hasNext();
	
	E next();
	
	void remove();
	
}
