package test;

public class LvhuoSon extends LvhuoKing {

	public LvhuoSon(String name, int size, int age) {
		super(name, size, age);		
	}
	void dota(){
		System.out.println("中路刷符了!");
	}
	
	public static void main(String[] args){
		LvhuoSon ls = new LvhuoSon("鹏少儿", 188, 16);
		LvhuoKing lk = new LvhuoKing("鹏少爷",216,26);
		ls.dodonkeyfires();
		ls.dota();
		System.out.println(ls.getName()+","+ls.getSize()+","+ls.getAge()+"\n属性:屌");
		System.out.println(lk.getName()+","+lk.getSize()+","+lk.getAge()+"\n属性:更屌");
	}

}
