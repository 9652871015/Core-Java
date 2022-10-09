class Flowers
{
String name;
String colour;
int nOP;
public Flowers(){//no arg constructor
	this.name="Rose";
	this.colour="pink";
	this.nOP=7;
}
public Flowers(String name,String colour,int nOP){//Constructor with arguments i.e (paramaterized constructor)
	this.name=name;
	this.colour=colour;
	this.nOP=nOP;
}
public void display()
	{
	System.out.println(this.name);
	System.out.println(this.colour);
	System.out.println(this.nOP);
	}
}

