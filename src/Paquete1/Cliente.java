/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Jonatan and Gabo
 */
public class Cliente {
// Las variables private dentro de la clase
// Solamente puede ser visibles de la misma clase
// No tien acceso al exterior
    public Integer codigo;
    public String nombre;
    public Integer edad;
    public String dpi;

    public Cliente(Integer codigo, String nombre, Integer edad, String dpi) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.dpi = dpi;
    }

    public Cliente() {
    }
    
        
}
