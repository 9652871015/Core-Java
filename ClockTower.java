class ClockTower 
{
	String loc;
	double height;
	Clocks clocks;
	public ClockTower(String loc,double height,Clocks clocks){
	this.loc=loc;
	this.height=height;
	this.clocks=clocks;
	}
	public void displayClockTower() 
	{
		this.clocks.displayClock();
		System.out.println("Hello World@@@@@@@@@@@@@@@@@@@@!");
	}
}
