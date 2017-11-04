package t1;

public class A {
	public A(){
		b BB = new b();
	}
      private class b{
    	  public b(){
    		  System.out.println("b");
    	  }
      }
      public static void main(String[] args) {
		 A a = new A();
		 
	}
}
