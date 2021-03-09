/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

/**
 *
 * @author cfpor
 */
public class Ejercicio4 {
     private String nombre;
    private String cedula;
    private String edad;
    
    public Ejercicio4 (){
        
    }

    public Ejercicio4(String n, String c, String e) {
        nombre = n;
        cedula = c;
        edad = e;

    }
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public String getcedula() {
        return cedula;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }
    public String getedad() {
        return edad;

    }

    public void setedad(String edad) {
        this.edad = edad;
    }
}

