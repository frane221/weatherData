package weatherData;
import java.util.*;
public class Vrijeme {
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite URL servera baze podataka, username, lozinku i ime tablice u koju se podaci spremaju"
				+ " odvojene zarezom: ");
		String [] loginDB = sc.nextLine().split(",");
		System.out.println("Upisite gradove za koje vam je potrebna prognoza odvojene zarezom: ");
		String podaci = sc.nextLine();
		String [] gradovi = podaci.split(",");
		System.out.println("Odaberite interval osvježavanja podataka u sekundama: ");
		int interval = sc.nextInt()*1000;
		sc.close();
		DBConnection connectionDB = new DBConnection(loginDB[0],loginDB[1],loginDB[2],loginDB[3]);
		connectionDB.spojiSeNaDB();
		System.out.println(gradovi);
		for(String grad : gradovi) {
			MyThread dretva = new MyThread(grad,interval, connectionDB);
			dretva.start();
			}
		}
}
		
		

