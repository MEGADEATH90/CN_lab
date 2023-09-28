package exp2;
import java.io.FileInputStream;

public class q3 {

	public static void main(String[] args) {
		try{    
            FileInputStream fin=new FileInputStream("C:\\Users\\E 555\\Desktop\\2141002013\\CN_EXP\\src\\exp2\\t.txt");    
//            int i=fin.read();  
//            System.out.print((char)i);    
//  
//            fin.close();  
            
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();
          }
          catch(Exception e)
          {
        	  System.out.println(e);
          }
		
	}

}
 
