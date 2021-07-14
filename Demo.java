class Demo{   // TA
	 static public final void main(String[] args){
		I i = new I();
		R r = (R)i;
		System.out.println("go");
	}
}
class I{

}

class J{


}

class R extends I{


}

class Z extends R{

}