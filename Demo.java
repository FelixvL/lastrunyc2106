class Demo{   // ZZ
	 static public final void main(String[] args) throws Exception{
		System.out.println("start");
		FFproberen ff = new Goedproberen();
		ff.wandelen();
		System.out.println("einde");
	}
}

class FFproberen{
	void wandelen() throws Exception{
		System.out.println("a");
	}
}

class Goedproberen extends FFproberen{
	void wandelen() throws Exception{
		System.out.println("b");
	}
}
