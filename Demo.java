class Demo{   // CP
	 static public final void main(String[] args){
		System.out.println("start");
		Voortbewegen v = new Shetlander();
		Hond h = (Hond)v;
	}
}
abstract class Dier implements Voortbewegen{
}
class Paard extends Dier{
	public int snelheid(){
		System.out.println("snelheid in paard");
		return 7;
	}
}
class Shetlander extends Paard{
	public int snelheid(){
		System.out.println("snelheid in shetland");
		return 5;
	}
}
class Hond extends Dier{
	public int snelheid(){
		System.out.println("snelheid in hond");
		return 3;
	}
}
interface Voortbewegen{
	int snelheid();
}