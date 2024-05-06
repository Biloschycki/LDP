package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("R$ ##0.00");
		
		double precoCar=0, total=0,perc=3;
		
		System.out.println("Digite o preço do carro:");
		precoCar=entrada.nextDouble();
		
		System.out.println("Preço do carro com o desconto:"
		+fm.format(precoCar*0.80));
		//b)parcelado
		for( int parcela=0; parcela<66;parcela+=6) {
			total=precoCar + (precoCar * perc/100);
			System.out.println("O preço final parcelado"+ parcela
					+"X é de"+fm.format(total)+"com parcelas de "+
					fm.format(total/parcela));
			perc+=3;
		}
		
		
		
		
		
		
		
		
	
		

	}//main

}//class
