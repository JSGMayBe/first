package t3;

/**
 * �ػ��߳�
 * �ػ��߳�Ҳ��Ϊ��̨�߳�
 * Ĭ�ϴ����������̶߳���ǰ̨�̣߳�����Ҫ����Ϊ��̨�߳̿���ͨ���߳��ṩ�ķ���
 * setDaemon�����
 * ʹ����һ��
 * 
 * ����ʱ����ͬ
 * ��һ�����̽����������������еĺ�̨�̶߳���ǿ�ƽ����������̵Ľ������ǵ�ǰһ������
 * ������ǰ̨�̶߳�����ʱ����
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
			    System.out.println("rose:����������");
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
		 * �����ػ��̱߳������߳�����ǰ���
		 */
		jack.setDaemon(true);
		jack.start();
		while(true){
			
		}
	}
}
