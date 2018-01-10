package Test112201;

public class ProducerThread implements Runnable {
	private Administrator ad;
	private Goods goods;

	public ProducerThread(Administrator ad, Goods goods) {
		super();
		this.ad = ad;
		this.goods = goods;
	}

	@Override
	public void run() {
		synchronized (goods) {
			while(true){
				Storage.save(goods);
				System.out.println(ad.getName()+"的货物已入库");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				goods.notifyAll();
			}
		}
		
	}
	
}
