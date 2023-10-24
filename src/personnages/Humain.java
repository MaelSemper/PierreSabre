package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argents;

	public Humain(String nom, String boissonFavorite, int argents) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argents = argents;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m appelle " + nom + " et j aime boire " + boissonFavorite);
	}

	public void boire() {
		parler("Hmmm un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argents >= prix) {
			parler("J ai " + argents + " sous en poche. Je vais pour voir m offrir " + bien + " a " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("J n ai plus que " + argents + " sous en poche. Je ne vais meme pas puvoir m offrir " + bien + " a "
					+ prix + " sous");
		}
	}

	public void gagnerArgent(int gain) {
		argents += gain;
	}

	public void perdreArgent(int perte) {
		argents -= perte;
	}

	protected void parler(String txt) {
		System.out.println("\n"+txt);
	}

	public String getNom() {
		return nom;
	}

	public int getArgents() {
		return argents;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
