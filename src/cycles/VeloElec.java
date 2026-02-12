package cycles;
public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissance) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	
	public VeloElec(double diamRoue, double facteurPuissance) {
		super(diamRoue);
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double DEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		VeloElec.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur(){
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double facteurPuissance) {
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	
	public String toString() {
		return "VeloElec[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		System.out.println("---- Static ----");
		System.out.println(Velo.getDEFAUT_BRAQUET());
		System.out.println(VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		Velo.setDEFAUT_BRAQUET(6.0);
		VeloElec.setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(7.0);
		System.out.println(Velo.getDEFAUT_BRAQUET());
		System.out.println(VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		
		
		System.out.println("---- Getter ----");
		VeloElec vel1 = new VeloElec(10.0, 6.0, 50.0);
		System.out.println(vel1.getBraquet());
		System.out.println(vel1.getDiamRoue());
		System.out.println(vel1.getFacteurPuissanceMoteur());
		System.out.println(vel1.getPuissance(5.0));
		System.out.println(vel1);
	}
}