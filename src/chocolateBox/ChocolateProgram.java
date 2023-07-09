package chocolateBox;

public class ChocolateProgram{
	
	
	int chocolate;
	void addChocolateInTheBox() {
	while(chocolate<=63) {
	chocolate+=5;
	System.out.println("number of chocolate"+ chocolate);
	
	if(chocolate==63) {
	System.out.println("box is full with 63 chocolate");
	break;	
	}
	
	
	}
	
}
}
