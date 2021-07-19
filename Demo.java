class Demo{   // ZG
	 static public final void main(String[] args){
		System.out.println("start");
		FFproberen ff = new Goedproberen();
		ff.wandelen();
		ff.go().wandelen();
		System.out.println("einde");
	}
}

class FFproberen{   
	void wandelen(){
		System.out.println("a");
	}
	FFproberen go(){   
		return new Goedproberen();  
	}
}

class Goedproberen extends FFproberen{   
	void wandelen(){
		System.out.println("b");
	}
}
