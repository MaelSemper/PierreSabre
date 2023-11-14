package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argents;
	protected Humain memoire[] = new Humain[30];
	protected int nbConnaissance = 0;

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

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}

	private void repondre(Humain humain) {
		// TODO Auto-generated method stub
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		// TODO Auto-generated method stub

		boolean add = true;
		for (int i = 0; i < nbConnaissance; i++) {
			if (memoire[i] == humain) {
				add = false;
			}
		}
		if (add && nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}

		else if (add && nbConnaissance >= memoire.length) {
			for (int i = 0; i < memoire.length - 1; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[memoire.length-1] = humain;
		}

	}

	public void listerConnaissance() {
		String listeConnaissance = "Je connais beaucoup de monde ";
		if (nbConnaissance != 0) {
			listeConnaissance += "dont : ";
			for (int i = 0; i < nbConnaissance; i++) {
				listeConnaissance += memoire[i].getNom() + ", ";
			}
		}
		parler(listeConnaissance);
	}

	protected void gagnerArgent(int gain) {
		argents += gain;
	}

	protected void perdreArgent(int perte) {
		argents -= perte;
	}

	protected void parler(String txt) {
		System.out.println("\n" + txt);
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
