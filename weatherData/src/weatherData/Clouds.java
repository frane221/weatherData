package weatherData;

public class Clouds {
	
	private float all;
	
	public Clouds() {
		
	}

	public Clouds(float all) {
		super();
		this.all = all;
	}

	public float getAll() {
		return all;
	}

	public void setAll(float all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}
	
	
}
