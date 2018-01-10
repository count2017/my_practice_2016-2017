package Map系列;


public abstract class AbstractMap<K,V> implements Map<K,V> {
	protected AbstractMap(){};
	
	public int size(){
		return entrySet().size();
	}
	
	public boolean isEmpey(){
		return size() == 0;
	}
	
	public boolean containsValue(Object value){
		Iterator<Entry<K,V>> i = entrySet().iterator();
		if(value == null){
			while(i.hasNext()){
				Entry<K,V> e = i.next();
				if(e.getValue() == null)
					return true;
 			}
		}else{
			while(i.hasNext()){
				Entry<K,V> e = i.next();
				if(value.equals(e.getValue()))
					return true;
 			}
		}
		return false;
	}
	
	public boolean conatainsKey(Object key){
		Iterator<Entry<K,V>> i = entrySet().iterator();
		if(key == null){
			while(i.hasNext()){
				Entry<K,V> e = i.next();
				if(e.getKey() == null)
					return true;
			}
		}else{
			while(i.hasNext()){
				Entry<K,V> e = i.next();
				if(key.equals(e.getKey()))
					return true;
			}
		}
		return false;
	}
	
	public V get(Object key){
		Iterator<Entry<K,V>> i = entrySet().iterator();
		if(key == null){
			while(i.hasNext()){
				Entry<K,V> e = i.next();
				if(e.getKey() == null)
					return e.getValue();
			}
		}else{
			while(i.hasNext()){
				Entry<K,V> e = i.next();
				if(key.equals(e.getKey()))
					return e.getValue();
 			}
		}
		return null;
	}
	
	//-----
	public V put(K k,V v){throw new UnsupportedOperationException();}
	
	public V remove(Object key){
		Iterator<Entry<K,V>> i = entrySet().iterator();
		Entry<K,V> correctEntry = null;
		if(key == null){
			while(correctEntry==null && i.hasNext()){
				Entry<K,V> e = i.next();
				if(e.getKey()==null)
					correctEntry = e;
			}
		}else{
			while(correctEntry==null && i.hasNext()){
				Entry<K,V> e = i.next();
				if(key.equals(e.getKey()))
				  correctEntry = e;
			}
		} 
		
		V oldValue = null;
		if(correctEntry != null){
			oldValue = correctEntry.getValue();
			i.remove();
		}
		return oldValue;
	}
	
	
	/*public void putAll(Map<? extends K,? extends V> m){
		for(Map.Entry<? extends K,? extends V> e : m.entrySet()){
			put(e.getKey(),e.getValue());
		}
	}*/
	 public void putAll(Map<? extends K, ? extends V> m) {
		//返回类型为Set<Map.Entry<K, V>>
		 Iterator<?> it = m.entrySet().iterator();
		 while(it.hasNext()){
			 @SuppressWarnings("unchecked")
			Map.Entry<K, V> map = (Map.Entry<K, V>) it.next();
			 put(map.getKey(),map.getValue());
		 }
    }
	
	 public void clear(){
		 entrySet().clear();
	}
	 
	 transient volatile Set<K> keySet = null;
	 transient volatile Collection<V> values = null;
	 
	 public Set<K> keySet(){
		 if(keySet == null){
			 keySet = new AbstractSet<K>(){
				 @Override
					public Iterator<K> iterator() {
						return new Iterator<K>() {
							private Iterator<Entry<K,V>> i = entrySet().iterator();

							@Override
							public boolean hasNext() {
								// TODO Auto-generated method stub
								return i.hasNext();
							}

							@Override
							public K next() {
								// TODO Auto-generated method stub
								return i.next().getKey();
							}

							@Override
							public void remove() {
								// TODO Auto-generated method stub
								i.remove();
							}
						};
					}

					@Override
					public int size() {
						// TODO Auto-generated method stub
						return AbstractMap.this.size();
					}
					
					public boolean isEmpty(){
						return AbstractMap.this.isEmpty();
					}
					
					public void clear(){
						AbstractMap.this.clear();
					}
					
					public boolean contains(Object k){
						return AbstractMap.this.conatainsKey(k);
					}
			 };
		 }
		 return keySet;
	 }
	 
//	public abstract Set<Entry<K,V>> entrySet();
	 
	 public Collection<V> values(){
		 if(values==null){
			 values = new AbstractCollection<V>(){
				 public Iterator<V> iterator(){
					 return new Iterator<V>(){

						@Override
						public boolean hasNext() {
							// TODO Auto-generated method stub
							return false;
						}

						@Override
						public V next() {
							// TODO Auto-generated method stub
							return null;
						}

						@Override
						public void remove() {
							// TODO Auto-generated method stub
							
						}
						 
					 };
				 }

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return AbstractMap.this.size();
				}
			 };
		 }
	 }
	
	
}
