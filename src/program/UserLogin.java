package program;

import java.util.Scanner;

public class UserLogin {
	Scanner sc = new Scanner(System.in);
	String userid = "pivotAdmin";
	String password = "Admin123";
	String entereduserid;
	String enteredpassword;
	int attempts = 1;
	int maxattempts = 4;

	void validateUseridAndPassword() {
		while (attempts<=maxattempts) {
			System.out.println("login attempt number:"+ attempts);
			System.out.println("enter the userid");
			userid = sc.next();
			System.out.println("enter the password");
			password = sc.next();
			
			if (userid.equals(entereduserid) && password.equals(enteredpassword)) {
				System.out.println("You are logged in to the application");
				break;
			}
			else
				{
				attempts++;
				if(attempts==maxattempts){
					System.out.println("account locked");
					break;
				}
			System.out.println("incorrect userid and password");

		}
			
				
				}
				
					
				}
			}
		

				
	
