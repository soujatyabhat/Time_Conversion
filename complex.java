import java.util.Scanner;
class com {
	double real,img;
	void get_data()
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter real and img number : ");
		real = obj.nextInt();
		img = obj.nextInt();
	}
	com calculate(com obj_one , com obj_two)
	{
		com temp = new com();
		temp.real = obj_one.real + obj_two.real;
		temp.img = obj_one.img + obj_two.img;
		return temp;
	}
}
class complex  
{
	public static void main(String obj[])
	{
		com pop_one = new com();
		com pop_two = new com();
		com sum = new com();
		com add = new com();
		pop_one.get_data();
		pop_two.get_data();
		add = sum.calculate(pop_one,pop_two);
		System.out.print("Result is : " + add.real + "+" + add.img + "i");
	}
}
