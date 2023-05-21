package Complements;

public class Validations {
// En esta clase tienen que ir todas las validaciones posibles; Ejemplo: validar
    // solo numeros al ingresar numeros de telefono, o no permitir numeros al
    // ingresar un nombre
    public static void main(String[] args) {

        Validations v = new Validations();
        v.validateRUC("4545");

    }

    public boolean validateIDType(String idType) {
        if (!idType.matches("^[01]$")) {
            // mensaje de ID no es valido
            return false;
        }
        return true;
    }

    public boolean validateID(String cedula) {
        if (cedula.equals(null) || cedula.equals("")) {
            // mensaje de vacio
            return false;
        }
        if (!cedula.matches("\\d+")) {
            // mensaje de no son numeros
            return false;
        }
        if (cedula.length() < 10 || cedula.length() > 10) {
            // mensaje de cedula no valida por rango
            return false;
        }

        int[] coefficients = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
        int total = 0;

        try {
            int verifier = Integer.parseInt(cedula.substring(9));
            for (int i = 0; i < 9; i++) {
                int digito = Integer.parseInt(cedula.substring(i, i + 1));
                int producto = digito * coefficients[i];
                if (producto >= 10) {
                    producto -= 9;
                }
                total += producto;
            }

            int residuo = total % 10;
            if ((residuo == 0 && verifier == 0) || (residuo == 10 - verifier)) {

                return true;
            }
        } catch (NumberFormatException e) {
            // mensaje de error
            return false;
        }
        // cedula no valida
        return false;
    }

    public boolean validateRUC(String ruc) {
        if(ruc.equals(null)|| ruc.equals("")){
            //ruc vacio
            return false;
        }
        if (!ruc.matches("\\d+")) {
            // mensaje de no son numeros
            System.out.println("solo numeros");
            return false;
        }
        if ((ruc.length() != 10 && ruc.length() != 13)) {
            // ruc no valido
            return false;
        }

        // Validación para personas naturales
        if (ruc.length() == 10) {
            try {
                int verificador = Integer.parseInt(ruc.substring(9));
                int suma = 0;
                for (int i = 0; i < 9; i++) {
                    int digito = Integer.parseInt(ruc.substring(i, i + 1));
                    suma += digito * (2 + (i % 7));
                }
                int residuo = suma % 11;
                int digitoVerificador = residuo == 0 ? 0 : 11 - residuo;

                return digitoVerificador == verificador;
            } catch (NumberFormatException e) {
                return false;
            }
        }else {
            try {
                Long.parseLong(ruc);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

    }
}
