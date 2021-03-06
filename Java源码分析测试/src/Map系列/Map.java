package Map系列;


public interface Map<K,V> {
	int size();
	
	boolean isEmpty();
	
	boolean containsKey(Object key);
	
	boolean containsValue(Object value);
	
	V get(Object key);
	
	V put(K key,V value);
	
	V move(Object key);
	
	void putAll(Map<? extends K,? extends V> m);
	
	void clear();
	
	Set<K> keySet();
	
	Collection<V> values();
	
	Set<Map.Entry<K, V>> entrySet();
	
	boolean equals(Object o);
	
	int hashCode();
	
	interface Entry<K,V>{
		K getKey();
		
		V getValue();
		
		V setValue(V value);
		
		boolean equals(Object o);
		
		int hashCode();
	}
	
}
