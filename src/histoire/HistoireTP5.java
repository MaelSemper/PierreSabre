package histoire;
import personnages.*;

public class HistoireTP5 {

	
	public static void main(String[] args) {
		Commercants marco = new Commercants("Marco", 20);
		Commercants chonin = new Commercants("Chonin", 40);
		Commercants kumi = new Commercants("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "Shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(akimoto);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		akimoto.listerConnaissance();
	}
}
