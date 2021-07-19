class Demo{   // ZF
	 static public final void main(String[] args){
		System.out.println("start");
		FFproberen ff = new Goedproberen();
		ff.go().wandelen();
		System.out.println("einde");
	}
}

class FFproberen{   
	void wandelen(){
		System.out.println("a");
	}
	FFproberen go(){   
		return new FFproberen();  
	}
}

class Goedproberen extends FFproberen{   
	void wandelen(){
		System.out.println("b");
	}
}
