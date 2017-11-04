package t2;


import java.util.Scanner;

public class ReflectDemo2 {
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	    System.out.println("please input class");
	    Scanner sc = new Scanner(System.in); 
	    String className=sc.nextLine();
	    //根据输入的类名构建对象
        Class<?> c1=Class.forName(className);
        Object obj  = c1.newInstance();
        System.out.println(obj);
        sc.close();
        
       
        
     
   
   }
}
