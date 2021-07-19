class Demo{   // CL
	 static public final void main(String[] args){
		Dier dier = new Shetlander();
		System.out.println(dier.snelheid());
		Dier dier1 = new Hond();
		System.out.println(dier1.snelheid());
	}
}
class Dier implements Voortbewegen{

}
class Paard extends Dier{
	int snelheid(){
		System.out.println("snelheid in paard");
		return 7;
	}
}
class Shetlander extends Paard{
	int snelheid(){
		System.out.println("snelheid in shetland");
		return 5;
	}
}
class Hond extends Dier{
	int snelheid(){
		System.out.println("snelheid in hond");
		return 3;
	}
}
interface Voortbewegen{
	int snelheid();
}