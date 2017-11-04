package t3;

public class Thread_join {
	//标识图片是否在下载完毕
	private static boolean isFinish = false;
    public static void main(String[] args) {

		 Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片");
				for(int i=1;i<100;i++){
					System.out.println("down:"+i+"%");
				  try {
					Thread.sleep(50);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }	
				}
				System.out.println("down:下载完毕！");
				isFinish=true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片");
				//先等待下载线程
				/**
				 * 当show线程调用download线程的join方法时，show线程会进入
				 * 阻塞状态，知道download执行完毕才会解除阻塞继续执行
				 * 后续代码
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片没下载完呢");
				}
				System.out.println("show:图片显示完毕");
			}
		};
		
		download.start();
		show.start();
	}
}
