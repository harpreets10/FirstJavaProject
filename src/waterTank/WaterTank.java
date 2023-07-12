package waterTank;

public class WaterTank {
	int waterLevel;
	int maxCapacity;
	int maxFillCapacity;
	int fillAmount;

	void WaterTankCapcity() {
		while (waterLevel <= maxFillCapacity) {
			waterLevel += fillAmount;
			

			if (waterLevel>maxFillCapacity) {
				System.out.println("water tank reach to the maxfillcapacity of" + maxFillCapacity);

				break;
			}
			System.out.println("water tank filled" + waterLevel + "L OF Water");
		}
	}

}
