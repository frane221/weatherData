package weatherData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	
	private String URL;
	private String username;
	private String password;
	private Connection conn;
	private String imeTablice;
	
	
	public DBConnection(String URL, String username, String password, String imeTablice) {
		super();
		this.URL = URL;
		this.username = username;
		this.password = password;
		this.imeTablice =imeTablice;
	}
	
	

	public String getURL() {
		return URL;
	}



	public void setURL(String uRL) {
		URL = uRL;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Connection getConn() {
		return conn;
	}



	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public String getImeTablice() {
		return imeTablice;
	}



	public void setImeTablice(String imeTablice) {
		this.imeTablice = imeTablice;
	}



	public void spojiSeNaDB() {
		 try {
			 conn = DriverManager.getConnection(
	                URL, username, password);
	        	

	            if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
	            
	            
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	            }
		
	}
	
	public void upisiUDB(DataDB dataDB) {
	
		String query = "insert into " + imeTablice + "(idmjesto, nazivmjesto, opisvremena, prosjecnatemp,"
			+ "mintemp, maxtemp, tlak, vlaznostzrakapost, kisa1h, snijeg1h) VALUES(?,?,?,?,?,?,?,?,?,?) ON conflict (idmjesto) do " +
			" UPDATE set nazivmjesto = ?, opisvremena = ?, prosjecnatemp = ?, "
			+ "mintemp = ?, maxtemp = ?, tlak = ?, vlaznostzrakapost = ?, kisa1h = ?, snijeg1h= ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, dataDB.getIdMjesto());
			ps.setString(2, dataDB.getNazivMjesto());
			ps.setString(3, dataDB.getOpisVremena());
			ps.setDouble(4, dataDB.getProsjecnaTemp());
			ps.setDouble(5, dataDB.getMinTemp());
			ps.setDouble(6, dataDB.getMaxTemp());
			ps.setInt(7, dataDB.getTlak());
			ps.setDouble(8, dataDB.getVlaznostZraka());
			ps.setDouble(9, dataDB.getkisa1h());
			ps.setDouble(10, dataDB.getsnijeg1h());
			ps.setString(11, dataDB.getNazivMjesto());
			ps.setString(12, dataDB.getOpisVremena());
			ps.setDouble(13, dataDB.getProsjecnaTemp());
			ps.setDouble(14, dataDB.getMinTemp());
			ps.setDouble(15, dataDB.getMaxTemp());
			ps.setInt(16, dataDB.getTlak());
			ps.setDouble(17, dataDB.getVlaznostZraka());
			ps.setDouble(18, dataDB.getkisa1h());
			ps.setDouble(19, dataDB.getsnijeg1h());
			ps.executeUpdate();
		}
		catch (SQLException e) {
		e.printStackTrace();
		e.getSQLState();
		}	

	}
	
}

