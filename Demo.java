class Demo{   // DM
	 static public final void main(String[] args){
		System.out.println("start");
		RRR rrr = new RRR();
		rrr.gaan(new QQQ().iets());		
		System.out.println("einde");
	}
}
class RRR{    
	DDD gaan(DDD a){ 
		System.out.println("b"); 
		a.checken();
		System.out.println(a.check);        
		return new FFF();
	}
}
class DDD implements AAA{  
	int check = 8; 
	public void checken(){
		System.out.println("in d");
	}  
}
class FFF extends DDD{  
	int check = 9;
	public void checken(){
		System.out.println("in f");
	}    
}
class QQQ{
	AAA iets(){
		System.out.println("a");
		return new FFF();	
	}
}
interface AAA{  
	void checken();   
}