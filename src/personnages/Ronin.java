package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argents) {
		super(nom, boissonFavorite, argents);
		// TODO Auto-generated constructor stub
	}

	public void donner(Commercants beneficiaire) {
		int donnation = getArgents() / 10;
		parler(beneficiaire.getNom() + " prends ces " + donnation + " sous");
		beneficiaire.recevoir(donnation);
	}

	public void provoquer(Yakuza yak) {
		int force = honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= yak.getReputation()) {
			honneur++;
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(yak.perdre());

		} else {
			int argent = getArgents();
			honneur--;
			perdreArgent(argent);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			yak.gagner(argent);
		}
	}
}
