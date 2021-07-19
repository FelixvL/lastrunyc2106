class Demo{   // DL
	 static public final void main(String[] args){
		System.out.println("start");
		RRR rrr = new RRR();
		rrr.gaan(new QQQ().iets());		

		System.out.println("einde");

	}
}

class RRR{    
	DDD gaan(AAA a){ 
		System.out.println("b");         
		return new FFF();
	}
}
class DDD implements AAA{     
}
class FFF extends DDD{     
}
class QQQ{
	FFF iets(){
		System.out.println("a");
		return FFF();	
	}
}
interface AAA{     
}