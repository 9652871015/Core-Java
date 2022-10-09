class Clock 
{
	private int hr;
	private  int min;
	private int sec;
	public Clock(int hr,int min,int sec){
		if((hr>=1&&hr<=12)&&(min>=0&&min<=59)&&(sec>=0&&sec<=59))
		{
			this.hr=hr;
			this.min=min;
			this.sec=sec;
		}
		else{
			System.out.print("enter the right time");
		}
}
public void setHr(int hr){
if(hr>=0&&hr<=12){
this.hr=hr;
}else{
System.out.print("Enter the Correct Validation");
}
}
public void setMin(int min)
{
if(min>=0&&min<=59){
this.min=min;
}else{
System.out.print("Enter the correct validation");
}
}
public void setSec(int sec)
{
if(sec>=0&&sec<=59){
this.sec=sec;
}else{
System.out.print("Enter the right Validation");
}
}
public int getHr(){
	return this.hr;
}
	public int getMin(){
	return this.min;
	}
	public int getSec(){
		return this.sec;
	}
	public void display(){
	System.out.println(this.hr);
		System.out.println(this.min);
			System.out.println(this.sec);
			}
}