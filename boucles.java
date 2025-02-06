package fr.espoir.essai;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
    //Exemple 1
   String nom = "ESPOIR,Janna,rose,pain";
   String[] noms = nom.split(",");
   for (String str : noms) {
	   System.out.println(str);

   //Exemple 2
   int[] notes = {16, 7, 0, 2};
   int calcul = 0;
   for (int note : notes) {
	   calcul += note;
   }
   System.out.println("la moyenne des notes est " + (calcul / notes.length));
	
   }
//Boucle infinie
 for (;;) {
	 System.out.println("Salut");

}
//while
 int i = 0;
 while(i != 50) {
	 i++;
	 System.out.println("Salut");
	 

	}
}


   
