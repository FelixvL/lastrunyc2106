class Demo{   // RU
	 static public final void main(String[] args){
		System.out.println("start");
		H h = new D();
		D d = new D();
		h = d;
		d.lopen();
		System.out.println("eind");
	}
}


class H{
	void lopen(){
		System.out.println("lopen in U");
	}
}

class D extends H{
	void lopen(){
		System.out.println("lopen in UR");
	}
}