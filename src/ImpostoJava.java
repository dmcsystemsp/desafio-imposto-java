import java.util.Locale;
import java.util.Scanner;

public class ImpostoJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaSalario,rendaServicos,rendaGC,gastosMedicos,gastosEducaionais;
		double salario,taxaImposto,irSalario,irServicos,irGC;
		double deducoes,impostoBrutoTotal,maximoDedutivel,abatimentos,impostoDevido;
		
		System.out.print("Renda Anual com Salário: ");
		rendaSalario = sc.nextDouble();
		
		System.out.print("Renda Anual com Prestação de Serviçs: ");
		rendaServicos = sc.nextDouble();
		
		System.out.print("Renda Anual com Ganho de Capital: ");
		rendaGC = sc.nextDouble();
		
		System.out.print("Gastos Médicos: " );
		gastosMedicos = sc.nextDouble();
		
		System.out.print("Gastos Educacionais: " );
		gastosEducaionais = sc.nextDouble();
		
		salario = rendaSalario / 12;
		
		if (salario < 3000.0) {
			taxaImposto = 0.0;
		}else if(salario < 5000.0) {
			taxaImposto = 10.0;
		}else {
			taxaImposto = 20.0;
		}
		
		irSalario = rendaSalario * taxaImposto / 100;
		irServicos = rendaServicos * 0.15;
		irGC = rendaGC * 0.20;
		deducoes = gastosMedicos + gastosEducaionais;
		impostoBrutoTotal = irSalario + irServicos + irGC;
		maximoDedutivel = impostoBrutoTotal * 0.3;
		
		if(deducoes < maximoDedutivel) {
			abatimentos = deducoes;
		}else {
			abatimentos = maximoDedutivel;
		}
		impostoDevido = impostoBrutoTotal - abatimentos;
		
		
		
		System.out.println("");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("");
		System.out.println("CONSOLIDADO DE RENDA");
		System.out.printf("Imposto sobre Salário.........: %.2f%n", irSalario);
		System.out.printf("Imposto sobre Servicçs........: %.2f%n", irServicos);
		System.out.printf("Imposto sobre Ganho de Capital: %.2f%n", irGC);
		
		System.out.println("");
		System.out.println("DEDUÇÕES");
		System.out.printf("Máximo Dedutível..............: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos Dedutíveis.............: %.2f%n", deducoes);
		
		System.out.println("");
		System.out.println("RESUMO");
		System.out.printf("Imposto Bruto Total...........: %.2f%n", impostoBrutoTotal);
		System.out.printf("Abatimentos...................: %.2f%n", abatimentos);
		System.out.printf("Imposto Devido................: %.2f%n", impostoDevido);
		
		
		
		sc.close();

	}

}
