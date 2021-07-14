class Demo{   // RG
	 static public final void main(String[] args){
		System.out.println("start");
		W w = new W();
		H h = new D();
		h.lopen(5);
		w.lopen().lopen(5);
		System.out.println("eind");
	}
}
class W{
	D lopen(){
		return new D();
	}
}

class H extends W{
	void huppakee(int a){
		System.out.println("lopen in Z");
	}
}

class D extends H{
	void lopen(int w){
		System.out.println("lopen in ZR");
	}
}