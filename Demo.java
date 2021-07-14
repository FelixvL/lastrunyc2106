class Demo{   // RY
	 static public final void main(String[] args){
		System.out.println("start");
		H h = new H();
		D d = new D();
		h.lopen();
		System.out.println("eind");
	}
}


class H{
	void lopen(int a){
		System.out.println("lopen in T");
	}
}

class D extends H{
	void lopen(){
		System.out.println("lopen in TR");
	}
}