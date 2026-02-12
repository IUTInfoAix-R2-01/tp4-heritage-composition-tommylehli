package cycles;
import java.util.Random;
public class Velo{
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public static void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET) {
		Velo.DEFAUT_BRAQUET = DEFAUT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
		diamRoue = 5.0;
	}
	
	public Velo() {
		braquet = DEFAUT_BRAQUET;
		diamRoue = 5.0;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public String toString() {
		return "Velo[braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	
	public static void main(String[] args) {
		Velo test = new Velo();
		System.out.println(test);
		System.out.println(Velo.getDEFAUT_BRAQUET());
		System.out.println(test.getGenAlea());
		System.out.println(test.getPuissance(3.0));
	}

	
}