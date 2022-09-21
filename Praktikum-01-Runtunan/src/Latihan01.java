import java.util.Scanner;

public class Latihan01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan suhu = ");

		int celcius = input.nextInt();

		int fahrenheit = convertToFahrenheit(celcius);
		int rheamur = convertToRheamur(celcius);
		int kelvin = convertToKelvin(celcius);

		input.close();

		System.out.println("Suhu yang akan dikonversi " + celcius + " derajat.");
		System.out.println("Hasil konversi");
		System.out.println("==================================================");
		System.out.println("Celcius ke Fahrenheit = " + fahrenheit);
		System.out.println("Celcius ke Reamur = " + rheamur);
		System.out.println("Celcius ke Kelvin = " + kelvin);
	}

	static int convertToFahrenheit(int suhu) {
		int fahrenheit = ((9 / 5) * suhu) + 32;
		return fahrenheit;
	}

	static int convertToRheamur(int suhu) {
		int rheamur = suhu * 4 / 5;
		return rheamur;
	}

	static int convertToKelvin(int suhu) {
		int kelvin = suhu + 273;
		return kelvin;
	}
}

// Zaki Aljabbar - 212310001 - TI-21-KA