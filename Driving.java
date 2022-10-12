class  Driving
{
	public static void main(String[] args) 
	{
Car car =new Car("tata",20.0,new Engine(20.0));
car.displayCar();
car.engine.displayEngine();
	}
}
