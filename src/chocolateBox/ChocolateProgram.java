package chocolateBox;

public class ChocolateProgram{
	
	int maxchocolate;
	int existingchocolate;
	int addinglimitofchocolate;
	
	
	void addChocolateInTheBox() {
	while(existingchocolate<=maxchocolate) {
	existingchocolate+=addinglimitofchocolate;
	
	if(existingchocolate>maxchocolate) {
	System.out.println("box is full cant add more chocolate");
	break;	
	}
	
	System.out.println("number of chocolate"+ existingchocolate);
	}
	
}
}
