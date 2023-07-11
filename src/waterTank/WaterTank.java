package waterTank;

public class WaterTank {
	int capacity;
	int maxcapacity;
	int maxfillcapacity;
	int fillamount;
	
	void WaterTankcapcity() {
	while(capacity<=maxfillcapacity) {
	capacity+=fillamount;
	System.out.println("water tank filled" + capacity +"L OF Water");
	
	if(capacity==maxfillcapacity){
	System.out.println("water tank reach to the maxfillcapacity of"+ maxfillcapacity);
	
	break;
	}
	}
	}
	
	
		
	}
	
	



	
	


