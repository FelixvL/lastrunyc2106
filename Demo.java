class Demo{   // CJ
	 static public final void main(String[] args){
		System.out.println("start");
		Repairable r = new Car();
		Vehicle v = (Car) r;
		v.repair();
		System.out.println("end");

	}
}



class Car extends Vehicle {    
	public void repair(int a){
		System.out.println("repair in Car");
	}
}
class Vehicle implements Repairable{   
	public void repair(){
		System.out.println("repair in Vehicle");
	}
}

interface Repairable{      
}

