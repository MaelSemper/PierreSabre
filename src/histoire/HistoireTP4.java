package histoire;
import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Mwa","Coca",50);
		prof.direBonjour();
		prof.acheter("un avion", 45);
		prof.acheter("un truc", 20);
		
		Commercants terry = new Commercants("Terry",400);
		terry.direBonjour();
		
		Yakuza yaku = new Yakuza("Yaku", "sake", 150, "Mandatory");
		
		Ronin roro = new Ronin("roro", "eau", 83);
		
		yaku.extorquer(terry);
		
		roro.donner(terry);
		
		roro.provoquer(yaku);

	}

}
