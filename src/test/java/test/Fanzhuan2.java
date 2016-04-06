package test;

public class Fanzhuan2
{

	public static void main(String[] args)
	{
		String str = "kay bro";
		String[] array = str.split("\\s");
		for(int i = array.length-1;i>=0;i--){
			System.out.print(array[i]+" ");
		}
	}

}
