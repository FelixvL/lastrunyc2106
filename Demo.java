class Demo{   // SK
	 static public final void main(String[] args){
		Iets i = new Dus();
		i.anders();
		System.out.println(i.a);
		i = new Nope();
		i.anders();
		System.out.println(i.a);
		System.out.println("bye");
	}
}
abstract class Iets{
	int a = 3;
	void anders(){
		System.out.println("anders"+a);
	}
	abstract void worden();	
}
class Dus extends Iets{
	int a = 4;
	void anders(){
		System.out.println("dus anders"+a);
		return;
	}
	void worden(){
		System.out.println("Dus worden"+a);
	}
}
class Nope extends Iets{
	int a = 5;
	void worden(){
		System.out.println("Nope worden"+a);
	}
}