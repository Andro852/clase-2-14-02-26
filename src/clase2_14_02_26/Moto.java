/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2_14_02_26;

/**
 *
 * @author Jonatan
 */
public class Moto {
// Las variables de la calse son default
// Solamente son accesibles en el mismo paquete
    
// La diferencia con las protected es que la
// Protected si se puede ver fuera del paquete
// siempre y cuando sea con una subclase
    
    Integer codigo;
    String marca;
    String modelo;

    public Moto(Integer codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Moto() {
    }
    
    
}
