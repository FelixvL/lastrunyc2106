class Demo{   // DC
	 static public final void main(String[] args){
		System.out.println("start");
		OOO h = new OOO();
		h.proberen();
	}
}


abstract class HHH{
	abstract void proberen();
}

class OOO extends HHH{
	protected void proberen(){
		System.out.println("dit gaat fout");
	}
}