package weatherData;

public class DataDB {
	
	private Integer idMjesto;
	private String nazivMjesto;
	private String opisVremena;
	private double prosjecnaTemp;
	private double minTemp;
	private double maxTemp;
	private Integer tlak;
	private Integer vlaznostZraka;
	private double kisa1h;
	private double snijeg1h;
	
	public DataDB(Integer idMjesto, String nazivMjesto, String opisVremena, double prosjecnaTemp, double minTemp,
			double maxTemp, Integer tlak, Integer vlaznostZraka, double kisa1h, double snijeg1h) {
		super();
		this.idMjesto = idMjesto;
		this.nazivMjesto = nazivMjesto;
		this.opisVremena = opisVremena;
		this.prosjecnaTemp = prosjecnaTemp;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.tlak = tlak;
		this.vlaznostZraka = vlaznostZraka;
		this.kisa1h = kisa1h;
		this.snijeg1h = snijeg1h;
	}

	
	public DataDB() {
	}


	public Integer getIdMjesto() {
		return idMjesto;
	}
	public void setIdMjesto(Integer idMjesto) {
		this.idMjesto = idMjesto;
	}
	public String getNazivMjesto() {
		return nazivMjesto;
	}
	public void setNazivMjesto(String nazivMjesto) {
		this.nazivMjesto = nazivMjesto;
	}
	public String getOpisVremena() {
		return opisVremena;
	}
	public void setOpisVremena(String opisVremena) {
		this.opisVremena = opisVremena;
	}
	public double getProsjecnaTemp() {
		return prosjecnaTemp;
	}
	public void setProsjecnaTemp(double prosjecnaTemp) {
		this.prosjecnaTemp = prosjecnaTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public Integer getTlak() {
		return tlak;
	}
	public void setTlak(Integer tlak) {
		this.tlak = tlak;
	}
	public Integer getVlaznostZraka() {
		return vlaznostZraka;
	}
	public void setVlaznostZraka(Integer vlaznostZraka) {
		this.vlaznostZraka = vlaznostZraka;
	}

	
	public double getkisa1h() {
		return kisa1h;
	}

	public void setkisa1h(double kisa1h) {
		this.kisa1h = kisa1h;
	}

	public double getsnijeg1h() {
		return snijeg1h;
	}

	public void setsnijeg1h(double snijeg1h) {
		this.snijeg1h = snijeg1h;
	}
 
	public DataDB dataUDataDB(Data data) {
		
		return new DataDB(data.getId(),data.getName(),data.getWeather().get(6),data.getMain().getTemp(),
				data.getMain().getTemp_min(),data.getMain().getTemp_max(),data.getMain().getPressure(),
				data.getMain().getHumidity(), data.getRain()==null ? 0.0 : data.getRain().getOneHour(),
						data.getSnow()==null ? 0.0 : data.getSnow().getOneHour());
	}
	
	

	@Override
	public String toString() {
		return "DataDB [idMjesto=" + idMjesto + ", nazivMjesto=" + nazivMjesto + ", opisVremena=" + opisVremena
				+ ", prosjecnaTemp=" + prosjecnaTemp + ", minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", tlak="
				+ tlak + ", vlaznostZraka=" + vlaznostZraka + ", kisa1h=" + kisa1h + ", snijeg1h=" + snijeg1h + "]";
	}
	
	

}
