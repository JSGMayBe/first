package t1;

import java.util.Random;
import java.util.Scanner;

public class maoPaoDemo {
     public static void main(String[] args) {
		int[] a=sz();
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
        /*		
        for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int b=0;
				if( a[i]>a[j]){
					b= a[i] ;
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		*/
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
				    int b = a[j];
				    a[j] = a[j+1];
				    a[j+1]=b;
				}
			}
		}
		
		
		System.out.println();
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
		
		
		
		
	}
     public static int[] sz(){
    	Scanner scanner = new Scanner(System.in);
     	Random rd = new Random();
 		System.out.println("输入数组长度");
 		int ip = Integer.parseInt(scanner.nextLine());
     	int[]  a = new int[ip];
 		
 		for(int i=0;i<ip;i++){
 			a[i]=rd.nextInt(100);
 			System.out.println(a[i]);
 		}
 		return a;
     }
}
