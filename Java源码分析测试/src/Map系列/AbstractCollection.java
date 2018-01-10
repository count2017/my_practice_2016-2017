package Map系列;

import java.lang.reflect.Array;
import java.util.Arrays;


public abstract class AbstractCollection<E> implements Collection<E>{
	
	//sole constructor
	protected AbstractCollection(){}
	//
	
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	public abstract Iterator<E> iterator();
	
	public abstract int size();
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public boolean contains(Object o){
		Iterator<E> it = iterator();
		if(o==null){
			while(it.hasNext()){
				if(it.next()==null)
					return true;
			}
		}else{
			while(it.hasNext()){
				if(o.equals(it.next()))
					return true;
				
			}
		}
		return false;
	}
	
	
	public Object[] toArray(){
		Object[] r = new Object[size()];
		Iterator<E> it = iterator();
		for (int i = 0; i < r.length; i++) {
			if(!it.hasNext()){
				return Arrays.copyOf(r, i);
			}
			r[i] = it.next();
		}
		return it.hasNext() ? finishToArray(r,it) : r;
	}
	
	public <T> T[] toArray(T[] a){
		int size = size();
		T[] r = a.length >= size ? a :
			(T[]) Array.newInstance(a.getClass().getComponentType(), size);
		Iterator<E> it = iterator();
		for(int i=0;i < r.length;i++){
			if(! it.hasNext()){
				if(a != r)
					return Arrays.copyOf(r, i);
				r[i] = null;
				return r;
			}
			r[i] = (T) it.next();
		}
		return it.hasNext() ? finishToArray(r, it) : r;
	}
	
	
	private static <T> T[] finishToArray(T[] r,Iterator<?> it){
		int i = r.length;
		while(it.hasNext()){
			int cap = r.length;
			if(i==cap){
				int newCap = cap + (cap>>1) + 1;
				if(newCap - MAX_ARRAY_SIZE > 0){
					newCap = hugeCapacity(cap + 1);
				}
				r = Arrays.copyOf(r, newCap);
			}
			r[i++] = (T) it.next();
		}
		return (i == r.length)? r : Arrays.copyOf(r,i);
	}

	
	private static int hugeCapacity(int minCapacity){
		if(minCapacity < 0){
			throw new OutOfMemoryError("数组容量不够");
		}
		return (minCapacity > MAX_ARRAY_SIZE ? Integer.MAX_VALUE : MAX_ARRAY_SIZE);
	}
	
	
	public boolean add(E e){
		throw new UnsupportedOperationException();
	}
	
	public boolean remove(Object o){
		Iterator<E> it = iterator();
		if(o==null){
			while(it.hasNext()){
				if(it.next()==null)
					it.remove();
				return true;
			}
		}else{
			while(it.hasNext()){
				if(o.equals(it.next()))
					it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean containsAll(Collection<?> c){
//		for(Object e:c)
		Iterator<?> it = c.iterator();
		while(it.hasNext()){
			if(contains(it.next()))
				return true;
		}
		return false;
	}
	
	public boolean addAll(Collection<? extends E> c){
		boolean modified = false;
		Iterator<E> it = (Iterator<E>) c.iterator();
		while(it.hasNext()){
			if(add(it.next()))
				modified = true;
		}
		return modified;
	}
	
	public boolean removeAll(Collection<?> c){
		boolean modified = false;
		Iterator<?> it = iterator();
		while(it.hasNext()){
			if(c.contains(it.next())){
				it.remove();
				modified = true;
			}
		}
		return modified;
	}
	
	public boolean retainAll(Collection<?> c){
		boolean modified = false;
		Iterator<E> it = iterator();
		while(it.hasNext()){
			if(!c.contains(it.next())){
				it.remove();
				modified = true;
			}
		}
		return modified;
	}
	
	public void clear(){
		Iterator<E> it = iterator();
		while(it.hasNext()){
			it.next();
			it.remove();
		}
	}
	
	public String toString(){
		Iterator<E> it = iterator();
		if(!it.hasNext()){
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(;;){
			E e = it.next();
			sb.append(e==this ? "(this collection)" : e);
			if(!it.hasNext()){
				return sb.append(']').toString();
			}
			sb.append(',').append(' ');
		}
	}
	
}
