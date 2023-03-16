package ej4;

import java.util.Scanner;



public class RaicesApp {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora de raíces de ecuaciones de segundo grado");
        System.out.println("Introduce los coeficientes (ecuación en la forma a*x^2 + b*x + c = 0)");
        
        System.out.print("a = ");
        
        double a = Double.parseDouble(sc.nextLine());
        
        System.out.print("b = ");
        
        double b = Double.parseDouble(sc.nextLine());
        
        System.out.print("c = ");
        double c = Double.parseDouble(sc.nextLine());
        sc.close();
        
        Raices raices = new Raices(a,b,c);
        raices.calcular();
    }
}

