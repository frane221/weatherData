package weatherData;

public class Main {
	private double temp;
	private double feels_like;
	private double temp_min;
	private double temp_max;
	private Integer pressure;
	private Integer humidity;
	private double sea_level;
	private double grnd_level;
	
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public double getSea_level() {
		return sea_level;
	}
	public void setSea_level(double sea_level) {
		this.sea_level = sea_level;
	}
	public double getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(double grnd_level) {
		this.grnd_level = grnd_level;
	}
	public Main(double temp, double feels_like, double temp_min, double temp_max, Integer pressure, Integer humidity,
			double sea_level, double grnd_level) {
		super();
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}

	public Main() {
		
	}
	@Override
	public String toString() {
		return "Main [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max=" + temp_max
				+ ", pressure=" + pressure + ", humidity=" + humidity + "]";
	}
	
	
}
