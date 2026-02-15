/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2_14_02_26;

import Paquete1.Cliente;
import Paquete1.Producto;

import java.math.BigDecimal;

/**
 *
 * @author Jonatan and Gabo
 */
public class Clase2_14_02_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente=new Cliente();
        cliente.codigo=2;
        cliente.dpi="45621779";
        cliente.edad=20;
        cliente.nombre="Pedro";
        
        System.out.println("Codigo: "+cliente.codigo);
        System.out.println("Nombre: "+cliente.nombre);
        System.out.println("Edad: "+cliente.edad);
        System.out.println("Dpi: "+cliente.dpi);
        
        Carro carro=new Carro();
        carro.codigo=2;
        carro.marca="toyota";
        carro.modelo="2026";
        carro.precio=new BigDecimal(200000);
        
        System.out.println("Carro");
        System.out.println("Codigo: "+carro.codigo);
        System.out.println("Marca: "+carro.marca);
        System.out.println("Modelo: "+carro.modelo);
        System.out.println("Precio: "+carro.precio);
        
        Moto moto=new Moto();
        moto.codigo=1;
        moto.marca="kawasaki";
        moto.modelo="2025";
        
        System.out.println("Moto");
        System.out.println("Codigo: "+moto.codigo);
        System.out.println("Marca: "+moto.marca);
        System.out.println("Modelo: "+moto.modelo);
        
        Producto producto=new Producto();
        producto.setCodigo(1);
        producto.setNombre("Monitor");
        producto.setPrecio(new BigDecimal (40000));
        
        System.out.println("+++++++++++++++Producto++++++++++++++++");
        System.out.println("Codigo: "+producto.getCodigo());
        System.out.println("Nombre: "+producto.getNombre());
        System.out.println("Precio: "+producto.getPrecio());
  
        
        
    }
    
}
