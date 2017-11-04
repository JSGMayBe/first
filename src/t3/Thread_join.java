package t3;

public class Thread_join {
	//��ʶͼƬ�Ƿ����������
	private static boolean isFinish = false;
    public static void main(String[] args) {

		 Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ");
				for(int i=1;i<100;i++){
					System.out.println("down:"+i+"%");
				  try {
					Thread.sleep(50);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }	
				}
				System.out.println("down:������ϣ�");
				isFinish=true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ");
				//�ȵȴ������߳�
				/**
				 * ��show�̵߳���download�̵߳�join����ʱ��show�̻߳����
				 * ����״̬��֪��downloadִ����ϲŻ�����������ִ��
				 * ��������
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬû��������");
				}
				System.out.println("show:ͼƬ��ʾ���");
			}
		};
		
		download.start();
		show.start();
	}
}
