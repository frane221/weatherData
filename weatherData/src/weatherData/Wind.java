package weatherData;

public class Wind {
	
	private Integer speed;
	private Integer deg;
	private String gust;
	
	public Wind() {
		
	}


	public Wind(Integer speed, Integer deg, String gust) {
		super();
		this.speed = speed;
		this.deg = deg;
		this.gust = gust;
	}

	public String getGust() {
		return gust;
	}

	public void setGust(String gust) {
		this.gust = gust;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getDeg() {
		return deg;
	}

	public void setDeg(Integer deg) {
		this.deg = deg;
	}


	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
	}
	
	

}
