package ejemplo;
import java.util.Scanner;
public class PracticaVc {       
	public static void main(String[]args) {
	Scanner naigel=new Scanner(System.in);
	int ado=0;
	int yarla=0;
	System.out.println("Digite un numero entero positivo");
	ado=naigel.nextInt();
	
	for(int nana=0;nana<ado;nana++){
	    if((ado%2)==0){
	        yarla+=nana;
	    }
	
	}
	if(yarla==ado){
	    System.out.print("Es Perfecto");
	
	}else{
	    System.out.println("No Es Perfecto");
	}
	
	}
}
