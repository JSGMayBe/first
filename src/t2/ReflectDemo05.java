package t2;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo05 {
	public static void main(String[] args) throws Exception {
		 List<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 //list.add(100);//不能这么做  编译期运行
		 //通过动态调用将100写入
		 Class<?> class1= list.getClass();
		 Method m = class1.getDeclaredMethod("add", Object.class);
		 m.invoke(list, 100);
		 System.out.println(list );
	}
   
    
}
