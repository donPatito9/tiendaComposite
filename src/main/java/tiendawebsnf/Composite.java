/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendawebsnf;

import java.util.ArrayList;

/**
 *
 * @author Robinson Concha
 */
    public class Composite implements ICantidad{
    private ArrayList<ICantidad> producto = new ArrayList<ICantidad>();
    
    @Override
    public int getCantidad(){
    int sumador = 0;
    for(int i = 0; i < producto.size();i++){
      sumador = (int) (sumador + producto.get(i).getCantidad());
    }
    return (int) sumador;
    }
    public void agregar(ICantidad c){
    producto.add(c);
    }
}

