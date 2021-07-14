class Demo{   // RX
	 static public final void main(String[] args){
		System.out.println("start");
		H h = new H();
		D d = new D();
		d.lopen();
		System.out.println("eind");
	}
}


class H{
	void lopen(int a){
		System.out.println("lopen in U");
	}
}

class D extends H{
	void lopen(){
		System.out.println("lopen in UR");
	}
}