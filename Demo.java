class Demo{   // RE
	 static public final void main(String[] args){
		System.out.println("start");
		W w = new W();
		w.lopen().lopen(5);
		System.out.println("eind");
	}
}
class W{
	H lopen(){
		return new D();
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