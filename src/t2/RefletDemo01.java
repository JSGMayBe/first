package t2;

import java.awt.Point;

class point{
	private int x;
	private int y;
}
public class RefletDemo01 {
      public static void main(String[] args) throws ClassNotFoundException {
          //����ʱ���Ѿ�ȷ���ṹ���ĸ���Ķ�Ϸ
    	  //����������ǳ�֮Ϊ��̬����
    	  point p1 = new point();//���ʵ������Ķ���
    	  
    	  //��ȡPoint��������
    	  Class<?> c1 = p1.getClass();
    	  Class<?> c2 = point.class;
    	  //�ص��ס������ļ��ط�ʽ
    	  Class<?> c3 = Class.forName("t2.point");
	      System.out.println(c1==c2);
	      System.out.println(c2==c3);
	      //FAQ �����ʱ���ж�Ӧ�ļ���������η��ִ����Ӧ�����������˭��
	      ClassLoader loader = c3.getClassLoader();
	      System.out.println(loader);//AppClassLoader
	      ClassLoader pLoader=loader.getParent();
	      System.out.println(pLoader);//ExtClassLoader
	      ClassLoader ppLoader = pLoader.getParent();
	      System.out.println(ppLoader);//null(BootstartClassLoader)
	      
	      //���ּ�������ְ���˽⣩
	      //1)BootStarpClassLoade (jdk/jre/;ina�����jar�ļ�)
	      //2)ExtClassLoader(jdk/jre/lib/ext���е�jar�ļ�)
	      //3��AppClassLoader(�Լ�д����)
          //���������չ������Ҳ�����Լ���������������̳�ClassLoader�� 	      
      }
}
