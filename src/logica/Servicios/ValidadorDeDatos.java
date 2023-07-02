//metodos staticos 
package logica.Servicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorDeDatos {

    public static boolean validarCaracteresAlfabeticosSpanish(String nombre) {
        return nombre.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+") && !nombre.matches(".\\d.");
    }

    public static boolean validarPasaporte(String pasaporte) {
        Pattern patron = Pattern.compile("^[A-Z]{3}\\d{5}$");
        Matcher matcher = patron.matcher(pasaporte);
        return matcher.matches();
    }

    public static boolean validarSexo(String sexo) {
        return sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("h");
    }

    public static boolean validarCaracteresNumericos(String nombre) {
        return nombre.matches("\\d+");
    }

    public static boolean validarFecha(String fecha) {
        return fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$");
    }

    public static boolean validarCantValijas(String cantValijas) {
        return cantValijas.matches("^[0-2]$");
    }

    public static boolean validarPesoValijas(String pesoValijas) {
        if (validarCaracteresNumericos(pesoValijas)) {
            int pesoValijaUnitaria = Integer.parseInt(pesoValijas);
            return (pesoValijaUnitaria > 0 && pesoValijaUnitaria < 25);
        } else {
            return false;
        }
    }

    public static boolean validarRespuestaSiNo(String equipajeMano) {
        return equipajeMano.matches("^(si|no)$i");
    }
}
