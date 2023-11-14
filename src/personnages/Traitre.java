package personnages;

import java.security.PublicKey;
import java.util.Random;

public class Traitre extends Samourai {
	private int nivTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFavorite, int argents) {
		super(seigneur, nom, boissonFavorite, argents);
		// TODO Auto-generated constructor stub
	}

	private void ranconner(Commercants commercant) {
		if (nivTraitrise >= 3) {
			nivTraitrise++;
		}
	}

	private void faireLeGentil() {
		Random r = new Random();
		if (nbConnaissance != 0) {
			int i = r.nextInt(nbConnaissance - 1);
			donner();
		}
	}
}
