class UserLogic 
{
	public static void main(String[] args) 
	{
		Employeee e1=new Employeee();
		e1.working();
		e1.eating();
			e1.sleeping();
			Human h1=new Human();
			h1.sleeping();
			h1.eating();
		//	h1.working(); cte because human class cannot access properties of employee class
	}
}
