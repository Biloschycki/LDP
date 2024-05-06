package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("R$ ##0.00");
		
		String resp="sim";
		int contador=0, qtdItens=0, cp=0;
		double pe=0, total=0;
		//Repetição compras
		while (resp.equalsIgnoreCase("sim")){
			
			contador++;
			System.out.println(contador+"° COMPRA");
			//Zerar variáveis
			total=0;
			qtdItens=0;
			
			//Items da compra
			System.out.println("Digite o preço da etiqueta:");
			pe=entrada.nextDouble();
			while(pe!=0){
				total+=pe;
				qtdItens++;
				System.out.println("Digite o preço da etiqueta:");
				pe=entrada.nextDouble();
			}// while pe 
			//..........................................................................................................................................//
			System.out.println("Total da compra:"+fm.format(total));
			
			System.out.println("Quantidade de Itens:"+qtdItens);
			
			//Forma de pagamento
			System.out.println("Digite a forma de pagamento:");
			cp=entrada.nextInt();
			
			while(cp>4) {
				System.out.println("Digite a forma de pagamento 1/2/3/4");
				cp=entrada.nextInt();
			}
			if(cp==1) {
				System.out.println("Valor Final"+fm.format(total*0.9));
			}else if(cp==2) {
				System.out.println("Valor Final"+fm.format(total*0.95));
			}else if (cp==3) {
				System.out.println("Valor Final"+fm.format(total/2));
			}else {
				System.out.println("Valor Final"+fm.format((total*1.10)/3));
			}
			
			System.out.println("Deseja cadastrar nova compra?");
			resp=entrada.next();
			
		}//
		
	}//main

}//class
