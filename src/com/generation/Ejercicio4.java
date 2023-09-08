// EL PROGRAMA TRATA DE UN JUEGO DE PIEDRA PAPEL O TIJERAS, SE PIDE AL JUGADOR 1 QUE ELIJA UNA DE ESTA 3 OPCIONES, 
// DESPUES AL JUGADOR 2 Y SE DICE QUIEN GANO

//Se agrego el archivo a un proyecto

package com.generation;
// importamos scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	
		
		Scanner s = new Scanner(System.in); // agregamos el system.in de scanner
		System.out.println("===========================================");
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
			System.out.println("Turno del jugador 1, Elige una Opcion...");
			System.out.println("1.- Piedra");
			System.out.println("2.- Papel");
			System.out.println("3.- Tijeras");
	    int j1 = s.nextInt();
	    
	    System.out.println("===========================================");
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
			System.out.println("Turno del jugador 1, Elige una Opcion...");
			System.out.println("1.- Piedra");
			System.out.println("2.- Papel");
			System.out.println("3.- Tijeras");
	    int j2 = s.nextInt();
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	    	
	      int g = 2;
	      
	      switch(j1) {
	      
	        case 1 :
	          if (j2 == 3) { //agregamos equals en vez de ==
	            g = 1;
	          }
	          break;

	        case 2:
	          if (j2 == 1) {
	            g = 1;
	          } // hacia falta llave de cierre
	          break;
	        case 3:
	          if (j2 == 2 ) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	      s.close();// cerramos scanner
	    }

	}

}
