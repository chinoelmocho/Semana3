/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA3;

/**
 *
 * @author PC-12
 */
public class LugarMatriculacion {

    String descripcion;
    String telefono;
    String provincia;
    String ciudad;

    public String mostrarInfo() {
        var informacion = ("El lugar donde se realizo la matriculacion es: " + this.descripcion
                + " El numero del propietario es : " + this.telefono + " y la provincia de matriculacion es: "
                + this.provincia + " en la ciudad de " + this.ciudad);
        return informacion;
    }
}
