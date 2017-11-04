package t1;

public class sss {
    public static void main(String[] args) {
		jj("ÄãÊÇa°¡sasdÊÀÉÏ", 6);
				
	}
    public static void jj(String as,int bs){
    	 int b =0;
    	 String c="";
    	for(int i=0;i<as.length();i++){
    		byte[] a = (as.charAt(i)+"").getBytes();
    		b=b+a.length;
    		if(b>bs){
    			break;
    		}
    		c= c+as.charAt(i);
    	}
    	System.out.println(c);
    }
}
