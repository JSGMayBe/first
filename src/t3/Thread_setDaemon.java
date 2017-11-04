package t3;

/**
 * 守护线程
 * 守护线程也称为后台线程
 * 默认创建出来的线程都是前台线程，若是要设置为后台线程可以通过线程提供的方法
 * setDaemon来完成
 * 使用上一样
 * 
 * 结束时机不同
 * 当一个进程结束，所有正在运行的后台线程都会强制结束，而进程的结束都是当前一个进程
 * 中所有前台线程都结束时结束
 * @author tarena
 *
 */
public class Thread_setDaemon {
    public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
			    for(int i=0;i<5;i++){
			    	System.out.println("rose:let me go");
			    	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    }
			    System.out.println("rose:啊啊啊啊啊");
			    System.out.println("");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					 System.out.println("jack:you jump i jump");
					 try {
						Thread.sleep(1000);
					 } catch (InterruptedException e) {
						// TODO Auto-generated catch block
					 	e.printStackTrace();
					 }
				 }
			}			
		};
		
		rose.start();
		/**
		 * 设置守护线程必须在线程启动前完成
		 */
		jack.setDaemon(true);
		jack.start();
		while(true){
			
		}
	}
}
