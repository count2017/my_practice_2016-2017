package Test112201;

public class ConsumerThread implements Runnable{
	private Administrator ad;
	private Goods goods;
	
	public ConsumerThread(Administrator ad, Goods goods) {
		super();
		this.ad = ad;
		this.goods = goods;
	}

	@Override
	public void run() {
		synchronized(goods){
			while(true){
				Storage.get(goods);
				System.out.println(ad.getName()+"您的商品"+goods.toString()+"已出库");
				if(Storage.lkl.peek() == null){
					try {
						goods.wait(18000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
