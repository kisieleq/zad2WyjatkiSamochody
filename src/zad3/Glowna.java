package zad3;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Glowna {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Samochod> samochody = new ArrayList();
		
		
		addCars(samochody);
		save("samochody.txt", samochody);
						  	   	
	}
	
	public static void addCars(List<Samochod> samochody)
	{
		int liczbaSamochodow;
		int moc;
		double cena;
		String kolor;
		String nazwa;

		Scanner odczyt = new Scanner(System.in);
		System.out.println("Ile samochodów chcesz dodaæ?");
		liczbaSamochodow = Integer.parseInt(odczyt.nextLine());
		
		

		
		
		for(int i=0;i<liczbaSamochodow;i++){
			System.out.println("Nazwa auta: ");
			nazwa = odczyt.nextLine();
			
			System.out.println("Cena Samochodu: ");
			
			cena = Integer.parseInt(odczyt.nextLine());
			
			System.out.println("Moc: ");
			moc = Integer.parseInt(odczyt.nextLine());
			
			System.out.println("Kolor: ");
			kolor = odczyt.nextLine();
			
			Samochod samochod = new Samochod(nazwa, moc, cena, kolor);
			samochody.add(samochod);
						
		}
	}
	
	public static void save(String fileName, List<Samochod> samochody) throws FileNotFoundException {
	    PrintWriter zapis = new PrintWriter(new FileOutputStream(fileName));
	for(Samochod samochod : samochody){
			
			zapis.println(samochod.nazwa);
			zapis.println(samochod.cena);
			zapis.println(samochod.moc);
			zapis.println(samochod.kolor);
		}
		  zapis.close();
	}

	
	 static int generuj(String s) throws DivException 
		{
			try 
			{
				if (s.equals("dzielenie")) 
				{
					int i = 0;
					return i/i;
				}
				
				return 0;
			} 
			finally 
			{
				System.out.println("\n[wygeneruj(\"" + s +"\") zakonczone]");
			}
		}
}





class DivException extends Exception 
{
	int nrBledu;
	DivException() 
	{ this("");
	this.nrBledu=500;}

	DivException(String s) 
	{ 
		super("\n***\n\tNic sie nie stalo to tylko: " + "NaszWyjatek\n***\n\t"+s); 
	}
}
