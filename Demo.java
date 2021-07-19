class Demo{   // DK
	 static public final void main(String[] args){
		System.out.println("start");
		RRR rrr = new RRR();
		rrr.gaan(new AAA());		

		System.out.println("einde");

	}
}

class RRR{    
	DDD gaan(AAA a){          
		return new FFF();
	}
}

class DDD implements AAA{     

}
class FFF extends DDD{     

}
interface AAA{     

}