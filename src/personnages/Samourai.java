package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur,String nom, String boissonFavorite, int argents) {
		super(nom, boissonFavorite, argents);
		this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
		parmer("qu est ce que je vais choisir comme boisson ? Tiens je vais prendre du "+boisson);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+seigneur);
	}
	
}
