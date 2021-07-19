class Demo{   // DD
	 static public final void main(String[] args){
		System.out.println("start");
		HHH h = new QQQ();
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
class QQQ extends HHH{
	void proberen(){
		System.out.println("gaat ook fout");
	}
}