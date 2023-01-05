package imc;
import java.util.Scanner;

public class testeImc {

	public static void main(String[] args) {
		
		double peso;
		double altura;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe o seu peso");
		peso = ler.nextDouble();
		System.out.println("Informe a sua altura!");
		altura = ler.nextDouble();
		
		double imc;
		imc = peso / (altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		}else if(imc >= 18.6 && imc <= 24.9) {
			System.out.println("Você está no peso ideal.");
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Você está acima do peso.");
		}else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Você está obeso grau 1.");
		}else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Você está obeso grau 2.");
		}else {
			System.out.println("Você está obeso grau 3.");
		}
		System.out.println("Seu IMC é:" + imc);
	}

}
