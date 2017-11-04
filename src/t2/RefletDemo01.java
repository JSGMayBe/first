package t2;

import java.awt.Point;

class point{
	private int x;
	private int y;
}
public class RefletDemo01 {
      public static void main(String[] args) throws ClassNotFoundException {
          //编译时就已经确定会构建哪个类的对戏
    	  //这个过程我们称之为静态过程
    	  point p1 = new point();//类的实例（类的对象）
    	  
    	  //获取Point类的类对象
    	  Class<?> c1 = p1.getClass();
    	  Class<?> c2 = point.class;
    	  //重点记住如下类的加载方式
    	  Class<?> c3 = Class.forName("t2.point");
	      System.out.println(c1==c2);
	      System.out.println(c2==c3);
	      //FAQ 类加载时会有对应的加载器，如何发现此类对应的类加载器是谁？
	      ClassLoader loader = c3.getClassLoader();
	      System.out.println(loader);//AppClassLoader
	      ClassLoader pLoader=loader.getParent();
	      System.out.println(pLoader);//ExtClassLoader
	      ClassLoader ppLoader = pLoader.getParent();
	      System.out.println(ppLoader);//null(BootstartClassLoader)
	      
	      //各种加载器的职责（了解）
	      //1)BootStarpClassLoade (jdk/jre/;ina包红的jar文件)
	      //2)ExtClassLoader(jdk/jre/lib/ext包中的jar文件)
	      //3）AppClassLoader(自己写的类)
          //类加载器扩展：我们也可以自己定义类加载器（继承ClassLoader） 	      
      }
}
