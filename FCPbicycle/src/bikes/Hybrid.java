package bikes;

import main.Database;

public class Hybrid extends Bicycle {

	private int noOfGears;
	private boolean hasBasket;

	public Hybrid(int noOfGears,String model,String colour,int frameSize,int wheelSize,String frameComposition,Database database,
			double costPrice, double salePrice) {

		super(model,colour, frameSize, wheelSize, frameComposition,database, costPrice, salePrice);
		this.noOfGears = noOfGears;
	}

	public boolean isHasBasket() {
		return hasBasket;
	}

	public void setHasBasket(boolean hasBasket) {
		this.hasBasket = hasBasket;
	}
	

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public void Display() {

	}
}
