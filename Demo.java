class Demo{   // CA
	 static public final void main(String[] args){
		System.out.println("start");
		Repairable r = new Car();
		Vehicle v = (Repairable) r;
		v.repair();
		System.out.println("end");

	}
}



class Car extends Vehicle{
	public void repair(){
		System.out.println("repair in Car");
	}
}
class Vehicle{
	public void repair(){
		System.out.println("repair in Vehicle");
	}
}

interface Repairable{
	void repair();
}