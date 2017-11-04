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
    	 //通过类对象获得构造函数对象
    	 Constructor<?> con1=c1.getDeclaredConstructor(String.class);
    	 //通过构造函数对象构建类的对象
    	 Object ob1=con1.newInstance("望门");
    	 System.out.println(ob1);
    	 
    	
    	 Constructor<?> con2 = c1.getDeclaredConstructor(String.class,int.class);
    	 Object ob2 = con2.newInstance("今朝",20);
    	 System.out.println(ob2);
    	 
    	 //通过反射获得对象属性
    	 Field f1=c1.getDeclaredField("name");
    	 //设置私有属性可访问
    	 f1.setAccessible(true);
    	 //Field[] fs = c1.getDeclaredFields();
    	 //获得ob2对象的f1属性的值
    	 Object f1Value=f1.get(ob2);
    	 System.out.println(f1Value);
    	 //设置ob2对象的f1属性的值
    	 f1.set(ob2, "传奇");
    	 f1Value = f1.get(ob2);
    	 System.out.println(f1Value);
    	 
    	 
 	}

}
