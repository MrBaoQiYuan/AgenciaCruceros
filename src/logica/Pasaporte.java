package logica;

import java.time.LocalDate;
import java.util.Scanner;

public class Pasaporte {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private String numPasaporte;
    private String nombreApellidos; 
    private String nacionalidad; 
    private String sexo;
    private String lugarNacimiento; 
    private LocalDate fechaExpedicion; 
    private LocalDate fechaCaducidad; 
    private String codigoSeguridad; 

    public Pasaporte(String numPasaporte, String nombreApellidos, String nacionalidad, String sexo, String lugarNacimiento, LocalDate fechaExpedicion, LocalDate fechaCaducidad, String codigoSeguridad) {
        this.numPasaporte = numPasaporte;
        this.nombreApellidos = nombreApellidos;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaCaducidad = fechaCaducidad;
        this.codigoSeguridad = codigoSeguridad;
    }

    Pasaporte() {
    }

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public LocalDate  getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate  fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate  getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate  fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numPasaporte=" + numPasaporte + ", nombreApellidos=" + nombreApellidos + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + ", lugarNacimiento=" + lugarNacimiento + ", fechaExpedicion=" + fechaExpedicion + ", fechaCaducidad=" + fechaCaducidad + ", codigoSeguridad=" + codigoSeguridad + '}';
    }


    
    
    
}
