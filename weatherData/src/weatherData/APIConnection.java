package weatherData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;




public class APIConnection {
	
	private URL url;
	private String grad;
	private final String APPID = "4ac75d269c0e3405e84555377fa34bb3";
	private HttpURLConnection connection;
	private BufferedReader in;
	
	public APIConnection(String grad) {
		super();
		this.grad = grad;
	}
	
	
	
	public URL getUrl() {
		return url;
	}



	public void setUrl(URL url) {
		this.url = url;
	}



	public String getGrad() {
		return grad;
	}



	public void setGrad(String grad) {
		this.grad = grad;
	}



	public HttpURLConnection getConnection() {
		return connection;
	}



	public void setConnection(HttpURLConnection connection) {
		this.connection = connection;
	}



	public String getAPPID() {
		return APPID;
	}



	public BufferedReader getIn() {
		return in;
	}



	public void setIn(BufferedReader in) {
		this.in = in;
	}



	public void spojiSeNaAPI(){
		try {
		url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+grad+"&units=metric&lang=hr&appid="+APPID);
		connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(100000);
		connection.setReadTimeout(100000);
		connection.setRequestMethod("GET");
		int status = connection.getResponseCode();
		System.out.println(status);
		}
		
		catch(ProtocolException e) {
			e.printStackTrace();
		}
		
		catch(MalformedURLException c) {
			c.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public DataDB dohvatiDataDB() throws Exception {
		
			in = new BufferedReader(
					  new InputStreamReader(connection.getInputStream()));
					String inputLine;
					StringBuffer content = new StringBuffer();
					while ((inputLine = in.readLine()) != null) {
					    content.append(inputLine);
					}
			
			System.out.println(content);
			Data data = new Data().jsonToObject(content.toString());
			DataDB dataDB = new DataDB().dataUDataDB(data);
			System.out.println(dataDB);
			return dataDB;
			}
}


