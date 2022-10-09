class Employee 
{
	
	String eName;
	String eId;
	private double sal;
	public Employee(String eName,String eId,double sal){
	this.eName=eName;
	this.eId=eId;
	if(sal>=5000.0){
	this.sal=sal;
		}
		else{
			System.out.print("enter the right salary");
			}
	}
			public void setSal(double sal){
				if(sal>=5000.0){
				this.sal=sal;
		}
		else{
			System.out.print("enter the right salary");
			}
			}
			public double getSal(){
				return this.sal;
                 }
}
