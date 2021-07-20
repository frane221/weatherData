package weatherData;

import org.codehaus.jackson.annotate.JsonProperty;

public class Rain {
	
	@JsonProperty("1h")
	private double oneHour;
	@JsonProperty("3h")
	private double threeHour;
	
	public Rain() {
		
	}

	public Rain(double oneHour, double threeHour) {
		super();
		this.oneHour = oneHour;
		this.threeHour = threeHour;
	}

	public double getOneHour() {
		return oneHour;
	}

	public void setOneHour(double oneHour) {
		this.oneHour = oneHour;
	}

	public double getThreeHour() {
		return threeHour;
	}

	public void setThreeHour(double threeHour) {
		this.threeHour = threeHour;
	}

	@Override
	public String toString() {
		return "Rain [oneHour=" + oneHour + ", threeHour=" + threeHour + "]";
	}
	
	
	
}
