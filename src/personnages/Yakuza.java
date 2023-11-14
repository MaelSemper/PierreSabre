package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argents, String clan) {
		super(nom, boissonFavorite, argents);
		this.clan = clan;
	}

	public void extorquer(Commercants victime) {
		reputation++;
		String nom = victime.getNom();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?\n " + nom
				+ " si tu tiens a la vie donne moi ta bourse !\n ");
		int argent = victime.seFaireExtorquer();
		gagnerArgent(argent);
		parler("J’ai piqué les " + argent + " sous de " + nom + ", ce qui me fait " + getArgents()
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
		int argent = getArgents();
		perdreArgent(argent);
		reputation--;
		parler("J’ai perdu mon duel et mes " + getArgents() + " sous, snif... J'ai déshonoré le clan de " + clan);
		return argent;
	}

	public void gagner(int gain) {
		reputation++;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan "+ clan+" Je l'ai dépouillé de ses "+gain+" sous");
	}

	public int getReputation() {
		// TODO Auto-generated method stub
		return reputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan);
	}
	
}
