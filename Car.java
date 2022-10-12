class Car {
	String cN;
	double tS;
	Engine engine;
	public Car(String cN,double tS,Engine engine){
		this.cN=cN;
		this.tS=tS;
		this.engine=engine;
	}
	public void displayCar(){
	this.engine.displayEngine();
	System.out.println("rita going to gutta");}

}

