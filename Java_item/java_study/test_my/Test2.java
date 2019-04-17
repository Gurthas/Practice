/*
*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小
*兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总
*数为多少？
**/
package test;

public class Test2 {
	
	public static int r(int x){
		if(x==1||x==2){
			return 1;
		}
		else{
			return r(x-1)+r(x-2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=12;i++){
          System.out.println("Month:"+i+"----Count:"+r(i));
        }
        
	}

}
