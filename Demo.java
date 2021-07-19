class Demo{   // DA
	 static public final void main(String[] args){
		System.out.println("start");
		HHH h = new OOO();
		h.proberen();
	}
}


abstract class HHH{
	void proberen(){
		System.out.println("proberen in HHH");
	}
}

class OOO extends HHH{

}