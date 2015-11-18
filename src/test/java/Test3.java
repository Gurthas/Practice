/*判断101-200之间有多少个素数，并输出所有素数*/
package test;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count=0;
         for(int i=101;i<200;i++){
        	   boolean b= true;
               for(int j=2;j<=Math.sqrt(i);j++){
            	  if(i%j==0){
            	  b =false;
         }
          
        	 }
               if(b==true){
            	   count++;
            	   System.out.println("Count:"+count+"-----"+i);
            	  
               }
         }
	}

}
