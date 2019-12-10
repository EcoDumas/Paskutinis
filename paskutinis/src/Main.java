import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	//darbininkas,detale,kiekis,kaina//
	public static void main(String[] args) {
		cechas darbuotojas0 = new cechas("Matas", "Ratas", 500, 0.50);
		cechas darbuotajas1 = new cechas("Linas", "Guma", 200, 0.75);
		cechas darbuotojas2 = new cechas("Renatas", "Slangute", 375, 0.35);
		cechas darbuotojas3 = new cechas("Aidas", "Reduktorius", 444, 3);
		cechas darbuotojas4 = new cechas("Kestis", "Generatorius", 135, 5.55);
		cechas darbuotojas5 = new cechas("Deividas", "Stiklas", 224, 0.65);
		cechas darbuotojas6 = new cechas("Sarunas", "Laidai", 1001, 1);
		cechas darbuotojas7 = new cechas("Tadas", "Lempute", 555, 110);
		cechas darbuotojas8 = new cechas("Andrius", "Akumuliatorius", 55, 30);
		cechas darbuotojas9 = new cechas("Kipras", "Raktas", 5, 125);

		ArrayList<cechas> sarasas = new ArrayList<>();
		sarasas.add(darbuotojas0);
		sarasas.add(darbuotajas1);
		sarasas.add(darbuotojas2);
		sarasas.add(darbuotojas3);
		sarasas.add(darbuotojas4);
		sarasas.add(darbuotojas5);
		sarasas.add(darbuotojas6);
		sarasas.add(darbuotojas7);
		sarasas.add(darbuotojas8);
		sarasas.add(darbuotojas9);

		System.out.println("Obejktu sarasas:");
		System.out.println(sarasas);
		//darbo dienos suvestine //

		System.out.println("Pagamintu detaliu kiekis:");//suma*kiekis//
		for (cechas i : sarasas) {
			double suma = i.getKaina() * i.getKiekis();
			System.out.println("Detale:" + i.getDetale() + ", kiekis:" + i.getKiekis() + ", suma:" + suma);
		}

		//Bendra darubuotuoju dienos suvestini pagal kieki//

		System.out.println("---------------");
		System.out.println("Suvestine pagal pagamintu detaliu kieki(nuo max iki min): ");
		Collections.sort(sarasas);
		Iterator<cechas> norma = sarasas.iterator();
		while (norma.hasNext()) {
			cechas zmogus = norma.next();

			if (zmogus.getKiekis() < 1000) {
				System.out.println("Darbuotojas: " + zmogus.getDarbininkas() + ", detale:" + zmogus.getDetale() + " ,");
			} else {
				System.out.println("Darbuotojas: " + zmogus.getDarbininkas() + ", detale:" + zmogus.getDetale());
			}
			if (zmogus.getKaina() > 100)
				norma.remove();
		}
		System.out.println("-------------------");
		System.out.println("Detales kaina nevirsija 100eur.");
		System.out.println(sarasas);
	}
}
