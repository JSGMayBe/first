package t1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IOtest {
	public static void main(String[] args) {
		 try {
		/*	FileOutputStream fos = new FileOutputStream("io.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			PrintWriter pw = new PrintWriter(osw,true);
			char[]  c = new char[]{'a','b','c'}; 
			pw.println("吾心之所向");
			pw.println("为奥术之宝典");
			pw.println(c);
			pw.println("与其感慨路难行");
			pw.println("不如马上出发");
			pw.close();*/
			
			
			FileInputStream fis =new FileInputStream("io.txt");
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br =new BufferedReader(isr);
			String str = null;
			while((str=br.readLine())!=null){
				System.out.println(Integer.parseInt(str ));
			}
			br.close();
		 
		 /*Emp e = new Emp("李逍遥", "男", 24);	 
		 FileOutputStream fos = new FileOutputStream("emp.txt");
		 ObjectOutputStream os = new ObjectOutputStream(fos);
		 os.writeObject(e);
		 os.close();*/
		/* 
		 FileInputStream fis = new FileInputStream("emp.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 Emp emp=(Emp)ois.readObject();
		 System.out.println(emp);*/
			
		 } catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		 } catch (IOException e) {			
			e.printStackTrace();
			throw new RuntimeException("读取输出错误",e);
		} 
	
	    
	
	}
            
             
}
