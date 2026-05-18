package Recuperación;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ofuscado.Cubo;

public class Main {
	
	   private static List<Esfera> listaDeEsferas = new ArrayList<>();
	   
	   public static void main(String[] args) {  
		   
	        System.out.println("--- Esfera 1 ---");
	        Esfera e1 = new Esfera(0, 0, 0);
	        e1.solicitarRadio();
	        e1.calcularArea();
	        e1.imprimirArea();
	        e1.calcularVolumen();
	        e1.imprimirVolumen();

	        System.out.println("\n--- Esfera 2 ---");
	        Esfera e2 = new Esfera(0, 0, 0);
	        e2.solicitarRadio();
	        e2.calcularArea();
	        e2.imprimirArea();
	        e2.calcularVolumen();
	        e2.imprimirVolumen();
	        
	        System.out.println("\n--- Esfera 3 ---");
	        Esfera e3 = new Esfera(0, 0, 0);
	        e3.solicitarRadio();
	        e3.calcularArea();
	        e3.imprimirArea();
	        e3.calcularVolumen();
	        e3.imprimirVolumen();
	        
	        System.out.println("\n--- Esfera 4 ---");
	        Esfera e4 = new Esfera(0, 0, 0);
	        e4.solicitarRadio();
	        e4.calcularArea();
	        e4.imprimirArea();
	        e4.calcularVolumen();
	        e4.imprimirVolumen(); 
	        
	    }
	 
	   public void ordenarPorTamaño() {
		    Collections.sort(listaDeEsferas);
		    }
	   
	   
	 
	}