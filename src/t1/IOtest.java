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
			pw.println("����֮����");
			pw.println("Ϊ����֮����");
			pw.println(c);
			pw.println("����п�·����");
			pw.println("�������ϳ���");
			pw.close();*/
			
			
			FileInputStream fis =new FileInputStream("io.txt");
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br =new BufferedReader(isr);
			String str = null;
			while((str=br.readLine())!=null){
				System.out.println(Integer.parseInt(str ));
			}
			br.close();
		 
		 /*Emp e = new Emp("����ң", "��", 24);	 
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
			throw new RuntimeException("��ȡ�������",e);
		} 
	
	    
	
	}
            
             
}
