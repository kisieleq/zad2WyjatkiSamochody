package zad3;

public class Samochod {
	int moc;
	double cena;
	String kolor;
	String nazwa;

	public Samochod(String nazwa,int moc, double cena, String kolor){
		this.nazwa = nazwa;
			this.moc = moc;
			this.cena = cena;
			this.kolor = kolor;
	}
	public double kosztUtrzymania(double koszt){
		return koszt*12;
	}
	public double zuzyciePaliwa(double zuzyciePaliwa){
		return zuzyciePaliwa;
	}
}
