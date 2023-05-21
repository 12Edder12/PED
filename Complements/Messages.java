package Complements;

public class Messages {
    // Se crean metodos para los diferentes mensajes, estos metodos van a ser
    // utilizados la mayoria de veces por la clase Scanner
    public static void requestName() {
        System.out.print("Ingresa tu nombre por favor: a ");
    }

    public static void errorMessage() {
        System.out.println("Ups algo ha salido mal!");
    }

    public static void updateProductOptions() {
        System.out.print("1.Nombre \n 2.Precio Unitario \n Ingresa tu opcion: ");
    }

    public static void requestProductName() {
        System.out.print("Ingresa el nombre del producto: ");
    }

    public static void requestProductPriceByUnit() {
        System.out.print("Ingresa el precio del producto: ");
    }

    public static void switchDefaultMessage() {
        System.out.println("La opcion ingresada no es valida");
    }

   //9 a 
}
