class Demo{   // SC
	 static public final void main(String[] args){
		Iets i = new Nope();
		i.anders();
		System.out.println(i.a);
		System.out.println("bye");
	}
}

abstract class Iets{
	int a = 3;
	void anders(){
		System.out.println("anders");
	}
	void worden();
	
}

class Dus extends Iets{
	int a = 4;
	void anders(){
		System.out.println("dus anders");
		return;
	}
	void worden(){
		System.out.println("Dus worden");
	}
}

class Nope extends Iets{
	int a = 5;
	void worden(){
		System.out.println("Nope worden");
	}
}