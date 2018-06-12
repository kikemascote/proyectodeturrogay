/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.Producto;
import app.Registro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arturo
 */
public class Pruebas {
    
    @Test
    public void Pruebas() {
        
        Registro r = new Registro();
        
        // nombreProducto , desc , stock , max , min
        
        //Se crea un producto nuevo
        Producto p = new Producto("Gerber", "Comida de bebes" , 5, 10, 80.0, 15.0);
        
        //Aniadimos un nuevo producto al registro
        r.nuevoProducto(p);
        
        //Decimos que tenemos una registro de tamanio 1
        assertEquals(1,r.getLista().size() );
        
        //Buscamos el produsco
        assertNotNull(r.buscar("Gerber"));
        System.out.println(r.buscar("Gerber").getNombre());
        System.out.println("");
        
        //Eliminamos un producto del registro
        r.eliminarProducto(p);
        
        //Decimos que tenemos un registor de tamanio 0
        assertEquals(0,r.getLista().size() );
        
        //Se crea un producto nuevo
        Producto p1 = new Producto("Leche Lala", "Lache!" ,10, 25, 80.0, 15.0);
        
        System.out.println(p1.getNombre());
        System.out.println(p1.getDescripcion());
        System.out.println(p1.getStock());
        System.out.println(p1.getInvMaximo());
        
        //Se agrega el nuevo producto al registro.
        r.nuevoProducto(p1);
        
        //Actualizamos los parametros de nuestro producto
        r.actualizarProducto("Leche Lala", "Leche Zaragoza", "Mas lache!" ,30, 80.0, 15.0);
        
        System.out.println(p1.getNombre());
        System.out.println(p1.getDescripcion());
        System.out.println(p1.getStock());
        System.out.println(p1.getInvMaximo());
        
        //Borro el nuevo producto actualizado
        r.eliminarProducto(p1);
        
        //Busco el producto que elimine, y efectivamente NO esta.
        assertNull(r.buscar("Leche Zaragoza"));
        
        //Decimos que tenemos una registro de tamanio 0
        assertEquals(0,r.getLista().size() );
        
        //Creamos un nuevo producto
        Producto p2 = new Producto("Sabritas", "A que no puedes comer solo 1!" ,20, 50, 80.0, 15.0);
        
        //Agrego el nuevo producto
        r.nuevoProducto(p2);
        
        //Busco el producto
        assertNotNull(r.buscar("Sabritas"));
        
        //Agrego mas prodcuto a mi stock de sabritas.
        r.masProducto("Sabritas", 10);
        
        //Confirmo que mi nuevo stock de sabritas es 30
        assertEquals(p2.getStock(), 30);
        
        //Confirmo que si agrego mas de mi producto maximo permitido, pues no se arma. Tengo 30, maximo 50
        assertFalse( r.masProducto("Sabritas", 30) );
        
        //Confirmo que sigo teniendo 30
        assertEquals(p2.getStock(), 30);
        
        //Resto producto de mi stock
        r.menosProducto("Sabritas", 5);
        
        //Confirmo que tengo 25
        assertEquals(p2.getStock(), 25);
        
        //Confirmo que si resto mas de mi producto minimo permitido, pues no se arma. Tengo 30, minimo 0
        assertFalse( r.menosProducto("Sabritas", 26) );
        
        //Confirmo que tengo 25
        assertEquals(p2.getStock(), 25);
        
        //Resto producto para quedarme con solo 3
        r.menosProducto("Sabritas", 22);
        
        //Tengo 3
        assertEquals(p2.getStock(), 3);
        
        //activar mi dictamen de producto minimo.
        r.regla("Sabritas");
        
        //Tengo producto bajo
        System.out.println(p2.isDictamen());
        System.out.println( "Tengo " +p2.getStock() +" de un maximo permitido de " +p2.getInvMaximo() +", osea un "+p2.getStock() * 100 / p2.getInvMaximo()+"%" );
        assertFalse(p2.isDictamen()); 
    }
    
}
