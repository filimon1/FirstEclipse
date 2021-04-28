
public class JavaIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class is where we write and create our codes 
		
		// Package: Name of a folder that contains or organizes the same classes 
		
		// E.g Login Page, Forogt Password, Forgot username, Sign up
		
		// FirstName(ColumnName) varchar(10)(DataType), age int, date, ....insert into tablanName values ( "tim", "Mike"...
		
		// Variable (ColumnName) : Is the name of a location to store data. 
		
		// How do we create variables 
		// dataType variableName; 
		// dataType variableName=value; 
		
		// Rules of Variables 
		//1. You can't a digit
		//int 2age;
		//2. You can't have space
		//int age 2;
		//3. you can't with special characters except for $
		//int $ge;
		
		// Data Types 
		//1. int 2. string 3. float 4. date
		
		//create a variable called gender and store Female 
		
		// while statement ( In SQL it is where condition) 
		//Forumla while (expression e.g age>12) { system.out.println("Whatever we want" + age);
		                 // age++;
		
		
		int age=9; //10 //11 //12
		while (age<=12) {
			System.out.println("Age is less than 12 = " + age);
			age++;
		}
		
		// variableName year= 1990 - 2020 
		
		//1st time check 9 <12 True "Age is less than 12" 9 
		
		// If condition 
		
		int x=9;
		int y=3;
		
		// x value is greater than y value then say x is greater 
		if(x!=y) {
			System.out.println("equal ");
		} else
			System.out.println("not equal ");

		short zipcode=33;
		short zip=50;
		
		
	}

}
