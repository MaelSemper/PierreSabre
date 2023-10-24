package personnages;

public class Commercants extends Humain {

	public Commercants(String nom, int argents) {
		super(nom, "the", argents);

		// TODO Auto-generated constructor stub
	}

	public int seFaireExtorquer() {
		parler("J ai tout perdu !");
		int argents = getArgents();
		this.perdreArgent(argents);
		return argents;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercie généreux donateur!");
	}
	
}
