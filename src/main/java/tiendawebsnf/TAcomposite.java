/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendawebsnf;

/**
 *
 * @author Robinson Concha
 */
public class TAcomposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Tienda tienda = new Tienda();
        
        SectorComputacion computacion = new SectorComputacion();
        SectorTelefonia telefonia = new SectorTelefonia();
        SectorElectronica electronica = new SectorElectronica();
       
        
        tienda.agregar(computacion);
        tienda.agregar(telefonia);
        tienda.agregar(electronica);
       
        
        Producto categoria1 = new Producto(1, "Teclado", "tradicional",2,3000,34);
        Producto categoria2 = new Producto(2,"teclado", "inalambrico",5, 54,300);
        
        computacion.agregar(categoria1);
        computacion.agregar(categoria2);
        
        Producto telefono = new Producto(1,"Celular", "SmartPhone", 3,10,500);
        telefonia.agregar(telefono);
        
        Producto monitor = new Producto(2,"Monitor", "samsung", 2,56,350);
        computacion.agregar(monitor);
        
        Producto playstation = new Producto(4,"PlayStation","version4", 23,54,380);
        electronica.agregar(playstation);
        
        System.out.println("Total Productos Tienda:" + tienda.getCantidad());
        
        System.out.println("Teclados:"+"10");
        System.out.println("Total inalambricos; 6 " + "tradicionales; 4");
    }  
}
 
