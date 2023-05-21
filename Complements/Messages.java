package Complements;

public class Messages {
    // Se crean metodos para los diferentes mensajes, estos metodos van a ser
    // utilizados la mayoria de veces por la clase Scanner

/////////////////////////////////////////////////
    //Saludos
    // Bienvenido al sistema
    public static void welcomeMessage(){
        System.out.println("Bienvenido al sistema de compras");
    }
    
    // Despedida el sistema
    public static void farewellMessage(){
        System.out.println("Tenga un buen dia hasta la proxima");
    }
/////////////////////////////////////////////////

//Producto
    //sirve para añadir un producto 
    public static void productAdded() {
            System.out.println("Producto agregado");
        }

/////////////////////////////////////////////////
// Persona
    //sirve para pedir el nombre
    public static void requestName() {
        System.out.print("Ingresa tu nombre por favor: ");
    }

    //sirve para pedir el id
    public static void requestId() {
        System.out.print("Ingresa su Id: ");
    }

    //sirve para pedir el telefono
    public static void requestPhone() {
        System.out.print("Ingresa su numero de teléfono: ");
    }

    //sirve pa pedir la direccion
    public static void requestAddress() {
        System.out.print("Ingresa su dirección: ");
    }

    //sirve para pedir el correo
    public static void requestEmail() {
        System.out.print("Ingresa su correo: ");
    }

/////////////////////////////////////////////////
//Errores
    //mensaje general de error
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

   //Adicionales
}
