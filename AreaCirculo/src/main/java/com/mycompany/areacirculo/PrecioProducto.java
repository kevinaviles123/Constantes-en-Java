package com.mycompany.areacirculo;

public class PrecioProducto {
    public static final double IVA = 0.21;
    
    public static void main(String[] args) {
        double precioSinIva = 100.0;
        double precioConIva = precioSinIva + (precioSinIva * IVA);
        
        System.out.println("El precio con IVA es: " + precioConIva);
    }
}
