class Demo{   // RC
	 static public final void main(String[] args){
		System.out.println("start");
		H h = new H();
		D d = new D();
		h = d;
		h.lopen();
		System.out.println("eind");
	}
}
class W{
	void lopen(){
		System.out.println("lopen in W");
	}
}

class H extends W{
	void lopen(int a){
		System.out.println("lopen in Z");
	}
}

class D extends H{
	void lopen(){
		System.out.println("lopen in ZR");
	}
}