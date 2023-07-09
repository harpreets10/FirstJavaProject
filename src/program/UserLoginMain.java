package program;

import java.util.Scanner;

public class UserLoginMain {

	public static void main(String[] args) {
	UserLogin validate=new UserLogin();
	Scanner sc = new Scanner(System.in);
	validate.i=0;
	validate.password= "Admin123";
	validate.userid= "pivotAdmin";
	System.out.println("enter the userid");
	validate.entereduserid=sc.next();
	System.out.println("enter the password");
	validate.enteredpassword=sc.next();
	validate.validateUseridAndPassword();
	
	
	

	}

}
