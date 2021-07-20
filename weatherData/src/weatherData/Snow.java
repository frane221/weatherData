package weatherData;

import org.codehaus.jackson.annotate.JsonProperty;

public class Snow {
	@JsonProperty("1h")
	private double oneHour;
	@JsonProperty("3h")
	private double threeHour;
	
	public Snow() {
		
	}

	public Snow(double oneHour, double threeHour) {
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
		return "Snow [oneHour=" + oneHour + ", threeHour=" + threeHour + "]";
	}
	
	

}
