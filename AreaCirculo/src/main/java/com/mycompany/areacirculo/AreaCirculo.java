package com.mycompany.areacirculo;

public class AreaCirculo {
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        double radio = 5.0;
        double area = PI * radio * radio;
        
        System.out.println("El área del círculo es: " + area);
    }
}
