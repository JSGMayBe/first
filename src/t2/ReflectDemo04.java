package t2;

import java.lang.reflect.Method;

class Teacher{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class ReflectDemo04 {
     public static void main(String[] args) throws Exception {
	    Class<?> c1= Class.forName("t2.Teacher");	
	    Object obj1=c1.newInstance();
	    //ͨ��������÷�������
	    Method m1=c1.getDeclaredMethod("setName", String.class);
	    //ִ�з�������(��ִ̬��)
	    //ִ��obj1�����m1����������Ϊ�����ɡ�
	    Object result=m1.invoke(obj1, "����");
	    
	    Method m2 = c1.getDeclaredMethod("getName");
	    //ִ��obj1�����m2����
	    result=m2.invoke(obj1);
	    System.out.println(result);
     }
}
