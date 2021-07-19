class Demo{   // CR
	 static public final void main(String[] args){
		System.out.println("start");
		Paard p = new Shetlander();
		Shetlander s = (Shetlander)(Paard)p;

		
	}
}
abstract class Dier{
}
class Paard extends Dier implements Voortbewegen{
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