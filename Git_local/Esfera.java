package Recuperación;

import java.util.Scanner;

public class Esfera implements Comparable<Esfera>{
	
	private static final double PI = 3.141592653589793;
	
	double volumen;
	double radio;
	double area;
	
	
	public Esfera(double volumen, double radio, double area) {
		super();
		this.volumen = volumen;
		this.radio = radio;
		this.area = area;
	}


	public double getVolumen() {
		return volumen;
	}


	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	public double calcularArea() {
        this.area = 4 * PI * (radio * radio);
        return this.area;
    }
	
	public double calcularVolumen() {
		this.volumen = (4 * PI * (radio * radio * radio))/3;
		return this.volumen;
    }
	
	public void solicitarRadio() {
	        Scanner tec = new Scanner(System.in);
	        try {
	            System.out.print("Introduce el radio de la esfera: ");
	            this.radio = tec.nextDouble();
	        } catch (Exception e) {
	            System.out.println("Error: Entrada no válida.");
	            tec.next(); 
	        }
	    }
	
	
	public void imprimirVolumen() {
        System.out.println("El volumen del cilindro es: " + this.volumen);
    }

    public void imprimirArea() {
        System.out.println("El área total del cilindro es: " + this.area);
    }
    
    @Override
    public int compareTo(Esfera o) {
        return Double.compare(this.volumen, o.volumen);
    }

}
