class Demo{   // CF
	 static public final void main(String[] args){
		System.out.println("start");
		Repairable r = new Car();
		Vehicle v = (Car) r;
		v.repair();
		System.out.println("end");

	}
}



class Car extends Vehicle {    // Paard
	public void repair(){
		System.out.println("repair in Car");
	}
}
class Vehicle implements Repairable{   // Dier
	public void repair(){
		System.out.println("repair in Vehicle");
	}
}

interface Repairable{      // Categoriseerbaar
	void repair();
}

// Pokemonkaarten      // Categoriseerbaar