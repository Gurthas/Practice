package testjava;

public class Test4 {

	/**
	 * 输出9*9口诀
	 */
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
				
			}
			    System.out.println();
		}

	}

}
