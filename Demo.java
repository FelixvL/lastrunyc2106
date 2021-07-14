class Demo{   // SA
	 static public final void main(String[] args){
		Iets i = new Nope();
		i.anders();
		System.out.println("bye");
	}
}

abstract class Iets{
	void anders(){
		System.out.println("anders");
	}
	
}

class Dus extends Iets{
	void anders(){
		System.out.println("dus anders");
		return;
	}
}

class Nope extends Iets{

}