package Map系列;


public interface Collection<E> extends 迭代遍历等.Iterable<E> {
	int size();
	
	boolean isEmpty();
	
	boolean contains(Object o);
	
	Iterator<E> iterator();//Iterable接口中已有，是否重复？
	
	Object[] toArray();
	
	<T> T[] toArray(T[] a);
	
	boolean add(E e);
	
	boolean remove(Object o);
	
	boolean containsAll(Collection<?> c);
	
	boolean addAll(Collection<? extends E> c);
	
	boolean removeAll(Collection<?> c);
	
	boolean retainAll(Collection<?> c);
	
	void clear();
	
	boolean equals(Object o);
	
	int hashCode();
	
	
}
