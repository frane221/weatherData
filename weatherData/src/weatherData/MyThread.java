package weatherData;

public class MyThread extends Thread{
	
	private String mjesto;
	private Integer intervalms;
	private DBConnection connectionDB;
	
	
	
	
	public MyThread(String mjesto, Integer intervalms, DBConnection connectionDB) {
		super();
		this.mjesto = mjesto;
		this.intervalms=intervalms;
		this.connectionDB=connectionDB;
	}


	public String getMjesto() {
		return mjesto;
	}


	public void setMjesto(String mjesto) {
		this.mjesto = mjesto;
	}
	
	


	@Override
	public void run() {
		try {
			DataDB dataDb;
			while(true) {
			APIConnection connection = new APIConnection(mjesto);
			connection.spojiSeNaAPI();
			dataDb = connection.dohvatiDataDB();
			connectionDB.upisiUDB(dataDb);
			Thread.sleep(intervalms);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
