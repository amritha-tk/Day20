public class SampleClass{
int id,age;
String name,dept,company;
private double salary;
//Constructor
public SampleClass()
{
 company="ABC";
 System.out.println("Constructor called");
}
//Parameterised Constructor
private SampleClass(int age){
 this.age=age;
 System.out.println("Parameterised Constructor");
 System.out.println("Age : "+age);
}

void display(){
 System.out.println("Employee id " +id);
 System.out.println("Employee name " +name);
 System.out.println("Employee dept " +dept);
}


public double pay(double x,double y){
 salary=x*y;
 return salary;
}

public static void main(String args[]){
	String welcome="Welcome to the program";
	System.out.println(welcome);
        SampleClass sc=new SampleClass();
        sc.id=100;
        sc.name="Amritha";
        sc.dept="IT Software";
        sc.display();

        SampleClass sc1=new SampleClass(24);

        System.out.println ("Company :" +sc.company);
        double sal=sc.pay(60.90,344.90);
        System.out.println("Salary is "+sal);

}
}

