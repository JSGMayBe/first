package t2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class student{
	private String name;
	private int age;
	public student(String name){
		this.name=name;
	}
	public student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
    	 Class<?> c1 = Class.forName("t2.student");
    	 //Object object = c1.newInstance();
    	 //ͨ��������ù��캯������
    	 Constructor<?> con1=c1.getDeclaredConstructor(String.class);
    	 //ͨ�����캯�����󹹽���Ķ���
    	 Object ob1=con1.newInstance("����");
    	 System.out.println(ob1);
    	 
    	
    	 Constructor<?> con2 = c1.getDeclaredConstructor(String.class,int.class);
    	 Object ob2 = con2.newInstance("��",20);
    	 System.out.println(ob2);
    	 
    	 //ͨ�������ö�������
    	 Field f1=c1.getDeclaredField("name");
    	 //����˽�����Կɷ���
    	 f1.setAccessible(true);
    	 //Field[] fs = c1.getDeclaredFields();
    	 //���ob2�����f1���Ե�ֵ
    	 Object f1Value=f1.get(ob2);
    	 System.out.println(f1Value);
    	 //����ob2�����f1���Ե�ֵ
    	 f1.set(ob2, "����");
    	 f1Value = f1.get(ob2);
    	 System.out.println(f1Value);
    	 
    	 
 	}

}
