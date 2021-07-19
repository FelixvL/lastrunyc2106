class Demo{   // DJ
	 static public final void main(String[] args){
		System.out.println("start");
		RRR rrr = new RRR();
		AAA a = rrr.gaan(new FFF());
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