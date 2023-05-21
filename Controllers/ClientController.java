package Controllers;

public class ClientController {

    public boolean validarCedula(String cedula) {
        if (cedula == null || cedula.length() != 10) {
            return false;
        }

        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int total = 0;

        try {
            int verificador = Integer.parseInt(cedula.substring(9));
            for (int i = 0; i < 9; i++) {
                int digito = Integer.parseInt(cedula.substring(i, i + 1));
                int producto = digito * coeficientes[i];
                if (producto >= 10) {
                    producto -= 9;
                }
                total += producto;
            }

            int residuo = total % 10;
            if ((residuo == 0 && verificador == 0) || (residuo == 10 - verificador)) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return false;
    }


}
