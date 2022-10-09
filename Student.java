class Student 
{
String name;
double tp;
double twp;
double dp;
public Student(String name,double tp){
	this.name=name;
	this.tp=tp;
}
public Student(String name,double tp,double twp){
	this(name,tp);
	this.twp=twp;
}
public Student(String name,double tp,double twp,double dp){
this(name,tp,twp);
this.dp=dp;
}
public void display(){
		System.out.println(this.name);
	System.out.println(this.tp);

	if(this.twp!=0){
	System.out.println(this.twp);

	if(this.dp!=0)
	System.out.println(this.dp);
}
}
}
