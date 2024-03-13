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
public class Producto implements ICantidad{
     private int id;
     private String nombre,categoria;
     private int cantidad,total, precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto(int id, String nombre, String categoria, int cantidad, int total, int precio) {
       setId(id);
        setNombre(nombre);
        setCategoria(categoria);
        setCantidad(cantidad);
        setTotal(total);
        setPrecio(precio);
    }  
}
