package innleveringjava1;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
public class Innlevering1java {

	public static void main(String[] args) {
		//Oyvind Torkjell Instefjord studentnr: 593283
		//7. september 2020
		
		// Oppgave 1
		//Lag eit program som leser inn bruttoinntekt,beregner og skriver ut trinnskatten 
//trinn 1 mellom 180800-254500 1,9% trinnskatt
		//2 mellom 254500-639750 4,2% trinnskatt
		//3 mellom 639750-999550 13,2% trinnskatt
		//4 over 999550 16,2% trinnskatt
		double skatt = 0, inntekt;
		Scanner sc=new Scanner(System.in);
		System.out.println("skriv inn inntekt");
		inntekt=sc.nextDouble();
		if(inntekt<=180800) {
			skatt=0;
		}	
		else if((inntekt>=180801)&&(inntekt<=254500)) {
			skatt = 0.019 * (inntekt);
		}
		else if((inntekt>=254501)&&(inntekt<=639750)) {
		    skatt = 0.042 * (inntekt);
		}
		else if((inntekt>=639751)&&(inntekt<=999550)) {
			skatt = 0.132 * (inntekt);
		}
		else if(inntekt>=999551) {
			skatt = 0.162 * (inntekt);
		}
		System.out.println("skatten er på " + skatt + " kr");
		//Oppgave 2
		//Lag et program som leser inn en poengsum (heltall) som en student har oppnaadd på en prove,
		//og finn og skriv ut den karakteren A-F dette tilsvarer.

for (int studentnr = 1; studentnr <= 10; studentnr++) {
		int poeng = Integer.parseInt(showInputDialog("skriv inn poengsum:"));
		char karakter =' ';
		if(poeng <= 39) {
			karakter = 'F';
			showMessageDialog(null, "med " + poeng + " poeng får du karakteren " + karakter);
		}
		else if ((poeng>= 40)&&(poeng<=49)) {
			karakter = 'E';
			showMessageDialog(null, "med " + poeng + " poeng får du karakteren " + karakter);
		}
		else if ((poeng>=50)&&(poeng<=59)) {
			karakter = 'D';
			showMessageDialog(null, "med " + poeng + " poeng får du karakteren " + karakter);
		}
		else if ((poeng>=60)&&(poeng<=79)) {
			karakter = 'C';
			showMessageDialog(null, "med " + poeng + " poeng får du karakteren " + karakter);
		}
		else if ((poeng>=80)&&(poeng<=89)) {
			karakter = 'B';
			showMessageDialog(null, "med " + poeng + " poeng får du karakteren " + karakter);
		}
		else if ((poeng>=90)&&(poeng<=100)) {
			karakter = 'A';
			showMessageDialog(null, "med " + poeng + " poeng får du karakteren " + karakter);
		}
		else if (poeng < 0||poeng > 100) {
			showMessageDialog(null, "Feilmelding, Ugyldig poengsum");
		}
}
		//oppgave 3 
		//Lag et program som leser inn et heltall n > 0,
		//beregner verdien n! (n fakultet) og skriver verdien til 
		//n! der n! = 1\*2\*3\*…\*(n-1)\*n.
		int n = 
		Integer.parseInt(showInputDialog("skriv inn eit positivt heiltal:"));
		int svar = 1;
		
		if (n>0) {
			for (int i = 1; i <= n; i++) {
				svar = svar * i;
			}
			showMessageDialog(null, svar);
		}
		else {
			showMessageDialog(null, "Tallet du skreiv inn kan ikkje vere negatvt.");
		}
		
	}

	

}
