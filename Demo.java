class Demo{   // TE
	 static public final void main(String[] args){
		P p = new S();
		B b = new B();
		b = p;
		B bb = new B();
		P pp = new P();
		pp = bb;
		System.out.println("Einde");
	}
}
class P{

}

class T{


}

class B extends P{


}

class S extends B{

}