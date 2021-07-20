package weatherData;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
public class Data {
	
	private Coord coord;
	private List<String> weather;
	private String base;
	private Main main;	
	private Integer visibility;
	private Wind wind;
	private Clouds clouds;
	private Rain rain;
	private Snow snow;
	private Integer dt;
	private Sys sys;
	private Integer timezone;
	private Integer id;
	private String name;
	private Integer cod;

	
	
	public Data(Coord coord, List<String> weather, String base, Main main, Integer visibility, Wind wind, Clouds clouds,
			Integer dt, Sys sys, Integer timezone, Integer id, String name, Integer cod, Rain rain, Snow snow) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
		this.rain = rain;
		this.snow = snow;
	}

	
	public Data() {
		
	}
	
	
	public Coord getCoord() {
		return coord;
	}


	public void setCoord(Coord coord) {
		this.coord = coord;
	}


	public List<String> getWeather() {
		return weather;
	}


	public void setWeather(List<String> weather) {
		this.weather = weather;
	}


	public String getBase() {
		return base;
	}


	public void setBase(String base) {
		this.base = base;
	}


	public Main getMain() {
		return main;
	}


	public void setMain(Main main) {
		this.main = main;
	}


	public Integer getVisibility() {
		return visibility;
	}


	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}


	public Wind getWind() {
		return wind;
	}


	public void setWind(Wind wind) {
		this.wind = wind;
	}


	public Clouds getClouds() {
		return clouds;
	}


	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}


	public Integer getDt() {
		return dt;
	}


	public void setDt(Integer dt) {
		this.dt = dt;
	}


	public Sys getSys() {
		return sys;
	}


	public void setSys(Sys sys) {
		this.sys = sys;
	}


	public Integer getTimezone() {
		return timezone;
	}


	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getCod() {
		return cod;
	}


	public void setCod(Integer cod) {
		this.cod = cod;
	}


	public Rain getRain() {
		return rain;
	}


	public void setRain(Rain rain) {
		this.rain = rain;
	}


	public Snow getSnow() {
		return snow;
	}


	public void setSnow(Snow snow) {
		this.snow = snow;
	}


	@Override
	public String toString() {
		return "Data [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main + ", visibility="
				+ visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys + ", timezone="
				+ timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + ", rain=" + rain + ", snow=" + snow
				+ "]";
	}


	public Data jsonToObject(String Json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(Json, Data.class);
	}
	
	


	

		
	}
