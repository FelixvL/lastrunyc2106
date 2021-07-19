class Demo{   // DI
	 static public final void main(String[] args){
		System.out.println("start");
		JJJ j = new QQQ();
		HHH h = (HHH)j;
		h.jjj();
	}
}


abstract class HHH implements JJJ{
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
	void jjj(){
		System.out.println("Dit gaat mwa");
	}
}
interface JJJ{
	default void jjj(){
		System.out.println("Dit gaat goed");
	}
}