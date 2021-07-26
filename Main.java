import java.util.Scanner;
public class Main
{
	static void  mensagemSistema(){
	    System.out.println(" ====CONTROLE DE BANCO DE HORAS e HORA EXTRA====");
	}
	
	static void totalHoras(){
	    System.out.println("====ACUMULADO DE HORAS (BANCO DE HORAS + HORAS EXTRAS)====");
	}
	static void totalBanco(){
	    System.out.println("====TOTAL BANCO DE HORAS=====");
	}
	
	static void totalHoraExtra(){
	    System.out.println("====TOTAL DE HORA EXTRA TRABALHADA====");
	    
	}
	
	public static void main(String[] args) {
       mensagemSistema();
System.out.println("JORNADA DE TRABALHO NORMAL DA EMPRESA: 8 HORAS.");
	Scanner sc = new Scanner (System.in);
	Scanner leitor = new Scanner (System.in);
	
	int qtd=0;
	
	System.out.println(" digite a quantidade de funcionarios que voce deseja cadastrar");
	qtd = leitor.nextInt();
	
	String[] funcionarios = new String[qtd];
	float [] horasTrabalhadas =  new float[qtd];
	
	int i=0;
	float bancoHoras=0;
	float horasNormais=8;
	float hora=0;
	float horaExtra=0;
	float somaHoras=0;
	float somaExtra=0;
	float somaHoras1=0;
	
	
	for(i=0; i<qtd; i++){
	    System.out.println("digite o nome do funcionario:");
	    funcionarios[i] = sc.nextLine();
	}
	    for( i=0; i<qtd; i++){
	        System.out.println("informe as horas trabalhadas por " + funcionarios[i]);
	       horasTrabalhadas[i] = sc.nextFloat();
	   
	    }	
	    for(i=0; i<qtd; i++){
	    	for(i=0; i<qtd; i++){

bancoHoras = (horasTrabalhadas[i] - horasNormais);

if(horasTrabalhadas[i]>8&&horasTrabalhadas[i]<=10){
    somaHoras = somaHoras+bancoHoras;
   System.out.println("__"+funcionarios[i]+ " fez "+ bancoHoras+ " horas de Banco de horas sem horas extras!!!");
       }
if(horasTrabalhadas[i]>10){
	    horaExtra = horasTrabalhadas[i]-10;
	    somaExtra = somaExtra+horaExtra;
	    somaHoras1 = somaHoras1+bancoHoras;
	       System.out.println("__"+funcionarios[i] + " fez "+ bancoHoras + " horas excedendo as duas horas de banco de horas,gerando "+ horaExtra + " hora extra");
	   }
if(horasTrabalhadas[i]==horasNormais){
	       System.out.println("__"+funcionarios[i] + " nÃ£o realizou banco de horas!");
	   }
	 }
   }
	    

System.out.println("______________________________________________________________________");

	totalHoras();
	
System.out.println((somaHoras+somaHoras1) + " horas");
System.out.println("______________________________________________________________________");
System.out.println("______________________________________________________________________");
System.out.println();
	totalHoraExtra();
	
System.out.println(somaExtra+ " horas ");
System.out.println("______________________________________________________________________");
System.out.println("______________________________________________________________________");

totalBanco();
System.out.println((somaHoras+somaHoras1)-somaExtra+" horas");

 	}
   }    
 







