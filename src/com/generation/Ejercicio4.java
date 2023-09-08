
//Se agrego el archivo a un proyecto

package com.generation;
// importamos scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
	    String j1 = s.nextLine();
	    
	    Scanner s2 = new Scanner(System.in); // agregamos el system.in de scanner
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
	    String j2 = s2.nextLine();
	    
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	    	
	      int g = 2;
	      
	      switch(j1) {
	      
	        case "piedra":
	          if (j2.equals("tijeras")) { //agregamos equals en vez de ==
	            g = 1;
	          }
	          break;

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          } // hacia falta llave de cierre
	          break;
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	      s.close();
	      s2.close(); // cerramos scanner
	    }

	}

}
