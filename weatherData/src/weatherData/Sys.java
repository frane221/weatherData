package weatherData;

public class Sys {
	
	 private Integer type;
	 private Integer id;
	 private String message;
	 private String country;
	 private Integer sunrise;
	 private Integer sunset;
	 
	 
	 
	public Sys() {
		
	}
	
	
	public Sys(Integer type, Integer id, String message, String country, Integer sunrise, Integer sunset) {
		super();
		this.type = type;
		this.id = id;
		this.message = message;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}


	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getSunrise() {
		return sunrise;
	}
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	public Integer getSunset() {
		return sunset;
	}
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}


	@Override
	public String toString() {
		return "Sys [type=" + type + ", id=" + id + ", message=" + message + ", country=" + country + ", sunrise="
				+ sunrise + ", sunset=" + sunset + "]";
	}
	 
	 

}
